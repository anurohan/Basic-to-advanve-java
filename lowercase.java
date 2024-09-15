import java.util.Scanner;
public class lowercase {
    public static void main(String[] args){
        System.out.print("input alphabet :");
        Scanner in=new Scanner(System.in);
        char ch=in.next().trim().charAt(0);

        if (ch >='a' && ch <='z'){
            System.out.print("lower case");
        }
        else{
            System.out.println("upper case");
        }

    }
}
