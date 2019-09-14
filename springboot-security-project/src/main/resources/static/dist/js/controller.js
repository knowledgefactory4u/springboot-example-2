$(document).ready(
		function() {
			$("#clickrandomkey").click(function(e) {

				$.ajax({
					type : "get",

					cache : false,
					url : "getAesRandomKey",

					error : function(xhr, status, error) {
						var err = eval("(" + xhr.responseText + ")");
						alert(err.Message);
					},
					success : function(data) {

						$('#encrandomkey').val(data.randomString);
					}
				});

			});

			$("#encryptclicked").click(
					function(e) {
						event.preventDefault();
						var secrettext = $('#encrypttextarea').val();
						var randomkey = $('#encrandomkey').val();
						$
								.ajax({
									type : "get",

									cache : false,
									url : "encrypt?secret=" + secrettext
											+ "&randomString=" + randomkey,

									error : function(xhr, status, error) {
										var err = eval("(" + xhr.responseText
												+ ")");
										alert(err.Message);
									},
									success : function(data) {
										$('#encryptedoutput').val(
												data.encryptedString);

									}
								});

					});

			$("#submitdec").click(
					function(e) {
						event.preventDefault();
						var secrettext = $('#decrypttextarea').val();
						var randomkey = $('#decrandomsecrekey').val();
						$
								.ajax({
									type : "get",

									cache : false,
									url : "decrypt?encryptedString="
											+ secrettext + "&randomString="
											+ randomkey,

									error : function(xhr, status, error) {
										var err = eval("(" + xhr.responseText
												+ ")");
										alert(err.Message);
									},
									success : function(data) {
										$('#decryptedoutput').val(
												data.decryptedString);

									}
								});

					});

			$("#encryptclickedmd5").click(function(e) {
				event.preventDefault();
				var secrettext = $('#encmd5').val();

				$.ajax({
					type : "get",

					cache : false,
					url : "md5crypt?secret=" + secrettext,

					error : function(xhr, status, error) {
						var err = eval("(" + xhr.responseText + ")");
						alert(err.Message);
					},
					success : function(data) {
						$('#cryptoutmd5').val(data.encrypted);

					}
				});

			});

			
			
			$("#sha256submit").click(function(e) {
				event.preventDefault();
				var secrettext = $('#sha256textinput').val();

				$.ajax({
					type : "get",

					cache : false,
					url : "sha256crypt?secret=" + secrettext,

					error : function(xhr, status, error) {
						var err = eval("(" + xhr.responseText + ")");
						alert(err.Message);
					},
					success : function(data) {
						$('#sha256response').val(data.encrypted);

					}
				});

			});
			
			
			
			$("#sha512submit").click(function(e) {
				event.preventDefault();
				var secrettext = $('#sha512textinput').val();

				$.ajax({
					type : "get",

					cache : false,
					url : "sha512crypt?secret=" + secrettext,

					error : function(xhr, status, error) {
						var err = eval("(" + xhr.responseText + ")");
						alert(err.Message);
					},
					success : function(data) {
						$('#sha512response').val(data.encrypted);

					}
				});

			});
		});