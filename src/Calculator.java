public class Calculator {
    static int calculate(int x, String operation, int y) {
        int res = 0;
        switch (operation) {
            case "+":
                res = x + y;
                break;
            case "-":
                res = x - y;
                break;
            case "/":
                res = x / y;
                break;
            case "*":
                res = x * y;
                break;
        }
        return res;
    }
}