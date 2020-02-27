package br.com.github;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Integer numberInsert;
    public static void main(String[] args) throws InputMismatchException{
        try{
            Main.insertNumber();
        } catch (Exception e){
            Main.main(args);
        }
    }

    public static void insertNumber(){
            Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número !");
        Main.numberInsert = scan.nextInt();
        Main.fatorial(Main.numberInsert);
    }

    public static void fatorial(Integer n){
        double f = n;
        while (n > 1){
            f = f *(n-1);
            n--;
            System.out.println(f);
        }

    }


}
