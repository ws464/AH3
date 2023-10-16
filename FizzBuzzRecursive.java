package AH3;

import java.util.Scanner;
public class FizzBuzzRecursive {
    static String fizzBuzz(int n){
        if(n == 1){
            return "1";
        }
        else if(n%3==0&&n%5==0){
            return fizzBuzz(n-1)+" FizzBuzz";
        } 
        else if(n%3==0){
            return fizzBuzz(n-1)+" Fizz";
        }
        else if(n%5==0){
            return fizzBuzz(n-1)+" Buzz";
        }
        else{
            return fizzBuzz(n-1)+" "+n;
        }
    }
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter positive integer N:");
        int n = myScanner.nextInt();
        myScanner.close();
        String ret = fizzBuzz(n);
        System.out.println(ret);
    }
}
