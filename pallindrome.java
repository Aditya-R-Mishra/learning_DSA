import java.util.*;

class pallindrome{
    public static void main(String[] args){
        System.out.print("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int original = n;
        int reversed = 0;

        while(n!=0){
            int lastdigit=n%10;
            reversed = reversed*10 + lastdigit;
            n = n/10;
        }
       if (original == reversed){
           System.out.println("pallindrome");
       }
       else System.out.println("Not a Pallindrome");
    }
}