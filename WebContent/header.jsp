<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<header>
	<div id="header_container" class="cf">
		<div class="logo">
			<s:form action="HomeAction">
				<s:submit value="レジャパス" />
			</s:form>
		</div>
		<div class="header_menu">
			<ul>
				<li>
					<s:form action="ProductListAction">
						<s:submit value="商品一覧" />
					</s:form>
				</li>
				<li>
					<s:form action="CartAction">
						<s:submit value="カート" />
					</s:form>
				</li>
				<s:if test="#session.logined == 0">
					<li>
						<s:form action="GoLoginAction">
							<s:submit value="ログイン" />
						</s:form>
					</li>
				</s:if>
				<s:if test="#session.logined == 1">
					<li>
						<s:form action="MyPageAction">
							<s:submit value="マイページ" />
						</s:form>
					</li>
					<li>
						<s:form action="LogoutAction">
							<s:submit value="ログアウト" />
						</s:form>
					</li>
				</s:if>
			</ul>
		</div>
	</div>
</header>