<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<jsp:include page="header.jsp"></jsp:include>

<head>
	<style>
		form { width: 400px; }
		label { float: left; width: 150px; }
		input[type=text] { float: left; width: 280px; }
		.clear { clear: both; height: 0; line-height: 0; }
		.floatright { float: right; }
		select { float: left; width: 200px; border-radius:15px; height: 30px}
		.clear { clear: both; height: 0; line-height: 0}
		.floatright { float: right; }
	</style>
</head>
<body id="page-top" class="index">
<!-- Contact Section -->
	<section id="contact">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">
					<h2>PolitiMatch</h2>
					<hr class="star-primary">
				</div>
			</div>
			
			<div style="text-align:center; color:white">
			<h1 style = "font-size:28px">About You</h1></div>
			
			<br><br>
			
			<form action="/action_page.php">
				<label for="fname">First Name:</label>
				<input type="text" name="fname" style="width: 200px; border-radius: 15px;"/>
				<br>
				
				<label for="lname">Last Name:</label>
				<input type="text" name="lname" style="width: 200px; border-radius: 15px;"/>
				<br>
				
				<label for="saddy">Street Address:</label>
				<input type="text" name="saddy" style="width: 200px; border-radius: 15px;"/>
				<br>
				
				<label for="city">City:</label>
				<input type="text" name="city" style="width: 200px; border-radius: 15px;"/>
				<br>
				
				<label for="zip">Zip Code:</label>
				<input type="text" name="Zip" style="width: 200px; border-radius: 15px;"/>
				<br><br><br><br>
				
				<label for="state">State:</label>
				<select>
					<option value="AL">Alabama</option>
					<option value="AK">Alaska</option>
					<option value="AZ">Arizona</option>
					<option value="AR">Arkansas</option>
					<option value="CA">California</option>
					<option value="CO">Colorado</option>
					<option value="CT">Connecticut</option>
					<option value="DE">Delaware</option>
					<option value="DC">District Of Columbia</option>
					<option value="FL">Florida</option>
					<option value="GA">Georgia</option>
					<option value="HI">Hawaii</option>
					<option value="ID">Idaho</option>
					<option value="IL">Illinois</option>
					<option value="IN">Indiana</option>
					<option value="IA">Iowa</option>
					<option value="KS">Kansas</option>
					<option value="KY">Kentucky</option>
					<option value="LA">Louisiana</option>
					<option value="ME">Maine</option>
					<option value="MD">Maryland</option>
					<option value="MA">Massachusetts</option>
					<option value="MI">Michigan</option>
					<option value="MN">Minnesota</option>
					<option value="MS">Mississippi</option>
					<option value="MO">Missouri</option>
					<option value="MT">Montana</option>
					<option value="NE">Nebraska</option>
					<option value="NV">Nevada</option>
					<option value="NH">New Hampshire</option>
					<option value="NJ">New Jersey</option>
					<option value="NM">New Mexico</option>
					<option value="NY">New York</option>
					<option value="NC">North Carolina</option>
					<option value="ND">North Dakota</option>
					<option value="OH">Ohio</option>
					<option value="OK">Oklahoma</option>
					<option value="OR">Oregon</option>
					<option value="PA">Pennsylvania</option>
					<option value="RI">Rhode Island</option>
					<option value="SC">South Carolina</option>
					<option value="SD">South Dakota</option>
					<option value="TN">Tennessee</option>
					<option value="TX">Texas</option>
					<option value="UT">Utah</option>
					<option value="VT">Vermont</option>
					<option value="VA">Virginia</option>
					<option value="WA">Washington</option>
					<option value="WV">West Virginia</option>
					<option value="WI">Wisconsin</option>
					<option value="WY">Wyoming</option>
				</select>
				<br>
				
			</form>
			<br><br><br><br>
			<form action="http://localhost:8080/correct-elect">
    			<input type="submit" value="Submit" style = "border-radius:20px;"/>
			</form>
 		
 		</div>
	</section>
</body>
</html>