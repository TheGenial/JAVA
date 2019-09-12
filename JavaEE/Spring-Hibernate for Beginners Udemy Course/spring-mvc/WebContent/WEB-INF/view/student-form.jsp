<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />
		
		<br><br>
	
		Last name: <form:input path="lastName" />
		
		<br><br>
		
		Country: <form:select path="country">
		
			<form:options items = "${student.countryOptions}" />
			
			<%--
			<form:option value = "USA" label = "USA" />
			<form:option value = "Bangladesh" label = "Bangladesh" />
			<form:option value = "England" label = "England" />
			<form:option value = "India" label = "India" />
			--%>
		
		</form:select>
		
		<br><br>
		
		Favorite Language: 
		
		Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		C# <form:radiobutton path="favoriteLanguage" value="C#"/>
		PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/> 
		
		<br><br>
		
		Operating system:
		
		Mac OS<form:checkbox path="operatingSystem" value="Mac"/>
		Linux<form:checkbox path="operatingSystem" value="Linux"/>
		Windows<form:checkbox path="operatingSystem" value="Windows"/>
		
		<br><br>
	
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>












