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
		<input name="gname"><br>
		<input name="bid"><br>
		<select name="kid">
		
		</select><br>
		<input name="datea" type="date"><br>
		<input name="price"><br>
		<input type="button" value="添加" onclick="add()">
	</form>
</body>
<script type="text/javascript">
	$.post("getKind",function(num){
		for ( var i in num) {
			$("select").append("<option value="+num[i].kid+">"+num[i].kname+"</option>");
		}
	});
	function add(n) {
		$.post("save",$("form").serialize(),function(){
			if(n==0){
				alert("保存失败")
			}else{
				alert("保存成功")
				location="show";
			}
		});
	}
	
</script>
</html>