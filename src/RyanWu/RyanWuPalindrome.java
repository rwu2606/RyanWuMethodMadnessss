package RyanWu;

public class RyanWuPalindrome {
    public static boolean isPalindrome(String str) {
        int length = str.length();
        int forwards = 0;
        int backwards = length - 1; //This is so that it starts at the same position as the front
        while (backwards > forwards) {
            char forwardsPalindrome = str.charAt(forwards++); //This and the line under both check if the lettering is the same backwards as it is forwards
            char backwardsPalindrome = str.charAt(backwards--);
            if (forwardsPalindrome != backwardsPalindrome) //If they aren't the same, it returns false.
                return false;
        }
        return true;
    }
}