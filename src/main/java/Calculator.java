import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        ArrayList<Object> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите операцию: +, - , /, *");
        String text = sc.next();
        array.add(text);
        while (!text.equals("=")) {
            System.out.println("Введите число. Для получения результата нажмите =:");
            text = sc.next();
            if (text.equals("=")) break;
            array.add(text);
        }
        sc.close();
        try {
            switch (array.get(0).toString()) {
                case ("+"):
                    System.out.printf("Result is: %.4f", new Addition(array).calculate(array));
                    break;
                case ("*"):
                    System.out.printf("Result is: %.4f", new Multiplication(array).calculate(array));
                    break;
                case ("-"):
                    System.out.printf("Result is: %.4f", new Subtraction(array).calculate(array));
                    break;
                case ("/"):
                    System.out.printf("Result is: %.4f", new Division(array).calculate(array));
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя" + "\n" + e.toString());
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не верное значение!");
        }
    }
}