package com.rpr.tutorijali;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.print("Unesi broj: ");
        int n = ulaz.nextInt();
        System.out.println("Brojevi od 1 do " + n + " koji su djeljivi sa sumom svojih cifara: ");
        for (int i=1; i<=n; i++){
            if (i%sumaCifara(i) == 0){
                System.out.print(i + " ");
            }
        }

	// write your code here
    }

    public static int sumaCifara(int broj){
        int suma = 0;
        while(broj != 0){
            suma = suma + broj%10;
            broj = broj/10;
        }
        return suma;
    }
}
