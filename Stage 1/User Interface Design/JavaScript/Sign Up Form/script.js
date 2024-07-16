function validation() {
        var name = document.getElementById('name').value;
        var email = document.getElementById('email').value;
        var password = document.getElementById('password').value;
        var confirm_password = document.getElementById('confirm').value;

        document.getElementById('namelocation').innerHTML="";
        document.getElementById('emaillocation').innerHTML="";
        document.getElementById('passwordlocation').innerHTML="";
        document.getElementById('confirmlocation').innerHTML="";
        try {
        if (name === '') {
            document.getElementById('namelocation').innerHTML = 'Please enter your name';
        }
        if (email === '') {
            document.getElementById('emaillocation').innerHTML = 'Please enter your email';
        }
        if (password === '') {
            document.getElementById('passwordlocation').innerHTML = 'Please enter your password';
        } else if (password.length < 6) {
            document.getElementById('passwordlocation').innerHTML= 'Password length must be greater than 6';
        }
        if (confirm_password === '') {
            document.getElementById('confirmlocation').innerHTML = 'Please enter the password again';
        } else if (confirm_password !== password) {
            document.getElementById('confirmlocation').innerHTML = 'Confirm password does not match';
        }

    } catch (err) {
        // Display any caught error message in the element with id "result"
        document.getElementById('result').innerText = err;
    }
}
