package org.example.ağağağa;

import java.util.Scanner;

public class SeriesApp {

    public static void main(String[] args) {
        int s = 0;
        int k = 2;
        int a = 1;


        while (s<=a){
            s += a;
            a = 1/k;
            k++;
            System.out.println(a);
        }
        System.out.println(s);
    }

//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//
//        int c = 0;
////        while (a != b) {
////            c++;
////            if (a > b) {
////                a = a - b;
////            } else {
////                b = b - a;
////            }
////        }
////        System.out.println(a + " " + c);
//
//
//        //2
////        int k=1;
////        for(int i = 1; i <= (Math.min(a, b)) ; i++) {
////            c++;
////            if(a%i==0 && b%i==0) {
////                k = i;
////            }
////        }
////        System.out.println(k+ " "+c);
//
//
//        //3
////        while (a != 0 && b != 0) {
////            c++;
////            if (a > b) {
////                a = a % b;
////            }else{
////                b = b % a;
////            }
////        }
////        System.out.println(a+b);
////        System.out.println(c);
//
//    }
}
