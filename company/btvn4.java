package com.company;

import java.util.Scanner;

public class btvn4 {
    public static void main(String arg[]){
        Scanner a = new Scanner(System.in);
        int x,y;
        int ucln=0;
        int bcnn=0;
        System.out.println("Nhập số thứ nhất: ");
        x= a.nextInt();
        System.out.println("Nhập số thứ hai: ");
        y= a.nextInt();
        //tìm ước chung lớn nhất
        if(x>y){
            for( int i=1 ; i<=y;i++)
            {
                if(x%i==0 && y%i==0){
                    ucln = i ;
                }
            }
        }else{
            for( int i=1 ; i>x;i++)
            {
                if(y%i==0 && x%i==0){
                    ucln = i ;
                }
            }
        }
        System.out.println("Ước chung lớn nhất của 2 số là: "+ucln);
        //tìm bội chung nhỏ nhất
        if(x==0|| y==0){
            System.out.println("hai số vừa nhập không có bội chung nhỏ nhất");
        }else{
            for(int i=1; i<=x*y; i++){
                if(i%x==0 && i%x==0){
                    bcnn=i;
                    System.out.println("Bội chung nhỏ nhất của 2 số là "+ bcnn);
                    break;
                }
            }
        }
    }
}
