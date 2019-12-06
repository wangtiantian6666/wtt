<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link  href="css/css.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<title>Insert title here</title>
</head>
<body>
	<form>
		<input name="gid" value="${param.id}"><br>
		<input name="gname"><br>
		<input name="bid"><br>
		<input name="kid"><br>
		<input name="datea" type="date"><br>
		<input name="price"><br>
		<input type="button" value="修改" onclick="upd()">
	</form>
</body>
<script type="text/javascript">
	$.post("getKind",function(num){
		for ( var i in num) {
			$("select").append("<option value="+num[i].kid+">"+num[i].kname+"</option>");
		}
		var id=${param.id }
		$.post("getById",{id:id},function(num){
			$("[name=gname]").val(num.gname);
			$("[name=bid]").val(num.bid);
			$("[name=kid]").val(num.kid);
			$("[name=datea]").val(num.datea);
			$("[name=price]").val(num.price);
		},"json");
	
	});
	function upd() {
		$.post("upd",$("form").serialize(),function(){
			location="show";
		},"json");
	}
	
</script>
</html>