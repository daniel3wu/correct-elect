
	<!-- Contact Section -->
	<section id="contact">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">
					<h2>PolitiMatch</h2>
					<hr class="star-primary">
				</div>
			</div>
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2">
					<!-- To configure the contact form email address, go to mail/contact_me.php and update the email address in the PHP file on line 19. -->
					<!-- The form should work on most web servers, but if the form is not working you may need to configure your web server differently. -->

<%-- 						<jsp: for QUESTION in allQuestions> --%>
<%-- 							${QUESTION.text} <br> --%>
<%-- 							<input type="radio" name="${QUESTION.name}" required> Yes <br> --%>
<%-- 							<input type="radio" name="${QUESTION.name}" required> YES <br> --%>
<!-- 							<br> -->
<%-- 						</jsp:> --%>
						
						Do you support gay marriage?<br> 
						<input type="radio" name="marriage" value="Yes" required> Yes <br>
						<input type="radio" name="marriage" value="No" required>No <br> 
						
						<br> 
						
						Do you support gun control? <br> 
						<input type="radio" name="guns" value="Yes" required> Yes <br>
						<input type="radio" name="guns" value="No" required> No <br> 
						
						<br>
						
						Do you believe in global warming? <br>
						<input type="radio" name="globalwarming" value="Yes" required> Yes <br> 
						<input type="radio" name="globalwarming" value="No" required> No <br> 
						
						<br>						
						
						Do you think abortion should be legal? <br>
						<input type="radio" name="abortion" value="Yes" required> Yes <br> 
						<input type="radio" name="abortion" value="No" required> No <br> 
						
						<br>
						
						Should the government provide universal health care? <br>
						<input type="radio" name="healthcare" value="Yes" required> Yes <br> 
						<input type="radio" name="healthcare" value="No" required> No <br> 
						
						<br> <br> <br> 
						
						<button id="submit" style="color: black; font-size: 30px;">SUBMIT</button>

					<br>
				</div>
			</div>
		</div>
	</section>
