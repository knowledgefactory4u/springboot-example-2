<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Knf</title>
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="../../plugins/fontawesome-free/css/all.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<!-- overlayScrollbars -->
<link rel="stylesheet"
	href="../../plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
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

				<li class="nav-item d-none d-sm-inline-block"><a href="rsaview"
					class="nav-link">RSA</a></li>

			</ul>
		</nav>


		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<div class="container-fluid">
					<div class="row mb-2">
						<div class="col-sm-6">
							<h1>RSA Encryption, Decryption And Key Generator Tool</h1>
						</div>
						<div class="col-sm-6">
							<ol class="breadcrumb float-sm-right">
								<li class="breadcrumb-item"><a href="#">About Us</a></li>

							</ol>
						</div>
					</div>
				</div>
				<!-- /.container-fluid -->
			</section>

			<!-- Main content -->
			<section class="content">

				<div class="container-fluid">
					<div class="row">
						<div class="col-md-12">
							<!-- general form elements -->
							<div class="card card-primary">
								<div class="card-header">
									<h3 class="card-title">Generate RSA Key Online</h3>
								</div>
								<!-- /.card-header -->
								<!-- form start -->
								<form role="form">

									<div class="card-body">
										<div class="col-md-2">
											<button id="rsarandomkeyaction" type="button"
												class="btn btn-block btn-dark">Generate RSA Key
												Pair</button>
										</div>
										<div class="row">
											<div class="col-md-6">
												<div class="form-group">

													<label for="exampleInputPassword1">Public Key</label>
													<textarea id="publickeygen" class="form-control" rows="6"
														placeholder="Public Key will appear here"></textarea>
												</div>
											</div>

											<div class="col-md-6">
												<div class="form-group">

													<label for="exampleInputPassword1">Private Key</label>
													<textarea id="privatekeygen" class="form-control" rows="6"
														placeholder="Private Key will appear here"></textarea>
												</div>
											</div>
										</div>
									</div>
									<!-- /.card-body -->
								</form>
							</div>
							<!-- /.card -->

						</div>
						<!-- /.card -->

						<div class="col-md-6">
							<!-- general form elements -->
							<div class="card card-primary">
								<div class="card-header">
									<h3 class="card-title">RSA Encryption</h3>
								</div>
								<!-- /.card-header -->
								<!-- form start -->
								<form role="form">

									<div class="card-body">
										<div class="form-group">

											<label for="exampleInputPassword1">Enter Plain Text
												to Encrypt</label>
											<textarea id="texttoencrypt" class="form-control" rows="6"
												placeholder="Enter Plain Text to Encrypt"></textarea>
										</div>



										<div class="form-group">

											<label for="exampleInputPassword1">Enter Public Key</label>
											<textarea id="publickeysubmit" class="form-control" rows="6"
												placeholder="Enter Public Key"></textarea>
										</div>
										<div class="col-md-2">
											<button id="encryptaction" type="button"
												class="btn btn-block btn-dark">Encrypt</button>
										</div>
										<div class="form-group">

											<label for="exampleInputPassword1">Encrypted
												Output(Base64):</label>
											<textarea id="encryptedoutput" class="form-control" rows="6"
												placeholder="Encrypted Output"></textarea>
										</div>
									</div>
									<!-- /.card-body -->
								</form>
							</div>
							<!-- /.card -->

						</div>
						<div class="col-md-6">
							<!-- general form elements -->
							<div class="card card-primary">
								<div class="card-header">
									<h3 class="card-title">RSA Decryption</h3>
								</div>
								<!-- /.card-header -->
								<!-- form start -->
								<form role="form">

									<div class="card-body">
										<div class="form-group">

											<label for="exampleInputPassword1">Enter Encrypted
												Text to Decrypt(Base64)</label>
											<textarea id="enterenctexttodecrypt" class="form-control"
												rows="6" placeholder="Enter Encrypted Text to Decrypt"></textarea>
										</div>



										<div class="form-group">

											<label for="exampleInputPassword1">Enter Private Key</label>
											<textarea id="pvtkeysubmit" class="form-control" rows="6"
												placeholder="Enter Private Key"></textarea>
										</div>
										<div class="col-md-2">
											<button id="decraction" type="button"
												class="btn btn-block btn-dark">Decrypt</button>
										</div>
										<div class="form-group">

											<label for="exampleInputPassword1">Dencrypted Output:</label>
											<textarea id="decoutput" class="form-control" rows="6"
												placeholder="Dencrypted Output"></textarea>
										</div>
									</div>
									<!-- /.card-body -->
								</form>
							</div>
							<!-- /.card -->

						</div>

					</div>
				</div>
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
	<!-- overlayScrollbars -->
	<script
		src="../../plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js"></script>

	<script src="../../dist/js/adminlte.min.js"></script>
	<script src="../../dist/js/controller.js"></script>

</body>
</html>
