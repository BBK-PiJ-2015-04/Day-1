int number
int i
boolean primeTest
int divTest // Test for divisibility
int counter = 1

number = 2 // We start with the smallest prime number 2

while (counter < 1001) {

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
		println (number)
		counter++ // now we start counting how many primes
		}

	number++

}
