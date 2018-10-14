$(document).ready(function(){
	
	$("#submit").click(function goToMatch(){
		$.ajax({
			method: "GET",
			url: "/correct-elect/match",
			success: function(responseText){
				console.log(responseText);
				$("body").html(responseText);
			}
		});
	})
	
	$("#submit").click(function goToProfile(){
		$.ajax({
			method: "GET",
			url: "/correct-elect/profile",
			data: {
				marriage_question: marriage,
				kavanaugh_question: kavanaugh,
				isis_question: isis
			},
			success: function(responseText){
				console.log(responseText);
				$("body").html(responseText);
			}
		});
	})
})