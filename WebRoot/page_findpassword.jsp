<%@ page language="java" pageEncoding="utf-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>


<!DOCTYPE html>
<!--[if IE 7]> <html lang="en" class="ie7"> <![endif]-->  
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->  
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->  
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->  
<html:html lang="true">
  <head>
    <html:base />
    
    <title>TCTEST</title>

    <!-- Meta -->
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="description" content="" />
    <meta name="author" content="" />

    <!-- CSS Global Compulsory-->
    <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" href="assets/css/style.css" />
    <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" href="assets/css/style_responsive.css" />
    <link rel="shortcut icon" href="favicon.ico" />        
    <!-- CSS Implementing Plugins -->    
    <link rel="stylesheet" href="assets/plugins/font-awesome/css/font-awesome.css" />
    <link rel="stylesheet" href="assets/plugins/countdown/css/countdown.css" />
    <!-- CSS Theme -->    
    <link rel="stylesheet" href="assets/css/themes/default.css" id="style_color" />
    <link rel="stylesheet" href="assets/css/themes/headers/default.css" id="style_color-header-1" />    
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
  
<body class="coming-soon-page">
<!--=== Style Switcher ===-->    
<i class="style-switcher-btn icon-cogs"></i>
<div class="style-switcher">
    <div class="theme-close"><i class="icon-remove"></i></div>
    <div class="theme-heading">主题颜色</div>
    <ul class="unstyled">
        <li class="theme-default theme-active" data-style="default" data-header="light"></li>
        <li class="theme-blue" data-style="blue" data-header="light"></li>
        <li class="theme-orange" data-style="orange" data-header="light"></li>
        <li class="theme-red" data-style="red" data-header="light"></li>
        <li class="theme-light" data-style="light" data-header="light"></li>
    </ul>
    <div class="coming-soon-logo"><a href="index.html"><img src="assets/img/logo2-default.png" width="71" heigt="26" alt="" /></a></div>
</div><!--/style-switcher-->
<!--=== End Style Switcher ===-->    

<div class="coming-soon-border"></div>

<!--=== Content Part ===-->    
<div class="container">
    <!-- Coming Soon Content -->
    <div class="row-fluid">
        <div class="span12 coming-soon">
            <h1>修改密码</h1>
            <p>我们会将您的密码重置链接发回到您的注册邮箱中，您可以通过重置链接进行密码修改<br/>
            请在此处填写您的邮箱：</p><br />
            <form class="form-search" action="findpassword.do?method=testerSendCode" method="post">
                <input type="text" class="input-large search-query" name="email" placeholder="Email地址" />
                <button type="submit" class="btn-u">发送链接</button>
            </form>
           
        </div>
    </div>

<div class="row-fluid">
        <div class="span12 coming-soon">
        <%
        	if(request.getAttribute("errors") != null)
        	{
        %>
           <div class="alert alert-success">
                <button type="button" class="close" data-dismiss="alert">&times;</button>
                <html:errors/>
           </div> 
        <%
        	}
        %>
    </div>
    <!-- Coming Soon Footer -->
    <div class="row-fluid">
        <div class="span6">
                    
        </div>
        <div class="span6 coming-soon-copyright">
            <p>2014 © TCTEST - All right reserved</p>
        </div>
    </div>
</div><!--/container-->
<!--=== End Content Part ===-->

<!-- JS Global Compulsory -->           
<script type="text/javascript" src="assets/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="assets/js/modernizr.custom.js"></script>        
<script type="text/javascript" src="assets/plugins/bootstrap/js/bootstrap.min.js"></script> 
<!-- JS Implementing Plugins -->           
<script type="text/javascript" src="assets/plugins/countdown/jquery.countdown.js"></script>
<script type="text/javascript" src="assets/plugins/backstretch/jquery.backstretch.min.js"></script>
<script type="text/javascript" src="assets/plugins/back-to-top.js"></script>
<!-- JS Page Level -->           
<script type="text/javascript" src="assets/js/app.js"></script>

<script>
    $.backstretch([
      "assets/img/bg/1.png",
      "assets/img/bg/3.png",
      "assets/img/bg/2.png"
      ], {
        fade: 1000,
        duration: 7000
    });
</script>

<script type="text/javascript">
    $(function () {
        var austDay = new Date();
        austDay = new Date(austDay.getFullYear() + 1, 1 - 1, 26);
        $('#defaultCountdown').countdown({until: austDay});
        $('#year').text(austDay.getFullYear());
    });
</script>

<script type="text/javascript">
    jQuery(document).ready(function() {
        App.init();
    });
</script>
<!--[if lt IE 9]>
    <script src="assets/js/respond.js"></script>
<![endif]-->
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>

</html:html>
