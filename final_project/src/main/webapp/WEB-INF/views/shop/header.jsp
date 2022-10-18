<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 	<!--쇼핑몰 글로벌 css-->
    <link rel="stylesheet" href="/resources/css/shop/shop_global.css">
    
    <!--쇼핑몰 글로벌 아이콘 cdn-->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/xeicon@2/xeicon.min.css">
<title>Header</title>
</head>
<body>
	 <!--헤더-->
     <header>
        <div class="logo">
           <!--  <a href="/">
            	<h1>Camp<span>ing</span></h1>
            	
            </a> -->
            <h1>Camping</h1>
        </div>
        <div class="menu">
            <a href="/shop">Shop</a>
            <c:if test="${sessionScope.login_auth eq '관리자'}">
            	<a href="/shop/draw_admin">Draw</a>
            </c:if>
             <c:if test="${sessionScope.login_auth eq '회원' || sessionScope.login_auth eq null}">
            	<a href="/shop/draw_customer">Draw</a>
            </c:if>
            <a href="/shop/QnA">Q&A</a>
        </div>
        <div class="login">
            <!-- <a href="">
                <i class="xi-search"></i>
            </a>
            <a href="">
                <i class="xi-truck"></i>
            </a>
            <a href="basket.html">
                <i class="xi-cart"></i>
            </a> -->
            <c:if test="${sessionScope.login_id eq null}">
            	<a href="/login">로그인</a>
	            <a href="/agree">회원가입</a>
	            <a id="loginName" class="noneClass" href="/user">${sessionScope.login_id }님</a>
	            <a id="logOutBtn" class="noneClass">로그아웃</a>
            </c:if>
            <c:if test="${sessionScope.login_id ne null}">
            	<a href="/login" class="noneClass">로그인</a>
	            <a href="/agree" class="noneClass">회원가입</a>
	            <c:if test="${sessionScope.login_auth eq '관리자' }">
	            	<a id="loginName"  href="/admin">${sessionScope.login_id }님</a>
	            </c:if>
	            <c:if test="${sessionScope.login_auth eq '회원' }">
	            	<a id="loginName"  href="/user">${sessionScope.login_id }님</a>
	            </c:if>
	            
	            <a id="logOutBtn" >로그아웃</a>
            </c:if>
	            
            
            
        </div>
    </header>
    
    <script src="/resources/js/shop/header.js"></script>
</body>
</html>