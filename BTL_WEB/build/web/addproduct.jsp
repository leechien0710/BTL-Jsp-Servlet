<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<head>
<title>Admin-talbe | nhom 6</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Visitors Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstrap-css -->
<link rel="stylesheet" href="pageadmin/css/bootstrap.min.css" >
<!-- //bootstrap-css -->
<!-- Custom CSS -->
<link href="pageadmin/css/style.css" rel='stylesheet' type='text/css' />
<link href="pageadmin/css/style-responsive.css" rel="stylesheet"/>
<!-- font CSS -->
<link href='//fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<!-- font-awesome icons -->
<link rel="stylesheet" href="pageadmin/css/font.css" type="text/css"/>
<link href="pageadmin/css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons -->
<script src="pageadmin/js/jquery2.0.3.min.js"></script>
</head>
<body>
<section id="container">
<!--header start-->
<header class="header fixed-top clearfix">
<!--logo start-->
<div class="brand">

    <a href="index.html" class="logo">
        ADMIN
    </a>
    <div class="sidebar-toggle-box">
        <div class="fa fa-bars"></div>
    </div>
</div>
<!--logo end-->

<div class="top-nav clearfix">
    <!--search & user info start-->
    <ul class="nav pull-right top-menu">
        <li>
            <input type="text" class="form-control search" placeholder=" Search">
        </li>
    </ul>
    <!--search & user info end-->
</div>
</header>
<!--header end-->
<!--sidebar start-->
<aside>
    <div id="sidebar" class="nav-collapse">
        <!-- sidebar menu start-->
        <div class="leftside-navigation">
            <ul class="sidebar-menu" id="nav-accordion">
                <li>
                    <a href="admin.jsp">
                        <i class="fa fa-dashboard"></i>
                        <span>Add product</span>
                    </a>
                </li>
            </ul>            </div>
        <!-- sidebar menu end-->
    </div>
</aside>
<!--sidebar end-->
<!--main content start-->
<section id="main-content">
	<section class="wrapper">
        <div class="row">
            <div class="col-lg-12">
                    <section class="panel">
                        <header class="panel-heading">
                            Add product
                        </header>
                        <div class="panel-body">
                            <div class="position-center">
                            <form role="form" action="add" method="post" >
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Product Name</label>
                                    <input type="text" name="product_name" class="form-control" id="exampleInputEmail1" placeholder="Tên danh mục">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Product Price</label>
                                    <input type="text" name="product_price" class="form-control" id="exampleInputEmail1" placeholder="Giá sản phẩm">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Product Image</label>
                                    <input type="file" name="product_image" class="form-control" id="exampleInputEmail1">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Product Description</label>
                                    <textarea style="resize: none;" rows="8" class="form-control" name="product_desc" id="exampleInputPassword1" placeholder="Mô tả danh mục"></textarea> 
                                </div>
                                
                                
                                <div class="form-group">
                                <label for="exampleInputPassword1">Show Product</label>
                                    <select name="product_status" class="form-control  m-bot15">
                                        <option value="0">Hidden</option>
                                        <option value="1">Show</option>
                                    </select>
                                </div>
                        
                                <button type="submit" name="add_category_product" class="btn btn-info">Add Product</button>
                            </form>
                            </div>

                        </div>
                    </section>

            </div>
    </section>

<!--main content end-->
</section>
<script src="pageadmin/js/bootstrap.js"></script>
<script src="pageadmin/js/jquery.dcjqaccordion.2.7.js"></script>
<script src="pageadmin/js/scripts.js"></script>
<script src="pageadmin/js/jquery.slimscroll.js"></script>
<script src="pageadmin/js/jquery.nicescroll.js"></script>
<!--[if lte IE 8]><script language="javascript" type="text/javascript" src="pageadmin/js/flot-chart/excanvas.min.js"></script><![endif]-->
<script src="pageadmin/js/jquery.scrollTo.js"></script>
</body>
</html>
