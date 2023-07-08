<html>
	<head>
		<title>5 esercizio</title>
	</head>

<body>
	<form id="formID" class="form-horizontal">
				
	<div class="form-group first_division">
	<label class="col-sm-3 control-label">Enter Name</label>
	<div class="col-sm-6">
	<input type="text" id="txt_name" name="yourname" class="form-control" placeholder="enter name" />
	</div>
	</div>
				
	<div class="form-group first_division">
	<div class="col-sm-offset-3 col-sm-6 m-t-15">
	<input type="button" id="btn_submit" class="btn btn-success btn-block" value="Submit">
	</div>
	</div>
			
	<h2 class="text-success text-center" id="show_result"></h2>
					
</form>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript">
    $(document).ready(function(){
       $('#btn_submit').click(function(){
    	   
        var name=$('#txt_name').val();
        var randomInt = Math.floor(Math.random()*100);
         
        if(name=="")
       	{
			alert(randomInt)	 
        }
        else
        {
            $.ajax({
               url:'Servlet2',
               type:'POST',
               data:'yourname='+name,
               success:function(response)
               {
                   $('#show_result').html(response);
                   $('#formID')[0].reset();
               }
            });
        }
         
		}); 
    });
</script>
</body>
	
	
</html>