package com.company;

import java.util.Scanner;

public class btvn1 {
    public static void main(String arg[]){
        System.out.println("Nhập 1 số bất kì: ");
        Scanner x = new Scanner(System.in);
        int n;
        int tonguoc = 0;
        n = x.nextInt();
        for(int i=1; i<n ; i++){
            if(n%i==0){
                tonguoc += i;
            }
        }
        if(tonguoc==n){
            System.out.println(n +" là số hoàn hảo");
        }else {
            System.out.println(n +" không là số hoàn hảo");
        }
    }
}
