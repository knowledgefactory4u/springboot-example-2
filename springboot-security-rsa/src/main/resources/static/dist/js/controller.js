$(document).ready(function() {
	$("#rsarandomkeyaction").click(function(e) {

		$.ajax({
			type : "get",

			cache : false,
			url : "getRsaKeyPair",

			error : function(xhr, status, error) {
				var err = eval("(" + xhr.responseText + ")");
				alert(err.Message);
			},
			success : function(data) {

				$('#publickeygen').val(data.publicKey);
				$('#privatekeygen').val(data.privatekey);

			}
		});

	});

	$("#encryptaction").click(function(e) {
		event.preventDefault();
		var secrettext = $('#texttoencrypt').val();
		var pubkey = $('#publickeysubmit').val();

		$.ajax({
			type : "get",
			data : {
				"publicKey" : pubkey,
				"text" : secrettext

			},
			cache : false,
			url : "encrypt",

			error : function(xhr, status, error) {
				var err = eval("(" + xhr.responseText + ")");
				alert(err.Message);
			},
			success : function(data) {
				$('#encryptedoutput').val(data.encryptedvalue);

			}
		});

	});

	$("#decraction").click(function(e) {
		event.preventDefault();
		var encryptedvalue = $('#enterenctexttodecrypt').val();
		var priv = $('#pvtkeysubmit').val();
		$.ajax({
			type : "get",
			data : {
				"privatekey" : priv,
				"encryptedvalue" : encryptedvalue

			},
			cache : false,
			url : "dencrypt",

			error : function(xhr, status, error) {
				var err = eval("(" + xhr.responseText + ")");
				alert(err.Message);
			},
			success : function(data) {
				$('#decoutput').val(data.text);

			}
		});

	});

});