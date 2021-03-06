<%@page import="java.util.Date"%>
<%@ page language="java" pageEncoding="utf-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>


<!DOCTYPE html>
<html lang="true">
  <head>
    <html:base />
    
    <meta charset="utf-8" />
	<title>TCTEST</title>
	<meta name="keywords" content="TCTEST" />
	<meta name="description" content="Stardom - A Responsive HTML5 Admin UI Template Theme" />
	<meta name="author" content="Rain Cheng" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />

	<!-- Font CSS  -->
	<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Open+Sans:400,600,700" />

	<!-- Core CSS  -->
	<link rel="stylesheet" type="text/css" href="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" />
	<link rel="stylesheet" type="text/css" href="fonts/glyphicons_pro/glyphicons.min.css" />

	<!-- Plugin CSS -->
	<link rel="stylesheet" type="text/css" href="vendor/plugins/formswitch/css/bootstrap-switch.css" />

	<!-- Theme CSS -->
	<link rel="stylesheet" type="text/css" href="css/theme.css" />
	<link rel="stylesheet" type="text/css" href="css/pages.css" />
	<link rel="stylesheet" type="text/css" href="css/plugins.css" />
	<link rel="stylesheet" type="text/css" href="css/responsive.css" />
	<link rel="stylesheet" type="text/css" href="vendor/plugins/datepicker/datepicker.css" />
	<!-- Demonstration CSS -->
	<link rel="stylesheet" type="text/css" href="css/demo.css" />

	<!-- Your Custom CSS -->
	<link rel="stylesheet" type="text/css" href="css/custom.css" />

	<!-- Favicon -->
	<link rel="shortcut icon" href="img/favicon.ico" />

	<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!--[if lt IE 9]>
  	<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
  	<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
	<![endif]-->
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
<body>
<!-- Start: Header -->
<header class="navbar navbar-fixed-top">
  <div class="pull-left"> <a class="navbar-brand" href="index.html">
    <div class="navbar-logo"><img src="img/logos/logo-red.png" class="img-responsive" alt="logo" /></div>
    </a> </div>
  <div class="pull-right header-btns">
 


    <div class="btn-group user-menu">
      <a href="index.html"><button type="button" class="btn btn-default btn-gradient btn-sm dropdown-toggle"> <span class="glyphicons glyphicons-home"></span>返回</button></a>
    </div>
  </div>
</header>
<!-- End: Header --> 
<!-- Start: Main -->
<div id="main"> 
 
  <!-- Start: Content -->
  <section id="content-reg">

    <div class="container">
    <div class="row">
      <div class="col-md-10 col-md-offset-1">
        <div class="progress hidden">
          <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 0%;"></div>
        </div>
        <div class="panel">
          <div class="panel-heading">
            <div class="panel-title"> <i class="fa fa-flask"></i>注册 </div>
            <div class="panel-btns pull-right"> <span class=" panel-title-sm">验证</span>
              <div class="make-switch" id="switch1" data-on="warning" data-off="success">
                <input type="checkbox" id="switch2" checked="" />
              </div>
            </div>
          </div>
          
          <div class="panel-body">
          <h2 class="text-info">验证码确认</h2>
          <hr/>
            	<form id="verify_code" action="registrationTester.do?method=testerRegistration" method="post">
                	<div class="col-md-6 col-md-offset-3">
                	<div class="alert alert-info">
                    	请正确填写您收到的验证码
                    </div>
                    <div class="input-group">
                    	<span class="input-group-addon"><i class="fa fa-key"></i></span>
                        <input class="form-control valid" type="text" required placeholder="验证码" id="vcode" name="randomcode" onblur="checkCode();"></input>
                    </div>
                    <span class="text-error" id="nonempty3" style="display:none;">字段不能为空</span>
    				<span class="text-error" id="error" style="display:none;">验证码输入错误</span>
                    <hr/>
                    <div class="text-center">
                    <p>
                    	<button class="btn btn-success btn-gradient btn-lg" type="submit" >提交</button>
                    </p>
                    </div>
                    </div>
                    
                    <input class="form-control" type="text" name="email" value=<%=(String)request.getAttribute("email") %> style="display:none;" />
    				<input class="form-control" type="password" name="password" value=<%=(String)request.getAttribute("password") %> style="display:none;" />
   					<input class="form-control" type="text" name="name" value=<%=(String)request.getAttribute("name") %> style="display:none;" />
    				<input class="form-control" type="text" name="gender" value=<%=(Boolean)request.getAttribute("gender") %> style="display:none;" />
    				<input class="form-control" type="text" name="mobile" value=<%=(String)request.getAttribute("mobile") %> style="display:none;" />
    				<input type="text" id="datepicker" class="form-control datepicker margin-top-none" value=<%=(String)request.getAttribute("birthday") %> style="display:none;" />
                    
                </form>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-md-8 col-md-offset-2"> </div>
      </div>
    </div>
   </div> 
  </section>
  <!-- End: Content --> 
