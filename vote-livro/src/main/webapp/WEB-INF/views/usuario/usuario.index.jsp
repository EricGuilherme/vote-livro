<jsp:include page="../head.jsp"></jsp:include>

<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-4">
						<h3 class="text-left text-primary">Login</h3>
						<form action="salvar" class="form-horizontal" role="form">
							<div class="form-group">

								<label for="inputEmail3" class="col-sm-2 control-label">
									Email </label>
								<div class="col-sm-10">
									<input type="email" name="email" class="form-control" id="inputEmail3" />
								</div>
							</div>
							<div class="form-group">

								<label for="inputPassword3" class="col-sm-2 control-label">
									Password </label>
								<div class="col-sm-10">
									<input type="password" name="senha" class="form-control" id="inputPassword3" />
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">

									<button type="submit" class="btn btn-default">Sign in
									</button>
								</div>
							</div>
						</form>
					</div>
					<div class="col-md-4"></div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>