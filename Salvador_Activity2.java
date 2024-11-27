/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salvador_activity2;
import java.util.Scanner;
/**
 *
 * @author Beboy
 */
public class Salvador_Activity2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Five Subject Marks");
        
        System.out.println("(1 Physics)");
        int Physics = scanner.nextInt();
        System.out.println("(2 Chemistry)");
        int Chemistry = scanner.nextInt();
         System.out.println("(3 Biology)");
        int Biology = scanner.nextInt();
         System.out.println("(4 Mathematics)");
        int Mathematics = scanner.nextInt();
         System.out.println("(5 Computer)");
        int Computer = scanner.nextInt();
        
        
        int TotalGrade = Physics+Chemistry+Biology+Mathematics+Computer;
        System.out.println("Total Grade:"+TotalGrade);
    
        int Percentage = TotalGrade/5;
        System.out.println("Percentage "+Percentage+"%");
        if (Percentage >= 90 ){
            System.out.print("Grade A");
        }
        else if (Percentage >= 80 ){
            System.out.print("Grade B");
            
        }
         else if (Percentage >= 70 ){
            System.out.print("Grade C");
            
        }
         else if (Percentage >= 60 ){
            System.out.print("Grade D");
            
        }
         else if (Percentage >= 40 ){
            System.out.print("Grade E");
            
        }
        
        else if (Percentage <= 40 ){
            System.out.print("Grade F");
            
        }
        
      
        
        
        
        
        
        
        
        
        
       
    }
}
