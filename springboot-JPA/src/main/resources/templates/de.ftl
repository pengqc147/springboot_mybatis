<html>
<head>
    <title>spring boot</title>
</head>
<body>
<table border="1px">
    <thead>
    <!--tr>th*4-->
    <tr>
        <th>id</th>
        <th>部门</th>
        <th>地址</th>
    </tr>
    </thead>
    <tbody>
            <#list deparList as department>
            <tr>
                <td>${department.deptno}</td>
                <td>${department.dname}</td>
                <td>${department.loc}</td>
            </tr>
            </#list>
    </tbody>
</table>
</body>
</html>