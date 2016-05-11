/*	JavaScript 6th Edition
 *	Chapter 12
 *	Hands-On Project 12-1
 *	Author: Gary A. Newsome
 *	Date: 	05.02.16
 *	Filename: script.js
 */

 function display(event){
	$(event.currentTarget).next().fadeIn("slow");
 }
 $("h3").click(display);