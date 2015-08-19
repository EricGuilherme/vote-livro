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
								The best books <small>of years</small>
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
</div>
</body>
</html>