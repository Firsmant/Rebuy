<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
		<meta charset="utf-8"> 
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>Berg - BergTheme HTML</title>
		<meta name="description" content="">
		<meta name="msapplication-tap-highlight" content="yes" />

		<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1, minimum-scale=1.0, maximum-scale=1.0, minimal-ui" />
		<link href='http://fonts.useso.com//css?family=Cabin:400,400italic,500,600,700' rel='stylesheet' type='text/css'>
		<link href='http://fonts.useso.com//css?family=Open+Sans:300italic,400italic,400,300,600,700,800&amp;subset=latin,latin-ext' rel='stylesheet' type='text/css'>
<!--		 Place favicon.ico and apple-touch-icon.png in the root directory -->
		<link rel="stylesheet" href="css/custom.css">
		<script src="js/jquery-2.1.0.min.js"></script>
		<script src="js/modernizr-2.6.2.min.js"></script>
		


    </head>
    <body class="show-nav nav-center home-page yo-anim-enabled">

		<!--content-->


<nav id="main-navbar" class="hidden-xs hidden-sm">
	<div class="nav hidden-xs">
		<div class="main-reorder pull-right">
			<a href="#">
				<i class="fa fa-bars"></i>			</a>		</div>

		<div class="logo pull-left">
			<a href="index.html">
				<figure>
					<img src="img/logo1.png" class="light-logo" alt="Berg HTML Theme"/>
					<img src="img/logo2.png" class="dark-logo" alt="Berg HTML Theme"/>
				</figure>
			</a>
		</div>
		<div class="main-nav">
			<ul class="pull-right">
				<li>
					<a href="index.html" class="active active2 active3 active4 active5">主页</a>
					<div class="subnav">
						<ul class="subnav-wrapper">						
						</ul>
					</div>					
			  </li>				
				<li>
					<a href="blog.html" class="">新品上架</a>
					<div class="subnav">
						<ul class="subnav-wrapper">
						</ul>
					</div>
			  </li>
				<li>
					<a href="menu.html" class="hover-subnav ">分类</a>
					<div class="subnav image-subnav">
						<ul class="subnav-wrapper">			
							<li>
								<a href="menu.html#promotions">书籍</a>
								<div>
									<a href="menu.html#starters" class="menu-img" style="background-image: url('http://placehold.it/500x500')"></a>								</div>
							</li>		
							<li>
								<a href="menu.html#starters">数码产品</a>
								<div>
									<a href="menu.html#starters" class="menu-img" style="background-image: url('http://placehold.it/500x500')"></a>								</div>
							</li>
							<li>
								<a href="menu.html#salads">自行车</a>
								<div>							
									<a href="menu.html#salads" class="menu-img" style="background-image: url('http://placehold.it/500x500')"></a>								</div>
							</li>
							<li>
								<a href="menu.html#soups">电器</a>
								<div>
									<a href="menu.html#soups" class="menu-img" style="background-image: url('http://placehold.it/500x500')"></a>								</div>
							</li>
							<li>
								<a href="menu.html#mains">生活用品</a>
								<div>
									<a href="menu.html#mains" class="menu-img" style="background-image: url('http://placehold.it/500x500')"></a>								</div>
							</li>
							<li>
								<a href="menu.html#desserts">文具类</a>
								<div>
									<a href="menu.html#desserts" class="menu-img" style="background-image: url('http://placehold.it/500x500')"></a>								</div>
							</li>
							<li>
								<a href="menu.html#drinks">其他</a>
								<div>							
									<a href="menu.html#drinks" class="menu-img" style="background-image: url('http://placehold.it/500x500')"></a>								</div>
							</li>
						</ul>
					</div>
			  </li>	
				<li>
					<a href="reservation.html" class="">会员登录</a>				</li>
				<li>
					<a href="contact.html" class="">注册</a>				</li>
				<li>
					<a href="shop.html" class="">我的buyer</a>				</li>
				<li>
					<a href="#" class="hover-subnav">帮助</a>
					<div class="subnav">
						<ul class="subnav-wrapper ">			
						</ul>
					</div>
			  </li>				
			</ul>
		</div>
	</div>
