# Strings

>This repository was created for homework in lessons №10 - "Exceptions and Errors".
## Tasks

### Mandatory tasks:
0. Complete task 0 from the previous lesson.  
   Now you need to create your own exception classes for each situation:  
- Check whether the document number contains the sequence abc.  
- Check whether the document number begins with the sequence 555.  
- Check whether the document number ends with the sequence 1a2b.
   
   If the document number does not satisfy the condition, then throw an exception.  
   In the class method in which these methods will be called to demonstrate the work,  
     catch the exception with a try-catch construct and in the catch block display a message for the user (message to the console).  
   
1. Create a class that will have a static method  
   (read and understand how a static method differs from a non-static method - discuss in class if necessary).  
   This method takes three parameters as input:  
   -login  
   -password  
   -confirmPassword
     
   All fields are of String data type.  
   Login must be less than 20 characters long and must not contain spaces.  
   If login does not meet these requirements, a WrongLoginException must be thrown.  
   Password must be less than 20 characters long, must not contain spaces, and must contain at least one number.  
   Also password and confirmPassword must be equal.  
   If the password does not meet these requirements, a WrongPasswordException must be thrown.  
   WrongPasswordException and WrongLoginException are custom exception classes with two constructors - one by default,  
      the second takes the exception message and passes it to the constructor of the Exception class.   
   The method returns true if the values ​​are true or false otherwise.  
