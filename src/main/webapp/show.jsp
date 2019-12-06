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
	<form action="show" method="post">
		<input name="gname">
		<input type="submit" value="查询">
	</form>
	<a href="add.jsp"><input type="button" value="新增"></a>
	<input type="button" value="批量删除" onclick="ps()">
	<table border="1">
		<tr>
			<td>
				<input type="button" value="全选" onclick="qx()">
				<input type="button" value="全不选" onclick="qbx()">
			</td>
			<td>编号</td>
			<td>商品名称</td>
			<td>品牌</td>
			<td>分类</td>
			<td>发布时间</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${page.list }" var="g">
		<tr>	
			<td><input type="checkbox" value="${g.gid }" class="c"></td>
			<td>${g.gid }</td>
			<td>${g.gname }</td>
			<td>${g.bname }</td>
			<td>${g.kname }</td>
			<td>${g.datea }</td>
			<td>
				<input type="button" value="详情" onclick="getById(${g.gid })">
				<input type="button" value="编辑" onclick="upd(${g.gid })">
			</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="12">	
				<a href="?pageNum=1">首页</a>
				<a href="?pageNum=${page.pageNum-1 }">上一页</a>
				<a href="?pageNum=${page.pageNum+1 }">下一页</a>
				<a href="?pageNum=${page.pages }">未页</a>
				<span>当前为${page.pageNum }页/${page.pages }</span>
			</td>
		</tr>
	</table>
</body>
<script type="text/javascript">
	function qx() {
		$(".c").each(function() {
			this.checked=true;
		});
	}
	function qbx() {
		$(".c").each(function() {
			this.checked=false;
		});
	}
	function upd(id) {
		location="update.jsp?id="+id;
	}
	function getById(id) {
		location="getById.jsp?id="+id;
	}
	function ps() {
		var id=$(".c:checked").map(function() {
			return $(this).val();
		}).get().join(",");
		if (confirm("确定删除吗")) {
			$.post("updateGoods",{id:id},function(){
				location="show";
			});
		}
	}
</script>
</html>
















