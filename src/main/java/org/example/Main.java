package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1010));
        System.out.println(numberToWords(1010));

    }

    public static boolean isPalindrome(int number) {
        String original = Integer.toString(number); //
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static String numberToWords(int number) {

        if (number < 0) {
            return "Invalid Value";
        }

        char[] digits = String.valueOf(number).toCharArray();
        String numtoText = "";
        for (char digit : digits) {
            switch (digit) {
                case '0':
                    numtoText += "Zero ";
                    break;
                case '1':
                    numtoText += "One ";
                    break;
                case '2':
                    numtoText += "Two ";
                    break;
                case '3':
                    numtoText += "Three ";
                    break;
                case '4':
                    numtoText += "Four ";
                    break;
                case '5':
                    numtoText += "Five ";
                    break;
                case '6':
                    numtoText += "Six ";
                    break;
                case '7':
                    numtoText += "Seven ";
                    break;
                case '8':
                    numtoText += "Eight ";
                    break;
                case '9':
                    numtoText += "Nine ";
                    break;


            }

        }
        return numtoText.trim();
    }
}





