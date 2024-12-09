<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Passport Registration Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        .form-container {
            max-width: 800px;
            margin: 0 auto;
        }
        .form-row {
            display: flex;
            margin-bottom: 15px;
            align-items: center;
        }
        .form-row label {
            width: 300px;
            font-weight: Italic;
        }
        .form-row input,
        .form-row select {
            flex: 1;
            padding: 5px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        .form-row input[type="radio"] {
            flex: 0;
        }
        button {
            margin-right: 20px;
            padding: 15px 16px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        button:hover {
            background-color: pink;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h1>Register to Apply at</h1>
        <form action="passport" method="post">
            <div class="form-row">
                <label>Register to apply at *</label>
                <div>
                    <label>
                        <input type="radio" name="registerAt" value="CPV Delhi"> CPV Delhi
                    </label>
                    <label>
                        <input type="radio" name="registerAt" value="Passport Office" checked> Passport Office
                    </label>
                </div>
            </div>

            <div class="form-row">
                <label for="passport_office">Passport Office *</label>
                <select id="passport_office" name="passportOffice" required>
                    <option value="" disabled selected>-- Select --</option>
                    <option value="office1">Office 1</option>
                    <option value="office2">Office 2</option>
                </select>
            </div>

            <div class="form-row">
                <label for="given_name">Given Name *</label>
                <input type="text" id="given_name" name="givenName" maxlength="45" required>
            </div>

            <div class="form-row">
                <label for="surname">Surname *</label>
                <input type="text" id="surname" name="surname" maxlength="45" required>
            </div>

            <div class="form-row">
                <label for="dob">Date of Birth *</label>
                <input type="text" id="dob" name="dob" required>
            </div>

            <div class="form-row">
                <label for="email">E-mail ID *</label>
                <input type="email" id="email" name="email" maxlength="35" required>
            </div>

            <div class="form-row">
                <label>Do you want your Login ID to be the same as your E-mail ID? *</label>
                <div>
                    <label>
                        <input type="radio" name="loginIdChoice" value="yes"> Yes
                    </label>
                    <label>
                        <input type="radio" name="loginIdChoice" value="no" checked> No
                    </label>
                </div>
            </div>

            <div class="form-row">
                <label for="login_id">Login ID *</label>
                <input type="text" id="login_id" name="loginId" required>
                <button type="button" onclick="alert('Check availability logic here')">Check Availability</button>
            </div>

            <div class="form-row">
                <label for="password">Password *</label>
                <input type="password" id="password" name="password" required>
            </div>

            <div class="form-row">
                <label for="confirm_password">Confirm Password *</label>
                <input type="password" id="confirm_password" name="confirmPassword" required>
            </div>

            <div class="form-row">
                <label for="hint_question">Hint Question *</label>
                <select id="hint_question" name="hintQuestion" required>
                    <option value="" disabled selected>-- Select --</option>
                    <option value="pet_name">What is your pet's name?</option>
                    <option value="school_name">What is your first school name?</option>
                </select>
            </div>

            <div class="form-row">
                <label for="hint_answer">Hint Answer *</label>
                <input type="text" id="hint_answer" name="hintAnswer" required>
            </div>

            <div class="form-row">
                <button type="submit">Register</button>
                <button type="reset">Clear</button>
            </div>
        </form>
    </div>
</body>
</html>