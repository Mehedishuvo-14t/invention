/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiplication.java;

/**
 *
 * @author pc
 */
import java.io.*;
import java.util.*;
public class fraction {
 private int a;
  private int b;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Scanner sc=new Scanner(System.in);
  void get( ){
      System.out.println("enter a,b:");
      a=sc.nextInt();
      b=sc.nextInt();
  }
  void calculate(fraction fg){
      a=fg.a*a;
      b=fg.b*b;
      //System.out.println(a+ "/"+b);
  }
  void display(){
      int gcd=0;
      if(a>=b){
          for(int i=1;i<=a;i++){
              if(b%i==0 && a%i==0){
                 gcd=i; 
              }
          }
      }
      else if(b>=a){
            for(int i=1;i<=b;i++){
              if(b%i==0 && a%i==0){
                 gcd=i; 
              }
          }
      }
      System.out.println(a/gcd+"/"+b/gcd);
  }
  
  }
   

