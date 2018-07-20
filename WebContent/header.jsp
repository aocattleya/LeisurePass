<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<header>
<script type="text/javascript">
var sessionTimeout = function(){
	location.href = "TimeoutAction";
}
setTimeout(sessionTimeout, 1800000);
</script>
	<div id="header-container" class="cf">
		<div class="logo">
			<a href="HomeAction"><img src="images/logo.jpg"></a>
		</div>
		<ul class="header-menu">
			<!-- ログアウト状態 -->
			<s:if test="#session.logined == 0">

				<li>
					<div class="ticket menu-button">
						<img src="images/ticket.jpg">
						<a href="ProductListAction"></a>
					</div>
				</li>
				<li>
					<div class="cart menu-button">
						<img src="images/cart.jpg">
						<a href="CartAction"></a>
					</div>
				</li>
				<li>
					<div class="login menu-button">
						<p>ログイン<p>
						<a href="GoLoginAction"></a>
					</div>
				</li>
			</s:if>

			<!-- ログイン状態-->
			<s:if test="#session.logined == 1">
				<!-- 一般ユーザー向け -->
				<s:if test="#session.userInfo.status == 0">
					<li>
						<div class="ticket menu-button">
							<img src="images/ticket.jpg">
							<a href="ProductListAction"></a>
						</div>
					</li>
					<li>
						<div class="cart menu-button">
							<img src="images/cart.jpg">
							<a href="CartAction"></a>
						</div>
					</li>
					<li>
						<div class="mypage menu-button">
							<img src="images/mypage.jpg">
							<a href="MyPageAction"></a>
						</div>
					</li>
				</s:if>

				<!-- 管理者向け -->
				<s:else>
					<li>
						<div class="login menu-button">
							<p>管理者</p>
							<a href="AdminProductAction"></a>
						</div>
					</li>
				</s:else>

				<!-- ログイン状態 共通 -->
				<li>
					<div class="logout menu-button">
						<p>ログアウト</p>
						<a href="LogoutAction"></a>
					</div>
				</li>
			</s:if>
		</ul>
	</div>
</header>