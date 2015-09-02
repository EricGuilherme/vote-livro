<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList"%>
<jsp:include page="../head.jsp"></jsp:include>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-4">
						<div class="page-header">
							<h1>
								Ranking General <small>Here this the best books</small>
							</h1>
						</div>
					</div>
					<div class="col-md-4"></div>
				</div>
				<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-4">
						<table class="table table-hover">
							<thead>
								<tr>
									<th>Book</th>
									<th>Amount wishes</th>
								</tr>
								<c:forEach var="votacao" items="${votacoes}">
									<tr>
										<td>${votacao.livro.nome}</td>
										<td>${votacao.voto}</td>
									</tr>
								</c:forEach>
							</thead>
							<tbody>
							</tbody>
						</table>
					</div>
					<div class="col-md-4"></div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>