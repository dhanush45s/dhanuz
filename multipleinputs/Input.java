import java.util.*;
public class Input{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n value:");
         int n = input.nextInt();
         int a[] = new int[n];
         int i=0;
         while(i<=n){
            System.out.println("Enter the value:");
            a[i] = input.nextInt();
            i++;

         }
         while(i<n);
         System.out.println("Entered the value:"+a[i]);
         i = i+1;

    }
}