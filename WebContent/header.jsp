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
					<div class="ticket">
						<a href="ProductListAction"><img src="images/ticket.jpg"></a>
					</div>
				</li>
				<li>
					<div class="cart">
						<a href="CartAction"><img src="images/cart.jpg"></a>
					</div>
				</li>
				<li>
					<div class="login">
						<a href="GoLoginAction">ログイン</a>
					</div>
				</li>
			</s:if>

			<!-- ログイン状態-->
			<s:if test="#session.logined == 1">
				<!-- 一般ユーザー向け -->
				<s:if test="#session.userInfo.status == 0">
					<li>
						<div class="ticket">
							<a href="ProductListAction"><img src="images/ticket.jpg"></a>
						</div>
					</li>
					<li>
						<div class="cart">
							<a href="CartAction"><img src="images/cart.jpg"></a>
						</div>
					</li>
					<li>
						<div class="mypage">
							<a href="MyPageAction"><img src="images/mypage.jpg"></a>
						</div>
					</li>
				</s:if>

				<!-- 管理者向け -->
				<s:else>
					<li>
						<div class="logout">
							<a href="AdminProductAction">管理者</a>
						</div>
					</li>
				</s:else>

				<!-- ログイン状態　共通 -->
				<li>
					<div class="logout">
						<a href="LogoutAction">ログアウト</a>
					</div>
				</li>
			</s:if>
		</ul>
	</div>
</header>