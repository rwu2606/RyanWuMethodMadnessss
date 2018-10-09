package RyanWu;

public class RyanWuPrimePrinter {
    public static boolean primePrinter(int num) {
        int n = 2;
        int Index = 0;
        while (Index < num) { //While the index is lower than the number of primes requested, this loop will run
            if (prime(n)) {  //If n is prime, this part will run. (It should run since n is set as 2)
                System.out.print(n + " ");
                Index++; //This will make it so that the loop will keep going until the number of primes requested has been fulfilled
            }
            n++;
        }
        return true; //Added this because it won't run without a return statement
    }
    public static boolean prime(int n) { //This part of the code checks to see if the number is prime or not
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}