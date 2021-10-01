package ASSIGNMENT3;

import java.util.Scanner;

   public class Fahrenheit {
    public static void main(String[]args){
        double celsius,Fahrenheit;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the temperature in celsius");
        celsius= input.nextDouble();
        Fahrenheit = 1.8 * (celsius)+32;
        System.out.print("the temperature  in  Fahrenheit is " + Fahrenheit );
    }
}
