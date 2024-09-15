import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        //take input from till user doesnt press X or x
int ans=0;
        while(true){
            //take the operator as input
            System.out.println("enter the operator :");
            char op=input.next().trim().charAt(0);
            if(op=='+' ||op=='-'||op=='*'||op=='/'||op=='%'){
                //input two number
                System.out.println("enter num1 :");
                int num1=input.nextInt();
                System.out.println("enter num2 :");
                int num2=input.nextInt();

                if(op=='+'){
                    ans=num1+num2;
                }
                if(op=='-'){
                    ans=num1-num2;
                }
                if(op=='*'){
                    ans=num1*num2;
                }
                if(op=='/'){
                    if(num2!=0){
                        ans=num1/num2;
                    }
                }
                if(op=='%'){
                    ans=num1%num2;
                }
            }
            else if(op=='x'||op=='X'){
                break;
            }
            else{
                System.out.println("invalid operation");
            }
        }
        System.out.println(ans);

    }
    
}
