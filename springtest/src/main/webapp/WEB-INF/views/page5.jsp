<html>
	<head>
		<title>5 esercizio</title>
	</head>

<body>
	<form method="POST" id="formID" class="form-horizontal">
				
	<div class="form-group first_division">
	<input type="button" id="btn_submit" class="btn btn-success btn-block" value="Submit">
	</div>
			
	<h2 class="text-success text-center" id="show_result"></h2>
					
</form>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript">
    $(document).ready(function(){
       $('#btn_submit').click(function(){
    	   $.ajax({
    		   url: 'ajax'
    		   type: "POST"
    		   success: function(response) {
    			   alert(${randomint})
    		   }
    	   })
        }
         
		}); 
    });
</script>
</body>
	
	
</html>