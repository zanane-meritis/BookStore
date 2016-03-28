<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<title>Meritis BookStore</title>
<!-- Bootstrap core CSS -->
<link href="<c:url value="/assets/bootstrap/css/bootstrap.min.css"/>"
	rel="stylesheet">
<!-- Custom styles for this template -->
<link href="<c:url value="/assets/bootstrap/css/index.css"/>"
	rel="stylesheet">
</head>
<body>
	<div class="site-wrapper">
		<div class="site-wrapper-inner">
			<div class="cover-container">
				<div class="masthead clearfix">
					<div class="inner">
						<h3 class="masthead-brand">BookStore</h3>
						<nav>
							<ul class="nav masthead-nav">
								<li class="active"><a href="<c:url value="/"/>">Home</a></li>
								<li><a href="#">Features</a></li>
								<li><a href="#">Contact</a></li>
								<li><a href="<c:url value="/login"/>">Log In</a></li>
							</ul>
						</nav>
					</div>
				</div>
				<div class="inner cover">
					<h1 class="cover-heading">Select a quote</h1>
					<p class="lead">Cover is a one-page template for building
						simple and beautiful home pages. Download, edit the text, and add
						your own fullscreen background photo to make it your own.</p>
					<p class="lead">
						<a href="#" class="btn btn-lg btn-default">Learn more</a>
					</p>
				</div>

				<div class="mastfoot">
					<div class="inner">
						<p>
							Cover template for <a href="http://getbootstrap.com">Bootstrap</a>,
							by <a href="https://twitter.com/mdo">@mdo</a>.
						</p>
					</div>
				</div>

			</div>

		</div>

	</div>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!--<script> window.jQuery || document .write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>-->
	<script src="<c:url value="/assets/bootstrap/js/bootstrap.min.js"/>"></script>
</body>