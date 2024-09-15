import java.util.Scanner;

public class reverse {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.print("input number :");
        int num =input.nextInt();

        int ans =0;
        while(num>0){

            int rem = num %10;
            num/=10;

            ans=ans*10+rem;
        }

        System.out.println(ans);


    }    
}
