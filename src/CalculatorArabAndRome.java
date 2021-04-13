import java.util.Scanner;

public class CalculatorArabAndRome {

    public static void main(String[] args) {
        int a = 0, b = 0, flag = 0;
        String operation;
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        in.close();
        String error = "Нарушено правило ввода числа! Вариант ввода(5 + 3) или (X + IV)!";
        String[] values = line.split(" ");
        for (int i = 0; i < values.length; i++) {
            if (i != 2) {
                System.err.println(error);
                return;
            }
        }
        if (line.equals(" ") || line.equals("")) {
            System.err.println(error);
            return;
        }
        if (values[0].equals("+") || values[0].equals("-") || values[0].equals("/") || values[0].equals("*")) {
            System.err.println(error);
            return;
        }
        if (values[2].equals("+") || values[2].equals("-") || values[2].equals("/") || values[2].equals("*")) {
            System.err.println(error);
            return;
        }
        if (line.matches(".*[IVX].*")) {
            a = DigitsConverter.romeToDigits(values[0]);
            b = DigitsConverter.romeToDigits(values[2]);
            flag = 1;
        } else if (line.matches(".*[1234567890].*")) {
            a = Integer.parseInt(values[0]);
            b = Integer.parseInt(values[2]);
            flag = 2;
        }
        operation = values[1];
        if ((a > 0 && a <= 10) && (b > 0 && b <= 10)) {
            if (operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("*")) {
                int result = Calculator.calculate(a, operation, b);
                switch (flag) {
                    case 2:
                        System.out.println(result);
                        break;
                    case 1:
                        System.out.println(DigitsConverter.arabToRome(result));
                        break;
                }
            } else {
                System.err.println("Неверно задан знак операции!\nВозможные варианты ('+' '-' '*' '/')!");
            }
        } else {
            System.err.println("Неверно заданы числа!" +
                    "\nКалькулятор умеет работать только c:\nцифрами от 1 до 10 (от I до X)!\n" +
                    "арабскими или римскими цифрами одновременно!");
        }
    }
}