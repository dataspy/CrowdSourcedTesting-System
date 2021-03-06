<%@ page language="java" pageEncoding="utf-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>


<!DOCTYPE html>
<html:html lang="true">
  <head>
    <html:base />
    
    <!-- Meta, title, CSS, favicons, etc. -->
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
      <a href="index.jsp"><button type="button" class="btn btn-default btn-gradient btn-sm dropdown-toggle"> <span class="glyphicons glyphicons-home"></span>返回</button></a>
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
            <div class="panel-title"> <i class="fa fa-flask"></i> 公司发布者注册 </div>
            <div class="panel-btns pull-right"><span class=" panel-title-sm">验证</span>
              <div class="make-switch" id="switch1" data-on="warning" data-off="success">
                <input type="checkbox" id="switch2" checked="" />
              </div>
            </div>
          </div>
          <div class="panel-body">
            <form class="cmxform" enctype="multipart/form-data" action="registrationPublisher.do?method=publisherRegistration" id="commentForm" method="post" >
              <div id="rootwizard">
                <div class="wizard-wrapper">
                  <ul class="wizard-steps">
                    <li>
                      <div class="wizard-icon"><i class="fa fa-pencil"></i> </div>
                      <a href="#tab1" data-toggle="tab">填写注册信息</a></li>
                    <li>
                      <div class="wizard-icon"><i class="fa fa-user"></i> </div>
                      <a href="#tab2" data-toggle="tab">发送确认链接</a></li>
                    <li>
                      <div class="wizard-icon"><i class="fa fa-lock"></i> </div>
                      <a href="#tab3" data-toggle="tab">等待审核</a></li>
                  </ul>
                </div>
                <div class="row">
                  <div class="col-md-8 col-md-offset-2">
                    <div class="tab-content border-none">
                      <div class="tab-pane" id="tab1">
                        <p class="alert alert-warning">请您<b>正确填写</b> 注册信息</p>
                        
                        <div class="form-group">
                        <label for="web_url"> 注册邮箱 </label>
                          <div class="input-group"> <span class="input-group-addon"><i class="fa fa-envelope-o"></i> </span>
                            <input class="form-control" type="email" name="logEmail" placeholder="注册邮箱" required />
                          </div>
                        </div>
                        <div class="form-group">
                        <label for="web_url"> 密码</label>
                          <div class="input-group"> <span class="input-group-addon"><i class="fa fa-key"></i> </span>
                            <input class="form-control" type="password" name="password" placeholder="密码" required />
                          </div>
                        </div>
                        <div class="form-group">
                        <label for="web_url"> 注册人姓名 </label>
                          <div class="input-group"> <span class="input-group-addon"><i class="fa fa-user"></i> </span>
                            <input class="form-control" type="text" name="publisherName" placeholder="注册人姓名" required />
                          </div>
                        </div>
                        <div class="form-group">
                        <label for="web_url"> 联络邮箱 </label>
                          <div class="input-group"> <span class="input-group-addon"><i class="fa fa-envelope-o"></i> </span>
                            <input class="form-control" type="email" name="connectEmail" placeholder="联络邮箱" required />
                          </div>
                        </div>
                        <div class="form-group">
                        <label for="web_url"> 注册类型 </label>
                          <div class="input-group"> <span class="input-group-addon"><i class="fa fa-user"></i> </span>
                            <!-- <input class="form-control" type="text" name="type" placeholder="no类型" required />  -->
                           <select name="type" class="form-control">
                           <option value="0" selected="selected">公司注册</option>
                           <option value="1">个人注册</option>
                           </select>
                          </div>
                        </div>
                        <div class="form-group">
                        <label for="web_url"> 公司名称 </label>
                          <div class="input-group"> <span class="input-group-addon"><i class="fa fa-globe"></i> </span>
                            <input class="form-control" type="text" name="companyName" placeholder="公司名称" required />
                          </div>
                        </div>
                        <div class="form-group">
                        <label for="web_url"> 营业执照 </label>
                          <div class="input-group"> <span class="input-group-addon"><i class="fa fa-file-o"></i> </span>
                            <input id="营业执照" class="form-control" type="file" name="license" placeholder="营业执照" required></input>
                          <!--  <input type="text" id="datepicker" class="form-control datepicker margin-top-none" placeholder="23/9/2013" />
                          -->
                          </div>
                        </div>               
                        <div class="form-group">
                        <label for="web_url"> 公司图片 </label>
                          <div class="input-group"> <span class="input-group-addon"><i class="fa fa-chain"></i> </span>
                           <input class="form-control" type="file" name="photo" placeholder="公司图片" required /> 
                          </div>
                        </div>
                        <div class="form-group">
                        <label for="web_url"> 公司概述 </label>
                          <div class="input-group"> <span class="input-group-addon"><i class="fa fa-list-alt"></i> </span>
                          	 <textarea id="textArea" class="form-control" name="introduction" placeholder="公司概述"  rows="3"></textarea>
                          </div>
                        </div>
                        <div class="input-group">
                        
                            <span class="input-group-addon"></span>
                            
                        
                        </div>
                        <div class="form-group">
                          <input type="checkbox" class="checkbox" id="agree" name="agree" />
                          <label for="agree">请同意我们的使用条款</label>
                        </div>
                      </div>
                      <div class="tab-pane" id="tab3">
                        <p class="alert alert-info">验证成功 <b>正在审核</b> 请耐心等待</p>
                      </div>
                      <ul class="pager wizard">
                        <li class="previous first" style="display:none;"><a href="#">填写注册信息</a></li>
                        <li class="previous"><input class="btn btn-primary" type="submit" value="上一步" disabled="disabled"></li>
                        <li class="next last" style="display:none;"><a href="#">发送确认链接</a></li>
                        <li class="next"><input class="btn btn-primary" type="submit" value="下一步" /></li>
                        <li class="save" style="display:none;"><a href="#">等待审核</a></li>
                      </ul>
                    </div>
                  </div>
                </div>
              </div>
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
</html:html>
