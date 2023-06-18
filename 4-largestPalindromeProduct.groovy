//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 x 99.

//Find the largest palindrome made from the product of two 3-digit numbers.

def product = 0
def palindromes = []
for(int i in 999..2){
  for(int j in 999..2){
    product = i*j
    def numberIntoStringArray = String.valueOf(product).split("")
    int arrayInAHalf = numberIntoStringArray.size()/2
    if(arrayInAHalf > 2){
      def numberSplitedInAHalf = numberIntoStringArray.collate(arrayInAHalf)
      if(numberSplitedInAHalf[0] == numberSplitedInAHalf[1].reverse()){
        palindromes.contains(product) ?: palindromes.add(product)
      }
    }
  }
}
println "The largest palindrome: ${palindromes.sort().last()}"
