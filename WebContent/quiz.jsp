<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Politican Matcher</title>

    <!-- Bootstrap Core CSS - Uses Bootswatch Flatly Theme: http://bootswatch.com/flatly/ -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/freelancer.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">

    <style type="text/css">
    input[type=text]{
        width:100%;
    }
    input{
        padding: 5px 15px;
        margin:6px 0;
    }
    body{
        background-color: LightSeaGreen;
    }

    </style>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.12.0/jquery.js"></script>

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
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2">
                    <!-- To configure the contact form email address, go to mail/contact_me.php and update the email address in the PHP file on line 19. -->
                    <!-- The form should work on most web servers, but if the form is not working you may need to configure your web server differently. -->


<form>
What are your thoughts on gay marriage?<br>
<input type="radio" name="marriage" value="Yes" required> Yes <br>
<input type="radio" name="marriage" value="No" required> No <br>

<br>

Do you like Brett Kavanaugh? <br>
<input type="radio" name="kavanaugh" value="Yes" required> Yes <br>
<input type="radio" name="kavanaugh" value="No" required> No <br>

<br>

Do you want to go to war with ISIS? <br>
<input type="radio" name="ISIS" value="Yes" required> Yes <br>
<input type="radio" name="ISIS" value="No" required> No <br>

<br>

<br><br>

<a href="http://localhost:8080/correct-elect/match" style="color:black; font-size:30px;">SUBMIT</a>

</form>
<br>

             
                </div>
            </div>
        </div>
    </section>


    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
    <script src="js/classie.js"></script>
    <script src="js/cbpAnimatedHeader.js"></script>

    <!-- Contact Form JavaScript -->
    <script src="js/jqBootstrapValidation.js"></script>
    <script src="js/contact_me.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="js/freelancer.js"></script>

</body>

</html>
