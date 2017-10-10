/**
 * 
 */

var util = {};

util.requestSync = function(url, param, method, callback){
	$.ajax({
		method : "POST",
		url : url ,
		dataType : "JSON",
		data : param,
		error : function() {
			alert('error');
		},
		success : callback
	});
}
