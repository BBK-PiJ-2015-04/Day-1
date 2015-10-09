print "Please enter a number "
String str = System.console().readLine();
int number = Integer.parseInt(str);
int i
boolean primeTest
int divTest // Test for divisibility

// Below is the code to test a number if it is prime.
// The number is in the variable "number" and result
// is in the boolean variable "primeTest".

if (number <2) {
	primeTest = false
}

else {
	primeTest = true
}

i = 1 // set the counter to 1 to start the loop below

while (i < (number - 1)) {
	i++
	divTest = number % i
	if (divTest == 0) {
		primeTest = false
	}
}	

if (primeTest == true) {
	println ("The number is a prime number.")
}
else {
	println("The number is NOT a prime number!")
}
