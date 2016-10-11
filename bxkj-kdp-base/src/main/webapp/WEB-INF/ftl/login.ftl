<#-- @ftlvariable name="_csrf" type="org.springframework.security.web.csrf.CsrfToken" -->
<#-- @ftlvariable name="error" type="java.util.Optional<String>" -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Log in</title>
</head>
<body width="100%" align="center">

 <div align="center" >
<h1>后台管理系统</h1>

<div style="background-size:100%;background-repeat:no-repeat;background-image:url(bk.jpg);height:300px;width:100%;border:0px solid black;">

<form role="form" action="/superiorcourts/login" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

    <div >
        <label for="email">邮箱：</label>
        <input type="email" name="email" id="email" required autofocus/>
    </div>
    <div >
        <label for="password">密码：</label>
        <input type="password" name="password" id="password" required/>
    </div>
    <div >
        <label style='align:left' for="remember-me">记住我</label>
        <input style='align:left' type="checkbox" name="remember-me" id="remember-me"/>
    </div>
    <div style='align:left'>
     <button type="submit">登陆</button>
      </div>

</form>

<#if error.isPresent()>
<p style='color:red'>用户名或密码无效，请重试。</p>
</#if>
</div>
</div>
</body>

</html>