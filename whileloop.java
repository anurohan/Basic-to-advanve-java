import java.util.Scanner;
public class whileloop{
    public static void main(String[]args){
    System.out.print("enter no :");
    Scanner input =new Scanner(System.in);
    int n=input.nextInt();
    int i =0;
    while(i<=n){
        System.out.println("Hello :"+i);
        i++;

    }
    }
}