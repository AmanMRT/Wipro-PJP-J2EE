function check(){
    var firstname=document.getElementById('firstname').value;
    var lastname=document.getElementById('lastname').value;
    var password=document.getElementById('password').value;
    var confirmpassword=document.getElementById('confirmpassword').value;
    var phonenumber=document.getElementById('phonenumber').value;
    var dob=document.getElementById('dob').value;
    var email=document.getElementById('email').value;

    var regex=/[A-Z a-z]/;
    var phoneregex = /^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/;
    
    if(firstname=="" || lastname=="" || password=="" || confirmpassword=="" || phonenumber=="" || dob=="" || email=="")
    {
        alert("Field's can not be empty.");
        return false;
    }
    if (!regex.test(firstname)||!regex.test(lastname) )
    {
        alert("FirstName and Lastname says: Enter Character only.");
        return false;
    }
    if((password.length < 6 && password.length > 20) || (confirmpassword.length < 6 && confirmpassword.length > 20))
    {
        alert("Password length should be between 6 to 20 only.");
        return false;
    }

    if(password != confirmpassword)
    {
        alert("Password and Confirm Password doesnot matches.")
        return false;
    }

    if(phonenumber.length != 10)
    {
        alert("Phone Number should be of 10 digit.");
        return false;
    }
    if(phoneregex.test(phonenumber))
    {
        alert("Phone Number should be in proper standard format");
        return false;
    }   
}