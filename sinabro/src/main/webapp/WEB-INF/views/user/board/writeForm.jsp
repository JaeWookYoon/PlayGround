<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- CSS file -->
<link rel="stylesheet" href="/sinabro/css/user/main/mainContent.css" />
<script type="text/javascript" src="/sinabro/js/user/board/script.js"></script>
<%@include file="/WEB-INF/views/user/main.jsp"%>
</head>
<body>
<div align="center" class="body">
<form method="post" name="writeForm" action="writeForm.do" enctype="multipart.form-data" onsubmit="return writeCheck()">
글쓰기
<table width=450 border=1>
<input type="hidden" name="id" value="${sessionScope.loginId}"/>

<tr>
   <td align="center">제목</td>
   <td align="left"><input type="text" name="subject"/></td>
</tr>
<tr>
   <td align="center">내용</td>
   <td align="left"><textarea rows="13" cols="60" name="content"></textarea></td>
</tr>
</table>
<br/>
<input type="submit" value="글쓰기" />
<input type="button" value="목록보기" onclick="window.location='list.do?pageNum=1'" />

</form>
</div>

</body>
</html>