<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
<link rel="stylesheet" href="css/common.css">


<meta http-equiv="refresh" content="2.6 ;URL='HomeAction'" />
<link rel="stylesheet" type="text/css"
	href="https://fonts.googleapis.com/css?family=Inconsolata|Playfair+Display|Rubik">


<meta name="description"
	content="A simple library to take care of complex CSS animations." />
<canvas id="animation"></canvas>

  <style>
    /* CSSアニメーションの設定 */

    .scroll-overlay {
	height: 100%;
	z-index: 99;
	position: relative;
}

html {
	height: 100%;
	overflow: hidden;
	margin: 0 0;
}

body {
overflow: hidden;
	height: 100%;
	/* width: 1920px; */
	margin: 0 0;
	background-color: #FFFAFA;
	z-index: 10;
}
::-webkit-scrollbar {
	display: none;
}


       .poyon {

      -webkit-animation: poyon 1.1s linear 0s 1;
      animation: poyon 1.4s linear 0s 1;

    }

.poyon1 {

      -webkit-animation: poyon 1.1s linear 0s 1;
      animation: poyon 1.2s linear 0s 1;

    }

     .poyon2 {

      -webkit-animation: poyon 1.1s linear 0s 1;
      animation: poyon 1.3s linear 0s 1;

    }

     .poyon3 {

      -webkit-animation: poyon 1.1s linear 0s 1;
      animation: poyon 1.7s linear 0s 1;

    }

     .poyon4 {

      -webkit-animation: poyon 1.1s linear 0s 1;
      animation: poyon 1.6s linear 0s 1;

    }

     .poyon5 {

      -webkit-animation: poyon 1.1s linear 0s 1;
      animation: poyon 1.4s linear 0s 1;

    }

     .poyon6 {

      -webkit-animation: poyon 1.1s linear 0s 1;
      animation: poyon 1.7s linear 0s 1;

    }

     .poyon7 {

      -webkit-animation: poyon 2.1s linear 0s 1;
      animation: poyon 2.1s linear 0s 1;

    }

     .poyon8 {

      -webkit-animation: poyon 1.1s linear 0s 1;
      animation: poyon 1.4s linear 0s 1;

    }

     .poyon9 {

      -webkit-animation: poyon 1.1s linear 0s 1;
      animation: poyon 1.2s linear 0s 1;

    }

     .poyon10 {

      -webkit-animation: poyon 1.1s linear 0s 1;
      animation: poyon 1.6s linear 0s 1;

    }

     .poyon11 {

      -webkit-animation: poyon 1.1s linear 0s 1;
      animation: poyon 1.7s linear 0s 1;

    }


   .anime{
   	text-align: center;
   	margin: 0 auto;
	position:absolute;
	top:300px;
	left:300px;
   }
   .description {
   position:absolute;
	top:500px;
	left:590px;

		font-size:30px;
		letter-spacing:5px;


		animation: fadeIn 3s ease 0s 1 normal;
    -webkit-animation: fadeIn 3s ease 0s 1 normal;

	}
	@keyframes fadeIn {
    0% {opacity: 0}
    20% {opacity:0}
    100% {opacity: 1}
}



    @-webkit-keyframes poyon {
      0%   { -webkit-transform: scale(0.8, 1.4) translate(0%, -100%); }
      10%  { -webkit-transform: scale(0.8, 1.4) translate(0%, -60%); }
      20%  { -webkit-transform: scale(1.4, 0.6) translate(0%, 30%); }
      30%  { -webkit-transform: scale(0.9, 1.1) translate(0%, -10%); }
      40%  { -webkit-transform: scale(0.95, 1.2) translate(0%, -30%); }
      200%  { -webkit-transform: scale(0.95, 1.2) translate(0%, -10%); }
      60%  { -webkit-transform: scale(1.1, 0.9) translate(0%, 5%); }
      70%  { -webkit-transform: scale(1.0, 1.0) translate(0%, 0%); }
      100% { -webkit-transform: scale(1.0, 1.0) translate(0%, 0%); }
    }
    @keyframes poyon {
      0%   { transform: scale(0.8, 1.4) translate(0%, -100%); }
      10%  { transform: scale(0.8, 1.4) translate(0%, -60%); }
      20%  { transform: scale(1.4, 0.6) translate(0%, 30%); }
      30%  { transform: scale(0.9, 1.1) translate(0%, -10%); }
      40%  { transform: scale(0.95, 1.2) translate(0%, -30%); }
      200%  { transform: scale(0.95, 1.2) translate(0%, -10%); }
      60%  { transform: scale(1.1, 0.9) translate(0%, 5%); }
      70%  { transform: scale(1.0, 1.0) translate(0%, 0%); }
      100% { transform: scale(1.0, 1.0) translate(0%, 0%); }
    }



  @-webkit-keyframes poyon2 {
      0%   { -webkit-transform: scale(0.8, 1.4) translate(0%, -100%); }
      10%  { -webkit-transform: scale(0.8, 1.4) translate(0%, -60%); }
      20%  { -webkit-transform: scale(1.4, 0.6) translate(0%, 30%); }
      30%  { -webkit-transform: scale(0.9, 1.1) translate(0%, -10%); }
      40%  { -webkit-transform: scale(0.95, 1.2) translate(0%, -30%); }
      200%  { -webkit-transform: scale(0.95, 1.2) translate(0%, -10%); }
      60%  { -webkit-transform: scale(1.1, 0.9) translate(0%, 5%); }
      70%  { -webkit-transform: scale(1.0, 1.0) translate(0%, 0%); }
      100% { -webkit-transform: scale(1.0, 1.0) translate(0%, 0%); }
    }
    @keyframes poyon2 {
      0%   { transform: scale(0.8, 1.4) translate(0%, -100%); }
      10%  { transform: scale(0.8, 1.4) translate(0%, -60%); }
      20%  { transform: scale(1.4, 0.6) translate(0%, 30%); }
      30%  { transform: scale(0.9, 1.1) translate(0%, -10%); }
      40%  { transform: scale(0.95, 1.2) translate(0%, -30%); }
      200%  { transform: scale(0.95, 1.2) translate(0%, -10%); }
      60%  { transform: scale(1.1, 0.9) translate(0%, 5%); }
      70%  { transform: scale(1.0, 1.0) translate(0%, 0%); }
      100% { transform: scale(1.0, 1.0) translate(0%, 0%); }
    }


      @-webkit-keyframes poyon3 {
      0%   { -webkit-transform: scale(0.8, 1.4) translate(0%, -100%); }
      10%  { -webkit-transform: scale(0.8, 1.4) translate(0%, -60%); }
      20%  { -webkit-transform: scale(1.4, 0.6) translate(0%, 30%); }
      30%  { -webkit-transform: scale(0.9, 1.1) translate(0%, -10%); }
      40%  { -webkit-transform: scale(0.95, 1.2) translate(0%, -30%); }
      200%  { -webkit-transform: scale(0.95, 1.2) translate(0%, -10%); }
      60%  { -webkit-transform: scale(1.1, 0.9) translate(0%, 5%); }
      70%  { -webkit-transform: scale(1.0, 1.0) translate(0%, 0%); }
      100% { -webkit-transform: scale(1.0, 1.0) translate(0%, 0%); }
    }
    @keyframes poyon3 {
      0%   { transform: scale(0.8, 1.4) translate(0%, -100%); }
      10%  { transform: scale(0.8, 1.4) translate(0%, -60%); }
      20%  { transform: scale(1.4, 0.6) translate(0%, 30%); }
      30%  { transform: scale(0.9, 1.1) translate(0%, -10%); }
      40%  { transform: scale(0.95, 1.2) translate(0%, -30%); }
      200%  { transform: scale(0.95, 1.2) translate(0%, -10%); }
      60%  { transform: scale(1.1, 0.9) translate(0%, 5%); }
      70%  { transform: scale(1.0, 1.0) translate(0%, 0%); }
      100% { transform: scale(1.0, 1.0) translate(0%, 0%); }
    }

      @-webkit-keyframes poyon4 {
      0%   { -webkit-transform: scale(0.8, 1.4) translate(0%, -100%); }
      10%  { -webkit-transform: scale(0.8, 1.4) translate(0%, -60%); }
      20%  { -webkit-transform: scale(1.4, 0.6) translate(0%, 30%); }
      30%  { -webkit-transform: scale(0.9, 1.1) translate(0%, -10%); }
      40%  { -webkit-transform: scale(0.95, 1.2) translate(0%, -30%); }
      200%  { -webkit-transform: scale(0.95, 1.2) translate(0%, -10%); }
      60%  { -webkit-transform: scale(1.1, 0.9) translate(0%, 5%); }
      70%  { -webkit-transform: scale(1.0, 1.0) translate(0%, 0%); }
      100% { -webkit-transform: scale(1.0, 1.0) translate(0%, 0%); }
    }
    @keyframes poyon4 {
      0%   { transform: scale(0.8, 1.4) translate(0%, -100%); }
      10%  { transform: scale(0.8, 1.4) translate(0%, -60%); }
      20%  { transform: scale(1.4, 0.6) translate(0%, 30%); }
      30%  { transform: scale(0.9, 1.1) translate(0%, -10%); }
      40%  { transform: scale(0.95, 1.2) translate(0%, -30%); }
      200%  { transform: scale(0.95, 1.2) translate(0%, -10%); }
      60%  { transform: scale(1.1, 0.9) translate(0%, 5%); }
      70%  { transform: scale(1.0, 1.0) translate(0%, 0%); }
      100% { transform: scale(1.0, 1.0) translate(0%, 0%); }
    }

      @-webkit-keyframes poyon5 {
      0%   { -webkit-transform: scale(0.8, 1.4) translate(0%, -100%); }
      10%  { -webkit-transform: scale(0.8, 1.4) translate(0%, -60%); }
      20%  { -webkit-transform: scale(1.4, 0.6) translate(0%, 30%); }
      30%  { -webkit-transform: scale(0.9, 1.1) translate(0%, -10%); }
      40%  { -webkit-transform: scale(0.95, 1.2) translate(0%, -30%); }
      200%  { -webkit-transform: scale(0.95, 1.2) translate(0%, -10%); }
      60%  { -webkit-transform: scale(1.1, 0.9) translate(0%, 5%); }
      70%  { -webkit-transform: scale(1.0, 1.0) translate(0%, 0%); }
      100% { -webkit-transform: scale(1.0, 1.0) translate(0%, 0%); }
    }
    @keyframes poyon5 {
      0%   { transform: scale(0.8, 1.4) translate(0%, -100%); }
      10%  { transform: scale(0.8, 1.4) translate(0%, -60%); }
      20%  { transform: scale(1.4, 0.6) translate(0%, 30%); }
      30%  { transform: scale(0.9, 1.1) translate(0%, -10%); }
      40%  { transform: scale(0.95, 1.2) translate(0%, -30%); }
      200%  { transform: scale(0.95, 1.2) translate(0%, -10%); }
      60%  { transform: scale(1.1, 0.9) translate(0%, 5%); }
      70%  { transform: scale(1.0, 1.0) translate(0%, 0%); }
      100% { transform: scale(1.0, 1.0) translate(0%, 0%); }
    }

      @-webkit-keyframes poyon6 {
      0%   { -webkit-transform: scale(0.8, 1.4) translate(0%, -100%); }
      10%  { -webkit-transform: scale(0.8, 1.4) translate(0%, -60%); }
      20%  { -webkit-transform: scale(1.4, 0.6) translate(0%, 30%); }
      30%  { -webkit-transform: scale(0.9, 1.1) translate(0%, -10%); }
      40%  { -webkit-transform: scale(0.95, 1.2) translate(0%, -30%); }
      200%  { -webkit-transform: scale(0.95, 1.2) translate(0%, -10%); }
      60%  { -webkit-transform: scale(1.1, 0.9) translate(0%, 5%); }
      70%  { -webkit-transform: scale(1.0, 1.0) translate(0%, 0%); }
      100% { -webkit-transform: scale(1.0, 1.0) translate(0%, 0%); }
    }
    @keyframes poyon6 {
      0%   { transform: scale(0.8, 1.4) translate(0%, -100%); }
      10%  { transform: scale(0.8, 1.4) translate(0%, -60%); }
      20%  { transform: scale(1.4, 0.6) translate(0%, 30%); }
      30%  { transform: scale(0.9, 1.1) translate(0%, -10%); }
      40%  { transform: scale(0.95, 1.2) translate(0%, -30%); }
      200%  { transform: scale(0.95, 1.2) translate(0%, -10%); }
      60%  { transform: scale(1.1, 0.9) translate(0%, 5%); }
      70%  { transform: scale(1.0, 1.0) translate(0%, 0%); }
      100% { transform: scale(1.0, 1.0) translate(0%, 0%); }
    }

      @-webkit-keyframes poyon7 {
      0%   { -webkit-transform: scale(0.8, 1.4) translate(0%, -100%); }
      10%  { -webkit-transform: scale(0.8, 1.4) translate(0%, -60%); }
      20%  { -webkit-transform: scale(1.4, 0.6) translate(0%, 30%); }
      30%  { -webkit-transform: scale(0.9, 1.1) translate(0%, -10%); }
      40%  { -webkit-transform: scale(0.95, 1.2) translate(0%, -30%); }
      300%  { -webkit-transform: scale(0.95, 1.2) translate(0%, -80%); }
      60%  { -webkit-transform: scale(1.1, 0.9) translate(0%, 5%); }
      70%  { -webkit-transform: scale(1.0, 1.0) translate(0%, 0%); }
      100% { -webkit-transform: scale(1.0, 1.0) translate(0%, 0%); }
    }
    @keyframes poyon7 {
      0%   { transform: scale(0.8, 1.4) translate(0%, -100%); }
      10%  { transform: scale(0.8, 1.4) translate(0%, -60%); }
      20%  { transform: scale(1.4, 0.6) translate(0%, 30%); }
      30%  { transform: scale(0.9, 1.1) translate(0%, -10%); }
      40%  { transform: scale(0.95, 1.2) translate(0%, -30%); }
      200%  { transform: scale(0.95, 1.2) translate(0%, -10%); }
      60%  { transform: scale(1.1, 0.9) translate(0%, 5%); }
      70%  { transform: scale(1.0, 1.0) translate(0%, 0%); }
      100% { transform: scale(1.0, 1.0) translate(0%, 0%); }
    }

      @-webkit-keyframes poyon8 {
      0%   { -webkit-transform: scale(0.8, 1.4) translate(0%, -100%); }
      10%  { -webkit-transform: scale(0.8, 1.4) translate(0%, -60%); }
      20%  { -webkit-transform: scale(1.4, 0.6) translate(0%, 30%); }
      30%  { -webkit-transform: scale(0.9, 1.1) translate(0%, -10%); }
      40%  { -webkit-transform: scale(0.95, 1.2) translate(0%, -30%); }
      200%  { -webkit-transform: scale(0.95, 1.2) translate(0%, -10%); }
      60%  { -webkit-transform: scale(1.1, 0.9) translate(0%, 5%); }
      70%  { -webkit-transform: scale(1.0, 1.0) translate(0%, 0%); }
      100% { -webkit-transform: scale(1.0, 1.0) translate(0%, 0%); }
    }
    @keyframes poyon8 {
      0%   { transform: scale(0.8, 1.4) translate(0%, -100%); }
      10%  { transform: scale(0.8, 1.4) translate(0%, -60%); }
      20%  { transform: scale(1.4, 0.6) translate(0%, 30%); }
      30%  { transform: scale(0.9, 1.1) translate(0%, -10%); }
      40%  { transform: scale(0.95, 1.2) translate(0%, -30%); }
      200%  { transform: scale(0.95, 1.2) translate(0%, -10%); }
      60%  { transform: scale(1.1, 0.9) translate(0%, 5%); }
      70%  { transform: scale(1.0, 1.0) translate(0%, 0%); }
      100% { transform: scale(1.0, 1.0) translate(0%, 0%); }
    }

      @-webkit-keyframes poyon9 {
      0%   { -webkit-transform: scale(0.8, 1.4) translate(0%, -100%); }
      10%  { -webkit-transform: scale(0.8, 1.4) translate(0%, -60%); }
      20%  { -webkit-transform: scale(1.4, 0.6) translate(0%, 30%); }
      30%  { -webkit-transform: scale(0.9, 1.1) translate(0%, -10%); }
      40%  { -webkit-transform: scale(0.95, 1.2) translate(0%, -30%); }
      200%  { -webkit-transform: scale(0.95, 1.2) translate(0%, -10%); }
      60%  { -webkit-transform: scale(1.1, 0.9) translate(0%, 5%); }
      70%  { -webkit-transform: scale(1.0, 1.0) translate(0%, 0%); }
      100% { -webkit-transform: scale(1.0, 1.0) translate(0%, 0%); }
    }
    @keyframes poyon9 {
      0%   { transform: scale(0.8, 1.4) translate(0%, -100%); }
      10%  { transform: scale(0.8, 1.4) translate(0%, -60%); }
      20%  { transform: scale(1.4, 0.6) translate(0%, 30%); }
      30%  { transform: scale(0.9, 1.1) translate(0%, -10%); }
      40%  { transform: scale(0.95, 1.2) translate(0%, -30%); }
      200%  { transform: scale(0.95, 1.2) translate(0%, -10%); }
      60%  { transform: scale(1.1, 0.9) translate(0%, 5%); }
      70%  { transform: scale(1.0, 1.0) translate(0%, 0%); }
      100% { transform: scale(1.0, 1.0) translate(0%, 0%); }
    }

      @-webkit-keyframes poyon10 {
      0%   { -webkit-transform: scale(0.8, 1.4) translate(0%, -100%); }
      10%  { -webkit-transform: scale(0.8, 1.4) translate(0%, -60%); }
      20%  { -webkit-transform: scale(1.4, 0.6) translate(0%, 30%); }
      30%  { -webkit-transform: scale(0.9, 1.1) translate(0%, -10%); }
      40%  { -webkit-transform: scale(0.95, 1.2) translate(0%, -30%); }
      200%  { -webkit-transform: scale(0.95, 1.2) translate(0%, -10%); }
      60%  { -webkit-transform: scale(1.1, 0.9) translate(0%, 5%); }
      70%  { -webkit-transform: scale(1.0, 1.0) translate(0%, 0%); }
      100% { -webkit-transform: scale(1.0, 1.0) translate(0%, 0%); }
    }
    @keyframes poyon10 {
      0%   { transform: scale(0.8, 1.4) translate(0%, -100%); }
      10%  { transform: scale(0.8, 1.4) translate(0%, -60%); }
      20%  { transform: scale(1.4, 0.6) translate(0%, 30%); }
      30%  { transform: scale(0.9, 1.1) translate(0%, -10%); }
      40%  { transform: scale(0.95, 1.2) translate(0%, -30%); }
      200%  { transform: scale(0.95, 1.2) translate(0%, -10%); }
      60%  { transform: scale(1.1, 0.9) translate(0%, 5%); }
      70%  { transform: scale(1.0, 1.0) translate(0%, 0%); }
      100% { transform: scale(1.0, 1.0) translate(0%, 0%); }
    }

      @-webkit-keyframes poyon11 {
      0%   { -webkit-transform: scale(0.8, 1.4) translate(0%, -100%); }
      10%  { -webkit-transform: scale(0.8, 1.4) translate(0%, -60%); }
      20%  { -webkit-transform: scale(1.4, 0.6) translate(0%, 30%); }
      30%  { -webkit-transform: scale(0.9, 1.1) translate(0%, -10%); }
      40%  { -webkit-transform: scale(0.95, 1.2) translate(0%, -30%); }
      200%  { -webkit-transform: scale(0.95, 1.2) translate(0%, -10%); }
      60%  { -webkit-transform: scale(1.1, 0.9) translate(0%, 5%); }
      70%  { -webkit-transform: scale(1.0, 1.0) translate(0%, 0%); }
      100% { -webkit-transform: scale(1.0, 1.0) translate(0%, 0%); }
    }
    @keyframes poyon11 {
      0%   { transform: scale(0.8, 1.4) translate(0%, -100%); }
      10%  { transform: scale(0.8, 1.4) translate(0%, -60%); }
      20%  { transform: scale(1.4, 0.6) translate(0%, 30%); }
      30%  { transform: scale(0.9, 1.1) translate(0%, -10%); }
      40%  { transform: scale(0.95, 1.2) translate(0%, -30%); }
      200%  { transform: scale(0.95, 1.2) translate(0%, -10%); }
      60%  { transform: scale(1.1, 0.9) translate(0%, 5%); }
      70%  { transform: scale(1.0, 1.0) translate(0%, 0%); }
      100% { transform: scale(1.0, 1.0) translate(0%, 0%); }
    }






  </style>
  <script src="js/common.js"></script>
