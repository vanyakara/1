/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ваня
 */
public class App {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Vuvedete tsialo chislo: ");
        int n=scan.nextInt();
        if(n%2!=0){
            System.out.println("Triabva tsialo chislo!");
            return;
        }
        int[]array=new int[n];
        Random r=new Random();
        for(int i=0;i<n;i++){
            array[i]=r.nextInt(n+1);
        }
        int m=n/2;
        System.out.println("Chislata sus stoinost "+m+" se namirat na slednite pozitsii: ");
        for(int i=0;i<m;i++){
            System.out.println("pozitsiq: "+i);
        }
    }
}
