<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" href="/sinabro/css/main.css"/>
<html>
<head>
<body>
<div id="wrapper">
<div id="headerLogo">
<a href="/sinabro/hi.do">SinaBro</a><br/>
<label>Will steal ur wallet, hommy</label>
</div>
<br/>
<div id="topMenuwrap">
<c:if test="${sessionScope.loginId eq null}">

<ul id="topMenu">
<li><a href="/sinabro/loginForm.do"/> LOGIN</li>
<li><a href="/sinabro/policy.do"/> JOIN</li>
<li><a href="/sinabro/list.do"/>Board</li>
<li><a href="#"/>SHOP</li>
</ul>

</c:if>
<c:if test="${sessionScope.loginId ne null}">

<ul id="topMenu">
<li><a href="#"/>${sessionScope.loginName}</li>
<li>${sessionScope.point}</li>
<li><a href="/sinabro/cart.do"/>Cart</li>
<li><a href="/sinabro/logout.do"/>LOG OUT</li>

<li><a href="#"/>MY ORDER</li>
</ul>

</c:if>
</div>
</div>
</body>
</head>
</html>