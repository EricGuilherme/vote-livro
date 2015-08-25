<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Vote no Livro</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script type="text/javascript">
	var voto = 0;
	var $livroKey = 3;
	function votacao() {
		voto++;
		document.getElementById("qtdVoto").innerText = voto;

		$.post("http://127.0.0.1:8080/vote-livro/livro/atualizaVoto/?livroKey="
				+ $livroKey, function(data) {
		});

		if (voto == 5) {
			alert("Finish select. See your choose, in make simple login")
			window.location.assign("http://127.0.0.1:8080/vote-livro/usuario/")
		}

	}
</script>

</head>


<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<h3 class="text-primary text-center">make your choose</h3>

					<div class="row">
						<div class="col-md-4">
							<c:forEach var="livro" items="${listarLivros}">
								<img onclick="votacao()" src="http://lorempixel.com/140/140/"
									class="img-circle" id="${livro.livroKey}" />
								<h4>${livro.nome}</h4>
							</c:forEach>
						</div>

						<div class="col-md-4">
							<div class="page-header">
								<h1>
									<center>
										The best books <small>of years</small>
									</center>
								</h1>
							</div>
						</div>

					</div>

				</div>
				<div class="col-md-4"></div>
			</div>
		</div>
		<div class="alert alert-dismissable alert-info">
			<center>
				<h4>
					<strong>You has five choose in books only.</strong> <br /> You did
					<small id="qtdVoto"> 0 </small> choices.
				</h4>
			</center>
		</div>
	</div>
</body>
</html>