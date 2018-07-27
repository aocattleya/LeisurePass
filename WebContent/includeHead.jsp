<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- カレンダー -->

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1/jquery-ui.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1/i18n/jquery.ui.datepicker-ja.min.js"></script>
<link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1/themes/ui-lightness/jquery-ui.css" >

<script>

	$(function() {


   		$("#datepicker").datepicker({
   			dateFormat: 'yy-mm-dd',
            showOn: "button",

   			// 選択可能範囲
   			minDate: '0y', //今日から
   			/* maxDate: '+1y',	// 1年後まで */
   	        // 日付が選択された時、日付をテキストフィールドへセット
   	        onSelect: function(dateText, inst) {
                $("#date_val").val(dateText);
            }

   	    });

	});
</script>

<!-- カレンダー -->