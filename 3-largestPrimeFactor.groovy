//The prime factors of 13195 are 5, 7, 13 and 29.

//What is the largest prime factor of the number 600851475143?

def number = 600851475143
def prime = 3
def array = []
def arrayPrimes = []
//println isPrime(number)

while(prime < number){
	if(number %2 == 0){
		arrayPrimes.add(2)
			number = number/2;
		array.add(number)
	}else{
		if(isPrime(prime)){
			if(number%prime == 0){
				arrayPrimes.add(prime)
					number = number/prime;
				array.add(number)
					if(isPrime(number)){
						arrayPrimes.add(number)
					}     
			}
		}
		prime +=1
	}

}
println array
println "The prime factors are: "
println arrayPrimes

def isPrime(number){
	int counter = 2;
	while( counter < number){
		if(number % counter == 0){
			return false
		}else{
			counter +=1;
			if(counter == number){
				return true
			}
		}
	}
}
