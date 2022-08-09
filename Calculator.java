import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz enter your first number");
        int number1 = sc.nextInt();
        System.out.println("Plz enter your second number");
        int number2 = sc.nextInt();
        System.out.println("Plz enter your operation");
        String operation = sc.next();

        if(operation.equals("+")){
            System.out.println(number1+number2);
        }else if(operation.equals("-")){
            System.out.println(number1-number2);
        }else if(operation.equals("*")) {
            System.out.println(number1*number2);
        }else if(operation.equals("/")){
            System.out.println(number1/number2);
        }else if(operation.equals("%")) {
            System.out.println(number1 % number2);
        }else
            System.out.println("wrong operation");}

    }