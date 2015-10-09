int number = 1

while (number < 20) {





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
	println number
}
number++

}
