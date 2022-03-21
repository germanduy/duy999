package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello son");
        int x=10;
        double pi= 3.14;
        char h='h';
        boolean t = true ;
        String s ="T2108M";
        s =s + " "+ "SEM 2";
        System.out.println(s);
        if(x>=10){
            System.out.println("x>=10");
        }else{
            System.out.println("Not found");
        }
        switch (h){
            case 'a':System.out.println("AA");break;
            case 'h':System.out.println("HH");break;
            default:System.out.println("NOT FOUND");
        }
        for(int i=0;i<10;i++){
            System.out.println("i= "+i);
        }
        System.out.println("nhap 1 so tu ban phim");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println(n);
        sc.nextLine();
        String s1 = sc.nextLine();
        System.out.println("String: "+s1);
        // nhập 1 số từ bàn phím

    }
}
