$(document).ready(function(){
	
	$("#submit").click(function(){
		var marriage = $("input[name='marriage']:checked").val();
		var guns = $("input[name='guns']:checked").val();
		var globalwarming = $("input[name='globalwarming']:checked").val();
		var abortion = $("input[name='abortion']:checked").val();
		var healthcare = $("input[name='healthcare']:checked").val();
		
		$.ajax({
			method: "GET",
			url: "/correct-elect/match",
			data: {
				marriage_question: marriage,
				guns_question: guns,
				globalwarming_question: globalwarming,
				abortion_question: abortion,
				healthcare_question: healthcare
			},
			success: function(responseText){
				console.log(responseText);
				$("body").html(responseText);
			}
		});
	})
})