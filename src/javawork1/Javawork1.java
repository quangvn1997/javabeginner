/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawork1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Javawork1 {
    //
    private static int a ;
    private static int b;
    private static int d ;
    //phép cộng 
    public  static int sum1(int a ,int b){
        return a+b;
    }
    //phép trừ
    public int minus(int a ,int b){
        return a-b;
    }
    public int divide(int a , int b){
      
            return b/a;
        
        
    }
    public static void Congmang(){
     
        System.out.println("nhap gioi han");
        d = new Scanner(System.in).nextInt();
        int[] array = new int[d];
        int sum = 0;
        for(int e = 0 ;e <d ;e++){
            
            System.out.println("nhap gia tri " );
            array[e] = new Scanner(System.in).nextInt();
            
            sum = sum + array[e];
                    
        }
        System.out.println("tong " + sum );
    }
    public static void input (){
        System.out.println("nhap a ");
        a = new Scanner(System.in).nextInt();
        System.out.println("nhap b");
        b = new Scanner(System.in).nextInt();
        
    }
    public static void menu(){
        
        int choice = 6;
        while ( choice !=5){
        System.out.println("-- chuong trinh chay --");
        System.out.println("-- 1. phep cong  --");
        System.out.println("-- 2. phep tru  --");
        
        Scanner choice1 = new Scanner(System.in);
        choice = choice1.nextInt();
        
        switch(choice){
            case 1 :
                System.out.println("1. tong = ");
                 Javawork1.Congmang();
            break;
            case 2 : System.out.println("2. phep tru ");
            break;
            case 5 : System.out.println("ket thuc ");break;
            
    }
        
    }
    }
    
    public static void main(String[] args) {
        Javawork1 javawork1 = new Javawork1();
        System.out.println(javawork1.sum1(5, 7));
        System.out.println(javawork1.minus(5, 7));
        
        
        
       Javawork1.menu();
       

    }
    
}
