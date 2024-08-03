/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventory.java;

/**
 *
 * @author pc
 */
import java.io.*;
import java.util.*;
public class InventoryJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the no of product:");
         int n=Integer.parseInt(br.readLine());
         int[]ar=new int[n];
        product[] p=new product[n];
        for(int i=0;i<n;i++){
             System.out.println("enter the product id,name,price,quantity");
             String id=br.readLine();
             String name=br.readLine();
             int price=sc.nextInt();
             int quantity=sc.nextInt();
            p[i]=new product(id,name,price,quantity);
        }
         System.out.println("how many product you display?");
         int z=sc.nextInt();
         for(int i=0;i<z;i++){
             p[i].display();
         }
         char a;
         do{
         System.out.println("please enter the id which product you want to update");
         String id_2=sc.next();
          for(int i=0;i<n;i++){
              if(id_2.compareToIgnoreCase(p[i].id)==0){
               System.out.println("enter the updated price and quantity:");
               int price=sc.nextInt();
               int quantity=sc.nextInt();
           p[i].price=price;
           p[i].quantity=quantity;
           ar[i]=1;
          }
          }
           System.out.println("Do you want to update again your product information?");
           a=sc.next().charAt(0);
         }while(a=='y'||a=='Y');
         System.out.println("display after update :");
         for(int i=0;i<n;i++){
             if(ar[i]==1){
                 p[i].display();
             }
         }
          char y;
          do{
           System.out.println("enter the id to search of productt:");
           String id_1=sc.next();
          
          for(int i=0;i<n;i++){
              if(id_1.compareToIgnoreCase(p[i].id)==0){
                  System.out.println("id found below");
                  p[i].display();
              }
              else 
                  System.out.println("id not found");
          }
          System.out.println("do you want to search again?");
          y=sc.next().charAt(0);
          }while(y=='y'|| y=='Y');
}
}
