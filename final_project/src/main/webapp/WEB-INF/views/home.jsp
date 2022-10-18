<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<!-- 글로벌 css -->
<link rel="stylesheet" href="/resources/css/global.css">
<link rel="stylesheet" href="/resources/css/home.css">

<title>홈</title>

</head>

<body>
	<div class="homeContainer">
		
		<div class="homeTop">
			<div class="idDiv">
				
					<c:if test="${sessionScope.login_id ne null}">
						<span class="loginNameSpan"> ${sessionScope.login_id }</span>
						님 환영합니다.
					</c:if>
					
					
				
			</div>
			<div class="menuDiv">
				<c:if test="${sessionScope.login_id ne null}">
					<a href="login" class="noneClass">로그인</a>
					<a id="logOutBtn" >로그아웃</a>
				</c:if>
				<c:if test="${sessionScope.login_id eq null}">
					<a href="login">로그인</a>
					<a class="noneClass" id="logOutBtn">로그아웃</a>
				</c:if>

				<a href="agree">회원가입</a>
			</div>

		</div>

		<div class="homeMain">
			<div class="shopDiv">
				<img alt="" src="/resources/img/bg-img1.jpg">
				<h1>쇼핑몰</h1>
			</div>
			<div class="communityDiv">
				<img alt="" src="/resources/img/bg-img2.jpg">
				<h1>커뮤니티</h1>
			</div>

			<!-- <a href="map">지도 테스트</a> -->

		</div>
	</div>




	<script src="/resources/js/home.js"></script>
</body>
</html>