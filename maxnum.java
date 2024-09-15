import java.util.Scanner;
public class maxnum {
    public static void main(String[] args) {
    System.out.print("enter input :"); 
    Scanner input = new Scanner(System.in);  
    int a =input.nextInt();
    int b =input.nextInt();
    int c =input.nextInt();
    int max=a;
    if (b>max){
        max=b;
    }
    if (c>max){
        max=c;
    }
    System.out.println("max :"+max);
    }
}
