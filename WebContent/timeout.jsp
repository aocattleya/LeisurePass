<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="refresh" content="4 ;URL='LogoutAction'">
<title>SessionTimeout</title>
<style type="text/css">
body{
	width: 100%;
	counter-reset:number;
}

img{
	margin: 0 auto;
	display: inherit;
}

.type-countdown {
  position: relative;
  height: 100px;
  width: 100%
}

.type-countdown-list {
  counter-increment: number ;
  position: absolute;
  -webkit-animation: countdown 1s;
  margin: auto 0;
  width: 100%;
  opacity:0;
  font-size: 100px;
  font-weight:bold;
  text-align: center;
}

.type-countdown-list:before {
  content: counter(number);
}

.type-countdown-list:nth-child(4) { -webkit-animation-delay: 0s;}
.type-countdown-list:nth-child(3) { -webkit-animation-delay: 1s;}
.type-countdown-list:nth-child(2) { -webkit-animation-delay: 2s;}
.type-countdown-list:nth-child(1) { -webkit-animation-delay: 3s;}

@-webkit-keyframes countdown {

  50% {opacity:1;}
  100% {opacity:0;}
}

</style>
</head>
<body>
<img src="./images/syazai_men.jpg">
<h1 align="center" style="color: red;">30分経過したためページ情報が消滅しました</h1>
<h2 align="center">4秒後ホーム画面に戻ります</h2>


<div class="type-countdown">
    <div class="type-countdown-list"></div>
    <div class="type-countdown-list"></div>
    <div class="type-countdown-list"></div>
    <div class="type-countdown-list"></div>
</div>


</body>
</html>