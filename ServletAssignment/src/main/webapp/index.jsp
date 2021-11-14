<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
	<div class="container">

	<h1>Registration Form</h1>
	<form action="register" method="post">
		<div class="form-group">
			<label>Name</label>
			<input type="text" name="user_name" placeholder="Name" class="form-control"/>

		</div>

		<div class="form-group">
			<label>Email</label>
			<input type="text" name="user_email" placeholder="Email" class="form-control"/>
		</div>

        <div class="form-group">
			<label>Password</label>
			<input type="text" name="password" placeholder="Password" class="form-control"/>
		</div>
        <div class="form-group">
			<label>Phone Number</label>
			<input type="text" name="number" placeholder="Phone Number" class="form-control"/>
		</div>

		<div class="form-group">
        	<label>Country</label>
        	<select name="country" placeholder="select country" class="form-control">
        	    <option value="">--please select country--</option>
        	    <option value="USA">USA</option>
        	    <option value="UK" selected>UK</option>
        	    <option value="China">China</option>
        	</select>
        </div>

        <div class="form-group">
            <label>Gender</label>

            <input type="radio" name="gender" id="" value="male">Male
            <input type="radio" name="gender" id="" value="female">Female
        </div>

        <div class="form-group">
            <label>Interests</label>
            <input type="checkbox" name="interest"> chess
            <input type="checkbox" name"interest"> soccer
            <input type="checkbox" name"interest"> snowboarding
        </div>
			<input class="btn btn-primary" type="submit" value="Submit" />

	</form>

	</div>