</nav>
<div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >手机网站模板</a></div>
<div id="mobile-nav" class="visible-xs visible-sm">
	<header>
		<div class="container-fluid">
			<ul class="menu-header">
				<li class="pull-left">
					<a href="index.html" class="logo">
						<figure>
							<img src="img/logo2.png" alt="Berg HTML Theme"/>
						</figure>
					</a>
				</li>
				<li class="reorder pull-right"><a href="#" title=""><i class="fa fa-bars"></i></a></li>
			</ul>
		</div>
	</header>	
	<div class="" id="flyout-container">
		<ul id="mobile-navbar" class="nav flyout-menu main-nav nav-height">
			<li class="nav-item">
				<a title="" href="index.html">home</a>
			</li>
			<li class="nav-item">
				<a title="" href="blog.html">blog</a>
				<span class="open-children"><i class="fa fa-angle-down"></i></span>
				<ul class="subnav">
					<li>
						<a href="blog.html"><span>blog</span></a>
					</li>
					<li><a href="post.html" title=""><span>post 1</span></a></li>
					<li><a href="post2.html" title=""><span>post 2</span></a></li>
				</ul>
			</li>
			<li class="nav-item">
				<a title="" href="restaurant.html">Restaurant</a>
			</li>
			<li class="nav-item">
				<a title="" href="menu.html" class="">Menu</a>
				<span class="open-children"><i class="fa fa-angle-down"></i></span>
				<ul class="subnav">
					<li><a href="menu.html" title=""><span>Menu 1</span></a></li>
					<li><a href="menu2.html" title=""><span>Menu 2</span></a></li><li><a href="http://www.mobantu.com" title=""><span>more</span></a></li>
				</ul>
			</li>
			<li class="nav-item">
				<a title="" href="reservation.html">Reservation</a>
			</li>
			<li class="nav-item">
				<a title="" href="contact.html">Contact</a>
			</li>
			<li class="nav-item">
				<a title="" href="shop.html">Shop</a>
			</li>
			<li class="nav-item">
				<a title="" href="gallery.html">Gallery</a>
			</li>
		</ul>
	</div>
</div>



<header id="home" class="main-section home hidden-xs"> 
	<div class="home-fullscreen"> 
		<div class="container-fluid">
			<div class="basic-info ">
				<div class="clearfix"></div>
				<div class="open-daily yo-anim yo-anim-fade-ltr" data-animation-delay="200">
					<span class="day">service</span>          </div>
				<div class="open-daily yo-anim yo-anim-fade-ltr" data-animation-delay="200">
					<span class="day">Monday - Thursday</span>
					<span class="hours">7.00 - 21.00</span>				</div>
				<div class="open-daily yo-anim yo-anim-fade-ltr" data-animation-delay="500">
					<span class="day">Friday - Sunday</span>
					<span class="hours">7.00 - 23.00</span>				</div>
				<ul class="social-icon yo-anim yo-anim-fade-ltr" data-animation-delay="1400">
					<li>
						<a href="#"><i class="fa fa-facebook"></i></a>					</li>
					<li>
						<a href="#"><i class="fa fa-twitter"></i></a>					</li>
					<li>
						<a href="#"><i class="fa fa-pinterest"></i></a>					</li>
					<li>
						<a href="#"><i class="fa fa-google-plus"></i></a>					</li>
					<li>
						<a href="#"><i class="fa fa-youtube"></i></a>					</li>
				</ul>
			</div>
		</div>
		
	</div>
</header>
<div class="visible-xs mobile-basic-info">
	<div id="footer-spacer"></div>
<footer id="footer" class="text-center">

	<a href="#" class="to-the-top">
		<i class="fa fa-arrow-circle-o-up"></i>	</a>

	<h2>Berg restaurant</h2>
	<div class="container">
		<div class="row">
			<div class="col-md-8 col-md-offset-2 text-center v-card">

					<div class="col-sm-6 col-lg-3">
						<div class="open-daily">
							<span class="day">Monday - Thursday</span>
							<span class="hours">7.00 - 21.00</span>
						</div>
					</div>
					<div class="col-sm-6 col-lg-3">	
						<div class="open-daily">
							<span class="day">Friday - Sunday</span>
							<span class="hours">7.00 - 23.00</span>
						</div>
					</div>	
			</div>
		</div>
	</div>
			<ul class="social-icon clearfix">
				<li>
					<a href="#"><i class="fa fa-facebook"></i></a>
				</li>
				<li>
					<a href="#"><i class="fa fa-twitter"></i></a>
				</li>
				<li>
					<a href="#"><i class="fa fa-pinterest"></i></a>
				</li>
				<li>
					<a href="#"><i class="fa fa-google-plus"></i></a>
				</li>
				<li>
					<a href="#"><i class="fa fa-instagram"></i></a>
				</li>
			</ul>

</footer>
	<div class="home-bg-image"></div>
</div>


		<div class="gallery-wrapper"></div>

		<div id="preloader">
			<div id="status">
				<div class="loading-wrapper">
					<img src="img/blank.png" alt="Loading" />				</div>
			</div>
			<div id="status-loaded"></div>
		</div>

		<script src="js/browser.js"></script>
		<script src="js/jquery.ba-throttle-debounce.min.js"></script>
		<script src="js/jquery.smooth-scroll.js"></script>
		<script src="js/matchmedia.js"></script>
		<script src="js/enquire.min.js"></script>
		<script src="js/jquery.velocity.min.js"></script>
		<script src="js/waypoints.js"></script>		
		<script src="js/owl.carousel.js"></script>
		<script src="js/jquery.mb.YTPlayer.js"></script>
		<script src="js/jquery.parallaxify.js"></script>
		<script src="js/jquery.imagesloaded.js"></script>
		<script src="js/jquery.unveil.min.js"></script>
		<script src="js/jquery.superslides.min.js"></script>
		<script src="js/jquery.fullPage.min.js"></script>
		<script src="js/jquery.mixitup.js"></script>
		<script src="js/main.js"></script>
	</body>
</html>
