import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        int [] number = new int[]{5,6,7,8,9};
//        Array(number,2);
//        for (int i = 0; i < number.length; i++) {
//            System.out.print(number[i]+" ");
//        }
//    }
//    public static void Array(int [] array,int value){
//        for (int i = 0; i < array.length; i++) {
//            array[i]*=value;
//        }


//
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Выберите операцию: 1 для сложения, 2 для вычитания, 3 для умножения, 4 для деления");
//        int operation = scanner.nextInt();
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//
//        int result = 0;
//
//        if(operation == 1){
//            result = add(num1, num2);
//        } else if (operation == 2){
//            result = subtract(num1, num2);
//        } else if (operation == 3) {
//            result = multiply(num1, num2);
//        } else if (operation == 4) {
//            result = divide(num1, num2);
//        } else {
//            System.out.println("Такой операции нет");
//            return;
//        }
//
//        System.out.println("Ответ: " + result);
//    }
//
//    public static int add(int a, int b){
//        return a + b;
//    }
//
//    public static int subtract(int a, int b){
//        return a - b;
//    }
//
//    public static int multiply(int a, int b){
//        return a * b;
//    }
//
//    public static int divide(int a, int b){
//        return a / b;
//    }
//}

  /*      Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = plus(a,b);
        int result1= minus(a,b);
        int result2= multiply(a,b);
        int result3= divide(a,b);
        System.out.println("Операция плюс : "+result+"\n"+"Операция минус : "+result1+"\n"+"Операция умножения : "+result2+"\n"+"Операция деления : "+result3);
    }
    static int plus(int a, int b){
        return a+b;
    }
    static int minus (int a,int b){
        return a-b;
    }
    static int multiply(int a, int b){
        return a*b;
    }
    static int divide(int a, int b){
        return a/b;
    }
*/
        Scanner scanner = new Scanner(System.in);
        double курсСома = 84.5;
        double курсUSD = 0.0;
        double курсEUR = 0.0;
        double курсRUB = 0.0;

        while (true) {
            System.out.println("Выберите валюту (USD, EUR, RUB) или введите 'выход' для завершения:");
            String выбор = scanner.nextLine();

            if (выбор.equalsIgnoreCase("выход")) {
                System.out.println("Программа завершена.");
                break;
            }

            switch (выбор.toUpperCase()) {
                case "USD":
                    курсUSD = показатьКурсUSD(курсСома);
                    System.out.println("1 USD = " + курсUSD + " сомов");
                    break;
                case "EUR":
                    курсEUR = показатьКурсEUR(курсСома);
                    System.out.println("1 EUR = " + курсEUR + " сомов");
                    break;
                case "RUB":
                    курсRUB = показатьКурсRUB(курсСома);
                    System.out.println("1 RUB = " + курсRUB + " сомов");
                    break;
                default:
                    System.out.println("Неизвестная валюта. Пожалуйста, выберите из списка (USD, EUR, RUB) или введите 'выход' для завершения.");
            }
        }
    }

    public static double показатьКурсUSD(double курсСома) {
        return курсСома;
    }

    public static double показатьКурсEUR(double курсСома) {
        return курсСома * 0.85;
    }

    public static double показатьКурсRUB(double курсСома) {
        return курсСома * 1.2;
    }
}