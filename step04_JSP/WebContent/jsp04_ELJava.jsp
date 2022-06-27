<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.domain.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>String 데이터 출력</h3>
	
	<%
		session.setAttribute("sessionData", "hi");
		request.setAttribute("requestData", "hello");
	%>
	
	${sessionScope.sessionData} <br/>
	${requestScope.requestData}
	
	<hr/>
	
	<h3>DTO(학생) 데이터 출력</h3>
	<%
		Student student1 = new Student("김윤호", 26);
		Student student2 = new Student("김도헌", 26);
		/* session.setAttribute("윤호", student1); */
		session.setAttribute("yh", student1);
		session.setAttribute("dh", student2);
	%>
	
	<%-- ${sessionScope.윤호 } --%><!-- 한글은 불가능 -->
	${sessionScope.yh } <br/>
	${sessionScope.dh } <br/>
	${sessionScope.yh.name } <br/>
	${sessionScope.dh.age } 
	
	<hr/>
	
	<h3>DTO(학생) 데이터 출력</h3>
	
	<%
		ArrayList arr = new ArrayList();
		arr.add(student1);
		arr.add(student2);
		
		session.setAttribute("arr", arr);
	%>
	
	${sessionScope.arr } <br/>
	${sessionScope.arr[1].age } <br/>
	${sessionScope.arr.get(1).age }
	
</body>
</html>