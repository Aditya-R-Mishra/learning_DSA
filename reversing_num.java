import java.util.*;

class reversing_num{
    public static void main(String[] args){
        System.out.print("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int reversed = 0;

        while(n!=0){
            int lastdigit=n%10;
            reversed = reversed*10 + lastdigit;
            n = n/10;
        }
        System.out.println("the reversed number is : " +reversed);
    }
}