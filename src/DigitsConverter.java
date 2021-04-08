public class DigitsConverter {
    static int romeToDigits(String values) {
        int arab = 0;
        String[] rome = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 0; i < rome.length; i++) {
            if (rome[i].equals(values)) {
                arab = i + 1;
            }
        }
        return arab;
    }

    static String digitsToRome(int number) {
        String rom = null;
        switch (number) {
            case 0:
                rom = "";
                break;
            case 1:
                rom = "I";
                break;
            case 2:
                rom = "II";
                break;
            case 3:
                rom = "III";
                break;
            case 4:
                rom = "IV";
                break;
            case 5:
                rom = "V";
                break;
            case 6:
                rom = "VI";
                break;
            case 7:
                rom = "VII";
                break;
            case 8:
                rom = "VIII";
                break;
            case 9:
                rom = "IX";
                break;
            case 10:
                rom = "X";
                break;
        }
        return rom;
    }

    static String arabToRome(int number) {
        String s = null;
        if (number <= 0) {
            System.err.println("Превышен лимит римского числа!\nРимское число не может быть меньше или равно нулю!");
            return "";
        }
        if (number < 10) {
            s = digitsToRome(number % 10);
        }
        if (number >= 10 && number < 20) {
            s = "X" + digitsToRome(number % 10);
        }
        if (number >= 20 && number < 30) {
            s = "XX" + digitsToRome(number % 10);
        }
        if (number >= 30 && number < 40) {
            s = "XXX" + digitsToRome(number % 10);
        }
        if (number >= 40 && number < 50) {
            s = "XL" + digitsToRome(number % 10);
        }
        if (number >= 50 && number < 60) {
            s = "L" + digitsToRome(number % 10);
        }
        if (number >= 60 && number < 70) {
            s = "LX" + digitsToRome(number % 10);
        }
        if (number >= 70 && number < 80) {
            s = "LXX" + digitsToRome(number % 10);
        }
        if (number >= 80 && number < 90) {
            s = "LXXX" + digitsToRome(number % 10);
        }
        if (number >= 90 && number < 100) {
            s = "XC" + digitsToRome(number % 10);
        }
        return s;
    }
}