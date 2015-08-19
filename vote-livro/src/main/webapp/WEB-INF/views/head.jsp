<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Vote no Livro</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
	<link rel="stylesheet"href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
	<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>

<script type="text/javascript">

	var voto = 0;
	
	function votacao() {
		voto++;
		computaVoto();
		if (voto == 5) {
			window.location.assign("http://127.0.0.1:8080/vote-livro/usuario/index.action")
		}
	}

	function computaVoto() {
			var $livroKey = 1;
		$.ajax({
			url : "http://127.0.0.1:8080/vote-livro/livro/atualizaVoto.action?livroKey=" + $livroKey,
			type : "POST",
			success : function() {
				console.log("sucesso");
			}
		});
	}
	

</script>
</head>