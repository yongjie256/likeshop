<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Hello, world!</title>
</head>
<body>
<h1>${name}</h1>
<h1>${age}</h1>
<h1>${address}</h1>
<h1>freemarker:[${.version}]，mysql:[${ver}]</h1>
<hr>
<#list 1..5 as i>
    <p>${i}</p>
</#list>
<#list 5..3 as n>
    ${n}&nbsp;
</#list>
<#list [10,20,30] as v>
    <span>${v}</span>
</#list>
</body>
</html>