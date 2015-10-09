int number = 1
int counter = 0
int dummy = 0
while (dummy == 0) { // endless loop - the only way out is to break
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
	counter++
	}
	if (counter == 1000) { // have we reached a thousand primes?
	break
	}
number++
}
