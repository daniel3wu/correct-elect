$(document).ready(function(){
	
	$("#submit").click(function(){
		var marriage = $("input[name='marriage']:checked").val();
		var kavanaugh = $("input[name='kavanaugh']:checked").val();
		var isis = $("input[name='ISIS']:checked").val();
		console.log(marriage);
		console.log(kavanaugh);
		console.log(isis);
		
		$.ajax({
			method: "GET",
			url: "/match",
			data: {
				marriage_question: marriage,
				kavanaugh_question: kavanaugh,
				isis_question: isis
			},
			success: function(responseText){
				console.log(responseText);
			}
		});
	})
})