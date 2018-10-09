package RyanWu;

public class testFile {

    public static void main(String[] args) {
        System.out.println(RyanWuMultiplication.multiplicationTable(4, 12)); //4 and 12 would result in the the 4 times table up to 48
        System.out.println(RyanWuPrimePrinter.primePrinter(15)); //15 should print out the prime numbers from 2 to 47 because 47 is the 15th prime number
        System.out.println(RyanWuFibonacci.isFibonacci(9)); //9 should return 34 because if you plug in 9 to the formula, it results in 34
        System.out.println(RyanWuPalindrome.isPalindrome("racecar")); //racecar should return true because it is spelled the same back and forth
        System.out.println(RyanWuFooBarBaz.fooBarBaz(3)); //3 should return foo because in foobarbaz, 3 is foo
    }
}
