<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center" class="body">
<form method="post" name="writeForm" action="writeForm.do" enctype="multipart.form-data">
글쓰기
<table width=450 border=1>
<tr>
	<td align="center">작성자</td>
	<td align="left"><input type="text" name="writer" value="${writer }"/></td>
</tr>
<tr>
	<td align="center">비밀번호</td>
	<td align="left"><input type="password" name="pass" value="${pass }"/></td>
</tr>
<tr>
	<td align="center">이메일</td>
	<td align="left"><input type="text" name="email" value="${email }"/></td>
</tr>
<tr>
	<td align="center">제목</td>
	<td align="left"><input type="text" name="subject" value="${subject }"/></td>
</tr>
<tr>
	<td align="center">내용</td>
	<td align="left"><textarea name="content"></textarea></td>
</tr>

</table>
<br/>
<input type="button" value="보내기">

</form>
</div>

</body>
</html>