print "Please enter a number "
String str = System.console().readLine();
int originalNumber = Integer.parseInt(str);
int i
boolean primeTest
boolean primeItself = false
int divTest // Test for divisibility
int searchUp = 0
int searchDown = 0

// First we test and see if the number entered itself is prime.
// If it is, then we set a flag "primeItself" to be true.

// Below is the code to test a number if it is prime.
// The number is in the variable "number" and result
// is in the boolean variable "primeTest".

number = originalNumber

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
	primeItself = true
}

// Now we start to find the closest prime higher

while (1 == 1) { // Enless loop - only way out is to break
	number++ // increase the number by 1
	// now we test if it is prime
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
		searchUp = number
		println searchUp
		break
	}
}

// Now we start to find the closest prime lower

number = originalNumber

while (1 == 1) { // Enless loop - only way out is to break
	number-- // decrease the number by 1
	// now we test if it is prime
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
		searchDown = number
		println searchDown
		break
	}
}








if (primeItself == true) {
	println ("The number you entered was itself a prime number")
}

else {
}



