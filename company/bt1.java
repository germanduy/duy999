package com.company;

import java.util.Scanner;

public class bt1 {
    public static  void main(String arg[]){
        System.out.println("Nhập 1 số bất kì");
        Scanner x =  new Scanner(System.in);
        int y;
        y = x.nextInt(); //nhập y
        if(checkPrime(y)){
            System.out.println(y + " là số nguyên tố");
        }else{
            System.out.println(y + " không là số nguyên tố");
        }
        //mảng
        int[] bh = new int[10];
        bh[3]= 44;
        for(int i=0; i<10;i++){
            bh[i]= i*2+1;
        }
        for(int i=0; i<10;i++){
            System.out.println(bh[i]);
        }
        // duyệt mảng for-each chỉ duyệt xuôi

        for(int r : bh){
            System.out.println(r);
        }
    }
    public static boolean checkPrime(int n){
        if(n<2) return false;
        if(n<4) return true;
        for(int i = 2; i<= n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
