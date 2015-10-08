print "Please enter the first number "
String str = System.console().readLine();
int number1 = Integer.parseInt(str);

print "Please enter the second number "
str = System.console().readLine();
int number2 = Integer.parseInt(str);

print "Please enter the third number "
str = System.console().readLine();
int number3 = Integer.parseInt(str);

if (number1 < number2 && number1 < number3) {
	println number1
	if (number2 < number3) {
		println number2
		println number3
	}
	else {
		println number3
		println number2
	}
}

else if (number2 < number1 && number2 < number3) {
	println number2
	if (number1 < number3) {
		println number1
		println number3
	}
	else {
		println number3
		println number1
	}
}

else {
	println number3
	if (number1 < number2) {
	println number1
	println number2
	}
	else {
	println number2
	println number1
	}
}
