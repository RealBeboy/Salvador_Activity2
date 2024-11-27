/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salvador_activity2;

/**
 *
 * @author Beboy
 */
public class Salvador_Activity2 {

    public static void main(String[] args) {
        System.out.println("Hello this is my Bio Data");
        System.out.println("==========================");
        String fullname = "Justine Roy Pueblo Salvador";
        String bday = "November 29, 2007";
        String Address = "P-8 Sinayawan Valencia city, Budkidnon";
        int age = 2007;
        int year = 2023;
        short height = 172;
        double heightfeet = height/30.48d;
        
                
        System.out.println("Full name:");
        System.out.println(fullname);
        System.out.println("==========================");
        
        System.out.println("Birthday:");
        System.out.println(bday);
        System.out.println("==========================");
        
        System.out.println("Adress:");
        System.out.println(Address);
        System.out.println("==========================");
        System.out.println("Age:");
        System.out.println(year - age);
        
        System.out.println("==========================");
        System.out.println("Height in CM:");
        System.out.println(height);
        System.out.println("Height in Feet:");
        System.out.println(heightfeet);
        System.out.println("==========================");
    }
}
