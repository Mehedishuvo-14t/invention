/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pc
 */
import java.util.*;
public class student {
    int num;
   String name;
   Scanner sc=new Scanner(System.in);
   void get_data(){
     System.out.println("enter the num:");
     num=sc.nextInt();
      System.out.println("enter the name:");
     name=sc.nextLine();
   }
   void Display(){
        System.out.println("num:"+ num);
         System.out.println("name:"+ name);
   }
    
}
