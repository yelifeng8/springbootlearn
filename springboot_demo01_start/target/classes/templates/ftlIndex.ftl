这是我第一个ftl页面


<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8" />
    <title>首页</title>
</head>
<body>
${name}   88888   ${age}
<#if sex=="1">
男
<#elseif sex=="2">
女
<#else>
其他

</#if>

</body>
</html>