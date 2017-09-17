package com.aiqiyi.demo;

import java.util.Scanner;

public class Sqr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j,k;
        j = sc.nextInt();
        k = sc.nextInt();
        int num = Math.min(j,k);
        int min = Math.min(j,k);
        int max = Math.max(j,k);
        int count = 0;
        for (int i = 1; i <= min; i++) {
            for (int x = 1; x <= min; x++) {
                if(i==x){
                    continue;
                }
                double temp = Math.sqrt(i*x);
                int tempInt = (int) temp;
                if(temp-tempInt<10E-5){
                    num++;
                }
            }
        }
        for (int i = min+1; i <= max; i++) {
            for (int x = 1; x <= min; x++) {
                if(i==x){
                    continue;
                }
                double temp = Math.sqrt(i*x);
                int tempInt = (int) temp;
                if(temp-tempInt<10E-5){
                    num++;
                }
            }
        }

        System.out.println(num);
    }

}
