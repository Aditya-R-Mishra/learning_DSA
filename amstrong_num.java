//A number where the sum of each digit raised to the power of (number of digits) equals the number itself.
// Example: 153 → 1³ + 5³ + 3³ = 1 + 125 + 27 = 153

import java.util.*;
class amstrong_num{
    public static void main (String[] args){
        System.out.print("Enter the Number:");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int original = n , sum = 0;
        while(n!=0){
            int digit = n%10;
            sum += digit * digit * digit;
            n = n/10;
        }

        if(sum == original) System.out.println("Armstrong Number");

        else System.out.println("Not a Armstrong Number");


    }
}