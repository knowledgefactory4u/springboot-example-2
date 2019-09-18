$(document).ready(function() {
	listAllUsers()

	$("#ssubmit").click(function(e) {
		event.preventDefault();
		var fname = $('#firstName').val();
		var lname = $('#lastName').val();
		var email = $('#emailid').val();
		var pin = $('#pin').val();
		$.ajax({
			type : "POST",
			dataType : 'json',
			contentType : 'application/json',
			cache : false,
			url : "saveUser",
			data : JSON.stringify({

				"name" : fname,
				"lastname" : lname,
				"email" : email,
				"pin" : pin
			}),
			error : function(xhr, status, error) {
				var err = eval("(" + xhr.responseText + ")");
				alert(err.Message);
			},
			success : function(data) {
				listAllUsers()
				$('#myModal').modal('toggle');

			}
		});

	});

	$("#ussubmit").click(function(e) {
		event.preventDefault();
		var fname = $("#ufirstName").val()
		var lname = $("#ulastName").val()
		var email = $("#uemailid").val()
		var pin = $("#upin").val()
		var id = $("#idup").val()
		$.ajax({
			type : "POST",
			dataType : 'json',
			contentType : 'application/json',
			cache : false,
			url : "updateUser",
			data : JSON.stringify({
				"id" : id,
				"name" : fname,
				"lastname" : lname,
				"email" : email,
				"pin" : pin
			}),
			error : function(xhr, status, error) {
				var err = eval("(" + xhr.responseText + ")");
				alert(err.Message);
			},
			success : function(data) {
				listAllUsers()
				$('#upmyModal').modal('toggle');

			}
		});

	});

});
function listAllUsers() {

	$
			.ajax({
				type : "GET",

				cache : false,
				url : "getcall",

				error : function(xhr, status, error) {
					var err = eval("(" + xhr.responseText + ")");
					alert(err.Message);
				},
				success : function(data) {

					var trHTML = '';
					// var tHTML = '';
					trHTML += '<table class="table" id="myTable"><thead><tr>	<th>Firstname</th>	<th>Lastname</th><th>Email</th><th>Pin</th><th>Action</th></tr>	</thead><tbody>'
					for (var i = 0; i < data.length; i++) {
						var item = data[i];
						trHTML += '<tr><td>'
								+ item.name
								+ '</td><td>'
								+ item.lastname
								+ '</td><td>'
								+ item.email
								+ '</td><td>'
								+ item.pin
								+ '</td><td>'
								+ '<button type="button" class="btn btn-success" onclick="updateuser(\''
								+ item.id
								+ '\',\''
								+ item.name
								+ '\',\''
								+ item.lastname
								+ '\',\''
								+ item.email
								+ '\',\''
								+ item.pin
								+ '\')">Update</button><button  type="button" class="btn btn-danger" onclick="deleteAction('
								+ item.id + ')">Delete</button>'
								+ '</td> </tr>';
					}

					trHTML += '</tbody></table>'
					$('#tabdiv').html(trHTML);

				}
			});

}

function deleteAction(id) {

	$.ajax({
		type : "DELETE",
		dataType : 'json',
		contentType : 'application/json',
		cache : false,
		url : "deleteById",
		data : JSON.stringify({

			"id" : id
		}),
		error : function(xhr, status, error) {
			var err = eval("(" + xhr.responseText + ")");
			alert(err.Message);
		},
		success : function(data) {
			listAllUsers()

		}
	});
}

function updateuser(id, name, lname, email, pin) {
	$("#ufirstName").val(name)
	$("#ulastName").val(lname)
	$("#uemailid").val(email)
	$("#upin").val(pin)
	$("#idup").val(id)

	$('#upmyModal').modal('toggle');

}