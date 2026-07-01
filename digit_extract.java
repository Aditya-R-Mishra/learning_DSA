// in this we only have 2 operations that do all the work with the loop.
// 1. % 10 :- gives last digit of a no.
// 2. / 10 :- removes the last digit.

import java.util.*;

class digit_extract{
    public static void main(String[] args){
        System.out.print("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n==0){
            System.out.println(0);
        }

        while(n!=0){
            int lastdigit = n%10;
            System.out.println(lastdigit);
            n=n/10;
        }

        sc.close();
    }
}