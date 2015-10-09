




print "Please enter a number "
String str = System.console().readLine();
int number = Integer.parseInt(str);
int i = 1
int prime = 1
int divTest
while (i < number) {
	i++;
	divTest = number % i
	if (divTest == 0) {
		if (i < number) {
			prime=0
			break
		}
	}
}
if (prime == 1) {
	println ("The number is a prime number.")
}
else {
	println("The number is NOT a prime number!")
}
