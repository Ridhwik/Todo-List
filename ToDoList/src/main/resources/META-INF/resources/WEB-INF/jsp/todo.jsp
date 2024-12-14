<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
	<head>
	<link href = "webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel ="stylesheet">
		<title>TODO LIST</title>
	</head>
	<body>
		<div class ="container">
			<div>Welcome in my todo Application </div>
			<hr>
			<h1>Your Todo</h1>
			
			<table class ="table">
				<thead>
					<th>ID</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Done?</th>
					
				</thead>
				<tbody>
					<c:forEach items="${todo}" var = "todo">
					
					<tr>
						<td>${todo.id}</td>
						<td>${todo.description}</td>
						<td>${todo.targetdate}</td>
						<td>${todo.done}</td>
					</tr>
					
					</c:forEach>
				</tbody>
			</table>
		</div>
		
		<script src="webjars/bootstrap/5.1.3/css/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
		
	</body>

</html>