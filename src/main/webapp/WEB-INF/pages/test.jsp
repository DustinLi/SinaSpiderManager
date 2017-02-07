<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
<header>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/json2.js"></script>

<script type="text/javascript">
	function testAjax() {
		var sysUsers=Object();
		sysUsers.suid="Admin3";
		sysUsers.suname="另一个测试3"
		sysUsers.pwd="1234";
		alert("JSON String: " + JSON.stringify(sysUsers));
		//alert("JSON Object: " + sysUsers);
		$.ajax({
			type:"POST",
			url: "au.do",
			contentType: "application/json;charset=UTF-8",
			data: JSON.stringify(sysUsers),
			//dataType:"application/json;charset=UTF-8",
			success: function(data) {
				alert(data);
				},
			error: function() {alert("error")}
		}); 
		//$.getJSON("jsonConverterTest.json", function(data) {alert(data)});
	}
</script>

</header>
<body>
<h2>Hello World!</h2>
<input type="button" onclick="testAjax()" value="点我" />
</body>
</html>
