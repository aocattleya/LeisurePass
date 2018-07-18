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
				<s:if test="#session.logined == 0">
					<li>
						<div class="login">
							<s:form action="GoLoginAction">
								<input type="submit" value="ログイン" class="login">
								<a href="GologinAction"></a>
							</s:form>
						</div>
					</li>
				</s:if>

				<s:if test="#session.logined == 1">
					<li><s:if test="#session.userInfo.status == 1">
							<s:form action="GoAdminAction">
								<s:submit value="管理者" />
							</s:form>
						</s:if> <s:else>
							<div class="mypage">
								<s:form action="MyPageAction">
							マイページ
							</s:form>
							</div>
						</s:else></li>
					<li><s:property value="%{#session.logined}" /></li>


						<<div class="logout">
						<s:form action="LogoutAction">
							<input type="submit" value="ログアウト" class="logout">
							<a href="LogoutAction"></a>
						</s:form>
					</div>

				</s:if>
			</ul>
		</div>
	</div>
</header>