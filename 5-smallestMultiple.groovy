//2521 is the samllest number that can be diveded by each of the numbers from 1 to 10 without any remainder.

//What is the samallest positive number that is evenly divisible by all of the numbers from 1 to 20?

boolean isdivisibleByAll = false
def counter =2520
def arrayFrom1to10 = []
for(int i in 1..20){
  arrayFrom1to10.add(i)
}

while(isdivisibleByAll == false){
    def remainderArray = arrayFrom1to10.collect {number -> counter%number}
    if(remainderArray.every {number -> number == 0}){
        isdivisibleByAll = true
        return counter
    }
    counter += 1;
}
println counter;
