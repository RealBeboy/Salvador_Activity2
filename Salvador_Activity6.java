/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salvador_activity6;
import java.util.Scanner; //nag import scanner
/**
 *
 * @author Beboy
 */
public class Salvador_Activity6 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        String tempUnit = "";
        double tempNumber;
        String tempConvert;

     
        while (true) {
            System.out.println("Choose your Temperature Unit?\n(C) Celsius\n(K) Kelvin\n(F) Fahrenheit");
            tempUnit = scanner.nextLine().toLowerCase();

            
            if (tempUnit.equals("c") || tempUnit.equals("k") || tempUnit.equals("f")) {
                break; 
            } else {
                System.out.println("Please enter 'C', 'K', or 'F'.");
            }
        }

  
           while (true) {
            System.out.println("What is your Temp number?");
            try {
                tempNumber = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid number.");
            }
        }
        
        

      
        while (true) {
            System.out.println("Convert it to?\n(1) Celsius\n(2) Kelvin\n(3) Fahrenheit");
            tempConvert = scanner.nextLine();

           
            if (tempConvert.equals("1") || tempConvert.equals("2") || tempConvert.equals("3")) {
                break;  
            } else {
                System.out.println("Please enter '1', '2', or '3'.");
            }
        }

   
        if (tempConvert.equals("1")) {
            while (true){
                if (tempUnit.equals("c")) {
                System.out.println("You are already in Celsius Try Again.");
                break;
            } else if (tempUnit.equals("f")) {
                System.out.println("Fahrenheit to Celsius is: " + (tempNumber - 32) * 5 / 9);
                break;
            } else if (tempUnit.equals("k")) {
                System.out.println("Kelvin to Celsius is: " + (tempNumber - 273.15));
                break;
            }
           }
            
        } else if (tempConvert.equals("2")) {
            while (true){
                 if (tempUnit.equals("k")) {
                System.out.println("You are already in Kelvin Try again.");
                break;
            } else if (tempUnit.equals("f")) {
                double kelvin = (tempNumber - 32) * 5 / 9 + 273.15;
                System.out.println("Fahrenheit to Kelvin is: " + kelvin);
                break;
            } else if (tempUnit.equals("c")) {
                System.out.println("Celsius to Kelvin is: " + (tempNumber + 273.15));
                break;
            }
         }
           
        } else if (tempConvert.equals("3")) {
            while (true){
                 if (tempUnit.equals("f")) {
                System.out.println("You are already in Fahrenheit try again.");
                break;
            } else if (tempUnit.equals("k")) {
                System.out.println("Kelvin to Fahrenheit is: " + (tempNumber - 273.15) * 9 / 5 + 32);
                break;
            } else if (tempUnit.equals("c")) {
                double fahrenheit = (tempNumber * 9 / 5) + 32;
                System.out.println("Celsius to Fahrenheit is: " + fahrenheit);
                break;
            }
            }
           
        }
    }
}
