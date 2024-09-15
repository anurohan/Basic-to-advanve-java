import java.util.Scanner;
public class dowhileloop {
    public static void main(String[] args){
        System.out.print("enter no :");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int i=0;
        do{
            System.out.println("hello :"+i);
            i++;
        }while(i<=n);

    }
    
}
