import java.util.Scanner;
public class fibbonachiseries {
    public static void main(String[] args){
        System.out.print("input number :");
        Scanner input =new Scanner(System.in);
        int n =input.nextInt();
        int p=0;
        int i=1;
        int count =2;
        while(count<=n){
            int temp=i;
            i=i+p;
            p=temp;
            count++;

        }
        System.out.println(i);

        
    }
}
