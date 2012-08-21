<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta name="viewport"  content="initial-scale=1.0,user-scalable=no">
<title>非正常人聚集所</title>

<link rel="stylesheet" type="text/css" href="/gathering/theme/default/index.css">
<script type="text/javascript" src="/gathering/js/factar.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	_BDMAP= new BMap.Map('bdmap');
	_BDMAP.centerAndZoom(new BMap.Point(116.404, 39.915), 11);
	_BDMAP.enableScrollWheelZoom();
	_BDMAP.addControl(new BMap.NavigationControl({offset: new BMap.Size(20,110)}));//左侧导航控件
	_BDMAP.addControl(new BMap.OverviewMapControl());//鹰眼控件
	_BDMAP.addControl(new BMap.ScaleControl());// 比例尺控件
	_BDMAP.addControl(new BMap.MapTypeControl({anchor:BMAP_ANCHOR_TOP_LEFT,offset:new BMap.Size(20,80)}));//地图类型控件
// 	_BDMAP.addControl(new BMap.CopyrightControl());//
});

</script>

</head>
<body>
<div id="bdmap"> 
</div>
<div id="banner"></div>
<!-- <div id=""></div> -->
</body>
</html>