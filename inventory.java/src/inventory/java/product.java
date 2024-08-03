/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory.java;

/**
 *
 * @author pc
 */
public class product {
    String id;
    String name;
    int price;
    int quantity;
    public product(String id,String name,int price,int quantity){
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    void display(){
        System.out.println("id:"+id);
         System.out.println("name:"+name);
          System.out.println("price:"+price);
          System.out.println("quantity:"+quantity);
        
    }
}
