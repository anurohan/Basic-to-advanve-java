import java.util.Scanner;
public class intswitch {
    public static void main(String[] arge){
        System.out.print("enter nummbe of weeks :");
        Scanner input=new Scanner(System.in);
        int week =input.nextInt();

        switch (week){
            case 1 -> System.out.print("monday");
            case 2 -> System.out.print("tuesday");
            case 3 -> System.out.print("wednesday");
            case 4 -> System.out.print("thureday");
            case 5 -> System.out.print("friday");
            case 6 -> System.out.print("saturday");
            default -> System.err.print("input valid nunber");
        }



    }
}
