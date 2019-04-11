<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/4/11
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>filesupload</title>
</head>
<body>
<s:form name="uploadfiles" action="uploadfiles" method="post" enctype="multipart/form-data">
    <s:file name="upload" label="选择要上传的文件1"/>
    <s:file name="upload" label="选择要上传的文件2"/>
    <s:file name="upload" label="选择要上传的文件3"/>
    <s:submit/>
</s:form>
</body>
</html>
