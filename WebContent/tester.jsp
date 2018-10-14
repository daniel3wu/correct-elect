<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<form action="http://localhost:8080/correct-elect/profile">
	 	<button class="w3-button w3-black w3-display-left" style = "width:50%;">Match</button>
	</form>
	<form action="http://localhost:8080/correct-elect/profile">
		<button class="w3-button w3-black w3-display-right" style = "width:50%;">Profile</button>
	</form>
	
	<script>
		 var slideIndex = 1;
		 showDivs(slideIndex);
		 function plusDivs(n) {
		 showDivs(slideIndex += n);
		  }
		 function showDivs(n) {
		 var i;
		 var x = document.getElementsByClassName("mySlides");
		 if (n > x.length) {slideIndex = 1} if (n < 1) {slideIndex = x.length}for
		 (i = 0; i < x.length; i++) {x[i].style.display = "none";}
		 x[slideIndex-1].style.display = "block"; }
	</script>
</html>
