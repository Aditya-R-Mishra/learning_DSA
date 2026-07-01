// In this we are counting no. of digits in a number.


import java.util.*;

class count_digit{
    public static void main(String[] args){
         System.out.print("Enter the Number:");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int count = 0;


         if (n==0){
            count = 1;
         }

         while(n!=0){

             n=n/10;
             count++;

         }
        System.out.println(count);
         sc.close();
    }
}