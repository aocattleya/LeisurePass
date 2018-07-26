<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<header>
	<script type="text/javascript">
		var sessionTimeout = function() {
			location.href = "TimeoutAction";
		}
		setTimeout(sessionTimeout, 1800000);
	</script>
	<div id="header-container" class="cf">

		<s:if test="(#session.userInfo.status == 1)">
			<div class="logo">
				<img src="images/logo.jpg">
			</div>
		</s:if>
		<s:else>
			<div class="logo">
				<a href="HomeAction"><img src="images/logo.jpg"></a>
			</div>
			<div class="logoP-clear">
				<a href="HomeAction"><img src="logo/08_p.jpg"></a>
			</div>
			<div class="logoP">
				<a href="HomeAction"><img src="logo/08_p.jpg"></a>
			</div>
		</s:else>


		<div class="header-menu">

			<!-- ログアウト状態 -->
			<s:if test="#session.logined == 0">

				<div class="ticket menu-button">
					<div class="icon">
						<a href="ProductListAction"><img src="images/ticket.jpg"></a>
					</div>
					<div class="message">一覧</div>
				</div>

				<div class="cart menu-button">
					<div class="icon">
						<a href="CartAction"><img src="images/cart.jpg"></a>
					</div>
					<div class="message">カート</div>
				</div>

				<div class="login menu-button">
					<a href="GoLoginAction"><span>ログイン</span> </a>
				</div>

			</s:if>




			<!-- ログイン状態-->
			<s:if test="#session.logined == 1">
				<!-- 一般ユーザー向け -->
				<s:if test="#session.userInfo.status == 0">
					<div class="ticket menu-button">
						<div class="icon">
							<a href="ProductListAction"><img src="images/ticket.jpg"></a>
						</div>
						<div class="message">一覧</div>
					</div>

					<div class="cart menu-button">
						<div class="icon">
							<a href="CartAction"><img src="images/cart.jpg"></a>
						</div>
						<div class="message">カート</div>
					</div>

					<div class="mypage menu-button">
						<div class="icon">
							<a href="MyPageAction"><img src="images/mypage.jpg"></a>
						</div>
						<div class="message">マイページ</div>
					</div>

				</s:if>

				<!-- 管理者向け -->
				<s:else>
					<div class="login menu-button">
						<a href="AdminProductAction"><span>管理者</span> </a>
					</div>

				</s:else>

				<!-- ログイン状態 共通 -->
				<div class="logout menu-button">
					<a href="LogoutAction"><span>ログアウト</span> </a>
				</div>

			</s:if>
		</div>
	</div>
</header>