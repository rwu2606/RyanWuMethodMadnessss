package RyanWu;

public class RyanWuMultiplication {
    public static boolean multiplicationTable(int base, int range) {
        int n = 0;
        int[] b = new int[range+1];
        for(int i = 0;i<=range;i++) { //This gets all of the values for the multiplication table
            n = base*i;
            b[i] = n;
        }
        for(int i = 0;i<=range;i++) { //This makes it so that it returns all of the numbers in order, (ex. 2 4 6 8)
            System.out.print(b[i]+" ");
        }
        return true; //Added this because it keeps saying I needed a return statement
    }
}