</head>
<body>



<header>
		<div id="header" class="header">
			<canvas id="animation"></canvas>
			<h1></h1>
		</div>
	</header>


  <div class="anime">
  <img id="logo" class="poyon" src="./logo/01_l.jpg" width="auto" height="200">
   <img id="logo1" class="poyon1" src="logo/02_e.jpg" width="auto" height="200">
    <img id="logo2" class="poyon2" src="logo/03_i.jpg" width="auto" height="200">
     <img id="logo3" class="poyon3" src="logo/04_s.jpg" width="auto" height="200">
      <img id="logo4" class="poyon4" src="logo/05_u.jpg" width="auto" height="200">
       <img id="logo5" class="poyon5" src="logo/06_r.jpg" width="auto" height="200">
        <img id="logo6" class="poyon6" src="logo/07_e.jpg" width="auto" height="200">
         <img id="logo7" class="poyon7" src="logo/08_p.jpg" width="auto" height="200">
          <img id="logo8" class="poyon8" src="logo/09_a.jpg" width="auto" height="200">
           <img id="logo9" class="poyon9" src="logo/10_s.jpg" width="auto" height="200">
            <img id="logo10" class="poyon10" src="logo/11_s.jpg" width="auto" height="200">
             <img id="logo11" class="poyon11" src="logo/12_!.jpg" width="auto" height="200">



  </div>

  <p class="description">Let's Enjoy Japan!!</p>
  	<div class="scroll-overlay"></div>
  <script>
    // ID値「mitarashi」に対してCSSアニメ―ション「poyon」を300ミリ秒の間隔を空けてループ再生
    looopAnimation("logo", "poyon", 300);
    looopAnimation("logo1", "poyon1", 300);
    looopAnimation("logo2", "poyon2", 300);
    looopAnimation("logo3", "poyon3", 300);
    looopAnimation("logo4", "poyon4", 300);
    looopAnimation("logo5", "poyon5", 300);
    looopAnimation("logo6", "poyon6", 300);
    looopAnimation("logo7", "poyon7", 300);
    looopAnimation("logo8", "poyon8", 300);
    looopAnimation("logo9", "poyon9", 300);
    looopAnimation("logo10", "poyon10", 300);
    looopAnimation("logo11", "poyon11", 300);

  </script>
  	<script src="./js/animu.js"></script>
</body>
</html>