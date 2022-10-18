/**
 * shop header 
 */

'use strict'
//로그아웃 버튼
const logOutBtn = document.querySelector('#logOutBtn');
//로고 
const logo = document.querySelector('.logo');

// ===============================================================================

logOutBtn.addEventListener('click' , doLogOut);

logo.addEventListener('click' , goMain);
// ===============================================================================

//메인 화면 이동 함수
function goMain(){
	location.href = '/';
}
//로그아웃 함수
function doLogOut(){
	
	const result = confirm('로그아웃 하시겠습니까?');
	
	if(result == true){
		location.href = '/logout';
	}
}