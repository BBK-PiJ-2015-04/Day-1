int number
String str

print ("Tell me a number: ")
str = System.console().readLine()
number = Integer.parseInt(str)

// First let us check to see if the number itself is prime

int i = 1
int prime = 1
int divTest

while (i < number) {
	i++
	divTest = number % i
	if (divTest == 0) {
		if (i < number) {
			prime=0
			break
		}
	}
}

if (prime == 1) {
	println ("The number you entered is a prime number.")
}

else {
	// Let's go upwards to find the first prime number we find
	number++
	i = 1
	while (i < number) {
		i++
		divTest = number % i
		if (divTest == 0) {
			if (i < number) {
				prime = 0
				break
			}
		}
	}
	println prime
	println number
	
}
