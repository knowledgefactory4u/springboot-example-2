<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Knf|User Registration</title>
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="../../plugins/fontawesome-free/css/all.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="../../dist/css/adminlte.min.css">
<!-- Google Font: Source Sans Pro -->
<link
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700"
	rel="stylesheet">
</head>
<body class="hold-transition layout-top-nav">
	<!-- Site wrapper -->
	<div class="wrapper">
		<!-- Navbar -->
		<nav
			class="main-header navbar navbar-expand navbar-white navbar-light">
			<!-- Left navbar links -->
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" data-widget="pushmenu"
					href="#"><i class="fas fa-bars"></i></a></li>
				<li class="nav-item d-none d-sm-inline-block"><a href="view"
					class="nav-link">Home</a></li>

			</ul>

		</nav>


		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<div class="container-fluid">
					<div class="row mb-2">
						<div class="col-sm-6">
							<h1>User Registration System using spring boot and jquery</h1>
						</div>
						<div class="col-sm-6">
							<ol class="breadcrumb float-sm-right">
								<li class="breadcrumb-item"><a
									href="https://www.knowledgefactory.net/p/donate.html">About
										Us</a></li>

							</ol>
						</div>
					</div>
				</div>
				<!-- /.container-fluid -->
			</section>

			<!-- Main content -->
			<section class="content">

				<div class="container-fluid">

					<!-- Modal -->
					<div class="modal fade" id="myModal" role="dialog">
						<div class="modal-dialog">

							<!-- Modal content-->
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal">&times;</button>
									<h4 class="modal-title">Register User</h4>
								</div>
								<div class="modal-body">
									<div class="card-body register-card-body">
										<p class="login-box-msg">Register a new membership</p>


										<div class="input-group mb-3">
											<input type="text" class="form-control" id="firstName"
												placeholder="First Name">
											<div class="input-group-append">
												<div class="input-group-text">
													<span class="fas fa-user"></span>
												</div>
											</div>
										</div>
										<div class="input-group mb-3">
											<input type="text" class="form-control" id="lastName"
												placeholder="Last Name">
											<div class="input-group-append">
												<div class="input-group-text">
													<span class="fas fa-user"></span>
												</div>
											</div>
										</div>
										<div class="input-group mb-3">
											<input type="email" class="form-control" id="emailid"
												placeholder="Email">
											<div class="input-group-append">
												<div class="input-group-text">
													<span class="fas fa-envelope"></span>
												</div>
											</div>
										</div>
										<div class="input-group mb-3">
											<input type="text" class="form-control" id="pin"
												placeholder="Pin">
											<div class="input-group-append">
												<div class="input-group-text">
													<span class="fas fa-map-pin"></span>
												</div>
											</div>
										</div>
										<div class="col-4">
											<button type="submit" id="ssubmit"
												class="btn btn-primary btn-block btn-flat">Register</button>
										</div>
										<!-- /.col -->
									</div>
								</div>
							</div>

						</div>

					</div>
					
					
					
						<!-- Modal -->
					<div class="modal fade" id="upmyModal" role="dialog">
						<div class="modal-dialog">

							<!-- Modal content-->
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal">&times;</button>
									<h4 class="modal-title">Update User</h4>
								</div>
								<div class="modal-body">
									<div class="card-body register-card-body">
										


										<div class="input-group mb-3">
											<input type="text" class="form-control" id="ufirstName"
												placeholder="First Name">
											<div class="input-group-append">
												<div class="input-group-text">
													<span class="fas fa-user"></span>
												</div>
											</div>
										</div>
										<div class="input-group mb-3">
											<input type="text" class="form-control" id="ulastName"
												placeholder="Last Name">
											<div class="input-group-append">
												<div class="input-group-text">
													<span class="fas fa-user"></span>
												</div>
											</div>
										</div>
										<div class="input-group mb-3">
											<input type="email" class="form-control" id="uemailid"
												placeholder="Email">
											<div class="input-group-append">
												<div class="input-group-text">
													<span class="fas fa-envelope"></span>
												</div>
											</div>
										</div>
										<div class="input-group mb-3">
											<input type="text" class="form-control" id="upin"
												placeholder="Pin">
											<div class="input-group-append">
												<div class="input-group-text">
													<span class="fas fa-map-pin"></span>
												</div>
											</div>
										</div>
										<input hidden type="text" class="form-control" id="idup"
												>
										<div class="col-4">
											<button type="submit" id="ussubmit"
												class="btn btn-primary btn-block btn-flat">Update</button>
										</div>
										<!-- /.col -->
									</div>
								</div>
							</div>

						</div>

					</div>
					
					
					
				</div>
				<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-4">
						<button data-toggle="modal" data-target="#myModal" id="adduser"
							type="button" class="btn btn-primary">Add User</button>
					</div>
					<div class="col-md-4"></div>

				</div>
				</br>
				<div id="tabdiv"></div>
				<!-- <table class="table" id="myTable">
					<thead>
						<tr>
							<th>Firstname</th>
							<th>Lastname</th>
							<th>Email</th>
							<th>Pin</th>
							<th>Action</th>
						</tr>
					</thead>
					<tbody>

					</tbody>
				</table> -->
		</div>
		</section>
		<!-- /.content -->
	</div>
	<!-- /.content-wrapper -->

	<footer class="main-footer">
		<div class="float-right d-none d-sm-block">
			<b>Version</b> 1.0.0
		</div>
		<strong>Copyright &copy; 2014-2019 <a
			href="http://www.knowledgefactory.net">Knowledge Factory</a>.
		</strong> All rights reserved.
	</footer>

	<!-- Control Sidebar -->
	<aside class="control-sidebar control-sidebar-dark">
		<!-- Control sidebar content goes here -->
	</aside>
	<!-- /.control-sidebar -->
	</div>
	<!-- ./wrapper -->

	<!-- jQuery -->
	<script src="../../plugins/jquery/jquery.min.js"></script>
	<!-- Bootstrap 4 -->
	<script src="../../plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="../../dist/js/adminlte.min.js"></script>
	<script src="../../dist/js/controller.js"></script>

</body>
</html>
