<!DOCTYPE html>
<html lang="ru">
<head>
    <title>Crafty Cat</title>
</head>

<body>

<h1>${say}</h1>

<div id="header"></div>

<div id="content">
    <fieldset>
        <legend>Добавить кота:</legend>
        <form name="" action="add.html" method="post">
            Кличка: <input type="text" name="firstName"/> <br/>
            Цвет: <input type="text" name="color"/> <br/>
            <input type="submit" value="   Save   "/>
        </form>
    </fieldset>
    <br/>
    <table class="datatable">
        <tr>
            <th>Кличка</th>
            <th>Цвет</th>
        </tr>
    <#list model["catList"] as cat>
        <tr>
            <td>${cat.firstName}</td>
            <td>${cat.color}</td>
        </tr>
    </#list>
    </table>
</div>
</body>
</html>