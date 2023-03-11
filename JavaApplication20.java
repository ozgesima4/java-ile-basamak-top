
package javaapplication20;

import java.util.Scanner;

public class JavaApplication20 {

    public static void main(String[] args) {
       int sayi,bas,top=0;
        Scanner input=new Scanner(System.in);
        System.out.println("sayiyi gir:");
        sayi=input.nextInt();
        
        while(sayi!=0){
            bas=sayi%10;
            top+=bas;
            sayi/=10;
        }
        
        System.out.println("toplami:"+top);
    }
    
}
