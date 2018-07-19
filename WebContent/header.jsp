<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<header>
	<div id="header_container" class="cf">
		<div class="logo">
			<s:form action="HomeAction">
				<a href="HomeAction"><img src="images/logo.jpg"></a>
			</s:form>
		</div>
		<div class="header_menu">
		<!-- ログアウト状態 -->
		<s:if test="#session.logined == 0">
			<ul>
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
					<s:form action="GoLoginAction">
						<input type="submit" value="ログイン" class="login">
						<a href="GologinAction"></a>
					</s:form>
				</li>
			</ul>
		</s:if>

		<!-- ログイン状態-->

			<s:if test="#session.logined == 1">
				<!-- 一般ユーザー向け -->
				<ul>
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
					<s:form action="AdminProductAction">
						<input type="submit" value="管理者" class="login">
					</s:form>
				</li>
				</s:else>


				<!-- ログイン状態　共通 -->
				<li>
					<s:form action="LogoutAction">
					<input type="submit" value="ログアウト" class="logout">
					</s:form>
				</li>
			</ul>
			</s:if>
		</div>
	</div>
</header>