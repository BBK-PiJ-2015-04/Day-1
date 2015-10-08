print "Please enter a number "
String str = System.console().readLine();
int number = Integer.parseInt(str);

int originalNumber = number

print "Please enter the divisor "
str = System.console().readLine();
int divisor = Integer.parseInt(str);

while (divisor == 0) {
		print "Divisor cannot be zero! Try again "
		str = System.console().readLine();
		divisor = Integer.parseInt(str);
}

int i = 0

while (number > divisor) {
	number = number - divisor
	i++
}

if (number == divisor) {
	i++
	number = 0
}

println originalNumber + " divided by " + divisor + " is " + i + ", remainder " + number
