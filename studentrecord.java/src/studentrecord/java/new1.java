/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentrecord.java;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class new1 {
        Integer num;
   String name;
   Scanner sc=new Scanner(System.in);
   void get_num(){
     System.out.print("enter the num:");
    
     
       num=sc.nextInt();
   
   }
   void get_name(){
       System.out.print("enter the name:");
       name=sc.nextLine();

   }
   void Display(){
        System.out.println("num:"+ num);
         System.out.println("name:"+ name);
   }
}
