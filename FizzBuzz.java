package AH3;

import java.util.Scanner;
class FizzBuzz{
    static void fizzBuzz(int n){
        for(int i = 1; i<=n; i++){
            if(i%3==0&&i%5==0){
                System.out.print("FizzBuzz ");
            } 
            else if(i%3==0){
                System.out.print("Fizz ");
            }
            else if(i%5==0){
                System.out.print("Buzz ");
            }
            else{
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner myScanner =  new Scanner(System.in);
        System.out.println("Enter positive integer n:");
        int n = myScanner.nextInt();
        fizzBuzz(n);
        myScanner.close();
    }
}