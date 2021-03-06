<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!doctype html>
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]> <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]> <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js" lang=""> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>管理系统</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${ctx}/resource/admin/assets/css/normalize.css">
    <link rel="stylesheet" href="${ctx}/resource/admin/assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="${ctx}/resource/admin/assets/css/font-awesome.min.css">
    <link rel="stylesheet" href="${ctx}/resource/admin/assets/css/style.css">
    <style>
    @page { margin: 0; }
    </style>
</head>

<body>
<!-- Left Panel -->
<aside id="left-panel" class="left-panel">
    <nav class="navbar navbar-expand-sm navbar-default">
        <div id="main-menu" class="main-menu collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active">
                    <a href="${ctx}/organizer/index"><i class="menu-icon fa fa-calendar"></i>比赛信息</a>
                </li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </nav>
</aside>
<!-- /#left-panel -->
<!-- Right Panel -->
<div id="right-panel" class="right-panel">
    <!-- Header-->
    <header id="header" class="header">
        <div class="top-left">
            <div class="navbar-header">
                <a class="navbar-brand" href="./"><img src="${ctx}/resource/admin/images/logo.png" alt="Logo"></a>
                <a class="navbar-brand hidden" href="./"><img src="${ctx}/resource/admin/images/logo2.png"
                                                              alt="Logo"></a>
                <a id="menuToggle" class="menutoggle"><i class="fa fa-bars"></i></a>
            </div>
        </div>
        <div class="top-right">
            <div class="header-menu">
                <div class="user-area dropdown float-right">
                    <a href="#" class="dropdown-toggle active" data-toggle="dropdown" aria-haspopup="true"
                       aria-expanded="false">
                        <img class="user-avatar rounded-circle" src="${ctx}/resource/admin/images/admin.jpg"
                             alt="User Avatar">
                    </a>
                    <div class="user-menu dropdown-menu">
                        <a class="nav-link" href="${ctx}/logout"><i class="fa fa-power -off"></i>Logout</a>
                    </div>
                </div>

            </div>
        </div>
    </header>
    <!-- /#header -->
    <!-- Content -->
    <div class="content">
        <div class="animated fadeIn">
            <div class="clearfix"></div>
            <div class="orders">
                <div class="row">
                    <div class="col-xl-12">
                        <div class="card">
                            <div class="card-header">
                                <strong class="card-title">比赛信息</strong>
                            </div>
                            <div class="card-body">
                                <!-- Credit Card -->
                                <div id="pay-invoice">
                                    <div class="card-body">
                                        <form action="${ctx}/organizer/create" method="post" novalidate="novalidate" enctype="multipart/form-data">
                                            <input type="hidden" name="role" value="organizer">
                                            <input type="hidden" name="id" value="${competition.id}">
                                            <input type="hidden" name="organizerId" value="${sessionScope.id}">
                                            <input type="hidden" name="referenceData" value="${competition.referenceData}">
                                            <div class="form-group">
                                                <label for="cc-payment" class="control-label mb-1">标题</label>
                                                <input id="cc-payment" name="title" type="text" class="form-control" value="${competition.title}">
                                            </div>
                                            <div class="form-group has-success">
                                                <label for="cc-name" class="control-label mb-1">内容</label>
                                                <input id="cc-name" name="content" type="text" class="form-control cc-name valid" value="${competition.content}">
                                            </div>
                                            <div class="form-group has-success">
                                                <label for="cc-num" class="control-label mb-1">人数</label>
                                                <input id="cc-num" name="studentsNum" type="text" class="form-control cc-name valid" value="${competition.studentsNum}">
                                            </div>
                                            <div class="form-group has-success">
                                                <label for="cc-starttime" class="control-label mb-1">开始时间</label>
                                                <input id="cc-starttime" name="startTime" type="text" class="form-control cc-name valid" value="<fmt:formatDate value="${competition.startTime}" pattern="yyyy-MM-dd"/>">
                                            </div>
                                            <span style="color: red;">单人比赛请在比赛开始前两天发送准考证</span>
                                            <div class="form-group has-success">
                                                <label for="cc-endtime" class="control-label mb-1">结束时间</label>
                                                <input id="cc-endtime" name="endTime" type="text" class="form-control cc-name valid" value="<fmt:formatDate value='${competition.endTime}' pattern='yyyy-MM-dd'/>">
                                            </div>
                                            <div class="form-group has-success">
                                                <label for="cc-ref" class="control-label mb-1">参考资料</label>
                                                <input id="cc-ref" name="refFile" multiple type="file" class="form-control cc-name valid">
                                            </div>
                                            <div>
                                                <button id="payment-button" type="submit" class="btn btn-lg btn-info btn-block">
                                                    <i class="fa fa-lock fa-lg"></i>&nbsp;
                                                    <span id="payment-button-amount">保存</span>
                                                </button>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="${ctx}/resource/admin/assets/js/vendor/jquery-2.1.4.min.js"></script>
<script src="${ctx}/resource/admin/assets/js/popper.min.js"></script>
<script src="${ctx}/resource/admin/assets/js/plugins.js"></script>
<script src="${ctx}/resource/admin/assets/js/main.js"></script>
</body>
</html>
