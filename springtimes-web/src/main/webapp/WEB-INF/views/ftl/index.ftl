<#import "/spring.ftl" as spring /> <!-- Импортирование макроопределений -->
<html>
<head>
    <title>
    <@spring.message "title"/>
    </title>
    <style>
        .error {
            color: #ff0000;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <h2>
        <@spring.message "title"/>
    </h2>
    <h1>${data}</h1>
</body>
</html>