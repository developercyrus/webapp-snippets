<html>
	<head>
	    <title>WebJars Sample - Jetty WAR</title>
	    <script type='text/javascript' src='<%=org.webjars.AssetLocator.getWebJarPath("jquery.min.js")%>'></script>
	    <script type="text/javascript">
		    $(document).ready(function() {             
	            $("#addButton").click(function() {          
	                $("#weather").text("Rainy");             
	            });
	        });
	    </script>
	</head>
	<body>
	    <h1>Message : ${message}</h1>  
        <label id="weather">Sunny</label><br>
        <input type='button' value='change' id='addButton'>
	</body>
</html>