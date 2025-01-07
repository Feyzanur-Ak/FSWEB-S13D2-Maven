package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(5));
    }

    public  static  boolean isPalindrome(int number){
        String original = Integer.toString(number); //
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }

    public  static  boolean isPerfectNumber (int number){
        if(number<0) {
            return false;
        }
            int sum=0;
      for(int i=1; i<number; i++){

          if(number%i==0) {
              sum+=i;
          }
      }
      return sum==number;
    }
}
