/**
 * home 
 */

'use strict'
//로그아웃 버튼
const logOutBtn = document.querySelector('#logOutBtn');
//쇼핑몰 구역
const shopDiv = document.querySelector('.shopDiv');
//커뮤니티 구역
const communityDiv = document.querySelector('.communityDiv');

// ===============================================================================

logOutBtn.addEventListener('click', doLogOut);
shopDiv.addEventListener('click' , goShop);
communityDiv.addEventListener('click' , goCommunity);



// ===============================================================================

//쇼핑몰 가기
function goShop(){
	location.href = '/shop';
}
//커뮤니티 가기
function goCommunity(){
	location.href = '/community/main';
}
//로그아웃 함수
function doLogOut(){
	const result = confirm('로그아웃 하시겠습니까?');
	if(result){
		location.href = '/logout';
	}
}