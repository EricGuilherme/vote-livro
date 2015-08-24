<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="service" class="br.com.vote.livro.service.LivroService"/>
<body>
<jsp:include page="../head.jsp"></jsp:include>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<h3 class="text-primary text-center">make your choose</h3>
					<div class="row">
						<c:forEach var="livro" items="${service.listarLivros}">
							    <%-- ${livro.nome} --%>
						</c:forEach>
						<div class="col-md-4">
							<img onclick="votacao()" src="http://lorempixel.com/140/140/" class="img-circle" id="${livro.livroKey}"/>
						</div>
					<div class="col-md-4">
						<div class="page-header">
							<h1>
								<center>The best books <small>of years</small></center>
							</h1>
						</div>				
					</div>
					<div class="col-md-4">
						<img onclick="votacao()" src="http://lorempixel.com/140/140/" class="img-circle" id="${livro.livroKey}"/>
					</div>
				</div>
			</div>
			<div class="col-md-4">
			</div>
		</div>
	</div>
		<div class="alert alert-dismissable alert-info">
			<center> 
				<h4> <strong>You has five choose in books only.</strong> <br />
					 You did <small id="qtdVoto"> 0 </small> choices. 
				</h4>
			</center>
		</div>
</div>
</body>
</html>