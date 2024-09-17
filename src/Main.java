import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float first_operand, second_operand,result;
        int choice;
        Scanner ss = new Scanner(System.in);


        System.out.println("Press 1 for addition : ");
        System.out.println("Press 2 for subtraction : ");
        System.out.println("Press 3 for multiplication : ");
        System.out.println("Press 4 for division : ");
        System.out.println("Press 5 for quit \n \n : ");

        System.out.println("Make your choice : ");
        choice = ss.nextInt();


        switch (choice) {
            case 1:
                System.out.println("Enter the first number : ");
                first_operand = ss.nextFloat();
                System.out.println("Enter the second number : ");
                second_operand = ss.nextFloat();
                result = first_operand+second_operand;
                System.out.println("The sum of the numbers is : "+result+"\n" );
                break;


            case 2:
                System.out.println("Enter the first number : ");
                first_operand = ss.nextFloat();
                System.out.println("Enter the second number : ");
                second_operand = ss.nextFloat();
                result = first_operand-second_operand;
                System.out.println("The difference of the numbers is : "+result+"\n" );
                break;


            case 3:
                System.out.println("Enter the first number : ");
                first_operand = ss.nextFloat();
                System.out.println("Enter the second number : ");
                second_operand = ss.nextFloat();
                result = first_operand*second_operand;
                System.out.println("The product of the numbers is : "+result+"\n" );
                break;


            case 4:
                System.out.println("Enter the first number : ");
                first_operand = ss.nextFloat();
                System.out.println("Enter the second number : ");
                second_operand = ss.nextFloat();
                result = first_operand/second_operand;
                System.out.println("The quotient of the numbers is : "+result+"\n" );
                break;

            case 5:
                System.exit(0);

            default:
                System.out.println("Invalid choice! Please choose correct choice /n/n");

        }



    }
}