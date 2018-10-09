package RyanWu;

public class RyanWuFooBarBaz {
    public static String fooBarBaz(int num1) {
        String foobarbaz = "";
        if ((num1 % 3) == 0) { //If the number is a 3, it sets the variable to foo.
            foobarbaz = "foo";
        } else {
            if ((num1 % 5) == 0) { //If the number is a 5, it sets the variable to bar.
                foobarbaz = "bar";
            } else {
                if ((num1 % 7) == 0) { //If the number is 7, it sets the variable to baz.
                    foobarbaz = "baz";
                }
                else {
                    System.out.println(num1); //If the numbers aren't a 3, 5, or a 7, it will print the original number
                }
            }
        }
        return foobarbaz; //This prints what the variable was set to, but if it was a number other than 3,5, or 7, it won't print anything.
    }
}

