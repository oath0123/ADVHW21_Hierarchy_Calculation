package com.example.lib;

import java.util.Scanner;

public class Caculate {
   final public static void Caculate(){
        Scanner scanner=new Scanner(System.in);
        int n=0;
        float sum=0,last=1;
        System.out.println("�п�Jn�H�p�� 1/2! + 1/3! + �K�K 1/n! ");
        n=Integer.parseInt(scanner.next());
        for (int i=2;i<=n;i++){
            last=last/i;
            sum=sum+last;
        }
        System.out.println(sum);
    }
}