</div>
<!-- End: Main --> 

<!-- Core Javascript - via CDN --> 
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>  
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
<script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script> 

<!-- Plugins --> 
<script type="text/javascript" src="vendor/plugins/validate/jquery.validate.js"></script> 
<script type="text/javascript" src="vendor/plugins/formwizard/jquery.bootstrap.wizard.js"></script> 
<script type="text/javascript" src="vendor/plugins/formswitch/js/bootstrap-switch.min.js"></script> 
<script type="text/javascript" src="vendor/plugins/datepicker/bootstrap-datepicker.js"></script>
<!-- Theme Javascript --> 
<script type="text/javascript" src="js/uniform.min.js"></script> 
<script type="text/javascript" src="js/main.js"></script>
<script type="text/javascript" src="js/custom.js"></script> 
<script type="text/javascript">
 jQuery(document).ready(function() {

	  // Init Theme Core 	  
	 Core.init();
	
	  //Init jquery Date Picker
	 $('.datepicker').datepicker()
	 
	  //var validateCheck 
	  var $validator = $("#commentForm").validate({
		  errorPlacement: function(error, element) {
			element.parent().parent().append( error );
		  }
	  });
	  
	  // init bootstrap form wizard
	  $('#rootwizard').bootstrapWizard({
		  'tabClass': '',
		  
		  'onNext': function(tab, navigation, index) {
				  var $valid = $("#commentForm").valid();
				  var $total = navigation.find('li').length;
				  var $current = index+1;
				  var $percent = ($current/$total) * 100;
				  var $cur = index;			
				  var valSwitch = $('#switch1').children();
				  
			  if (valSwitch.hasClass('switch-on')) {
				  
				  if(!$valid) {
					  $validator.focusInvalid();
					  return false;
				  }
				  else {
					  $('ul.wizard-steps li:nth-child(' + $cur + ')').addClass('passed');
					  $('#rootwizard').find('.progress-bar').animate({width:$percent+'%'});
				  }	
			  }
			  else {
				  $('ul.wizard-steps li:nth-child(' + $cur + ')').addClass('passed');
				  $('#rootwizard').find('.progress-bar').animate({width:$percent+'%'});
			  }
  
			  if ($current == $total) {
				  $('li.save').show();
			  }
		  },
	  
		  'onPrevious': function(tab, navigation, index) {	
			  var $valid1 = $("#commentForm").valid();			
			  var $total = navigation.find('li').length;
			  var $current = index+1;
			  var $percent = ($current/$total) * 100;
			  var valSwitch1 = $('#switch1').children();
			  
			  if ($current == 0) {
				  return false;
				  
			  }
			  else if (valSwitch1.hasClass('switch-on')) {
			  
				  if (!$valid1) {
					  $validator.focusInvalid();
					  return false;
				  }
				  else {
					  $('#rootwizard').find('.progress-bar').animate({width:$percent+'%'});
				  }
			  }				
		  },
		  'onTabClick': function(tab, navigation, index) {
				  return false;
		  }
		  
	  });	
	
 });
</script>
</body>
<script type="text/javascript">
	function checkCode()
	{
		var code = document.getElementById("vcode").value;
		var randomcode = "<%=request.getAttribute("randomcode")%>";
		if(code == "")
		{
			document.getElementById("nonempty3").style.display = "block";
			document.getElementById("error").style.display="none";
			return false;
		}
		else if(randomcode != code)
		{
			document.getElementById("nonempty3").style.display = "none";
			document.getElementById("error").style.display="block";
			return false;
		}
		else if(randomcode == code)
		{
			document.getElementById("nonempty3").style.display = "none";
			document.getElementById("error").style.display="none";
			document.getElementById("comfirm").disabled = " ";
			return true;
		}
	}
</script>
</html>
