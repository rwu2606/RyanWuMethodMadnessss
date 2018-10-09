package RyanWu;

public class RyanWuFibonacci {
    public static int isFibonacci(int num1) {
        if (num1 <= 1) {
            return num1; //The first two Fibonacci numbers are 0 and 1, so they don't change or need to go through the formula.
        }
        else {
            return isFibonacci(num1 - 1) + isFibonacci(num1 - 2); //This prints the number after it goes through the Fibonacci formula.
        }
    }
}
