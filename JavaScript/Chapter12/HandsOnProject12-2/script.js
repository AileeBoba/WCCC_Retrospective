/*	JavaScript 6th Edition
 *	Chapter 12
 *	Hands-On Project 12-2
 *	Author: Gary A. Newsome
 *	Date: 	05.02.16
 *	Filename: script.js
 */

function convert(){
	var lb = $("#pValue").val();
	var kg = Math.round(lb / 2.2);
	$("#kValue").html(kg);
}
$("#convertButton").click(convert);
$("#pValue").val("");
$("kValue").html("");
