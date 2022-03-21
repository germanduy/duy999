package com.company;

import java.util.Scanner;

public class btvn2 {
    public static void main(String arg[]){
        System.out.println("Nhập số thứ tự trong dãy fibonaci :");
        Scanner fi = new Scanner(System.in);
        int n;
        n = fi.nextInt();
        int f1,f2,f3;
        f1=0;f2=1;f3=1;
        for(int i=4; i<=n;i++){
            f1=f2+f3;
            f2=f3;
            f3=f1;
        }
        if(n>=4) {
            System.out.println("Số đó là: "+f1);
        }
        if(n==2||n==3){
            System.out.println("Số đó là: 1");
        }
        if(n==1){
            System.out.println("Số đó là: 0");
        }
    }
}
