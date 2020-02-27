package br.com.github;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Integer numberInsert;
    public static Integer result;
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
        for (int i = 0; i<=10; i++){
            result = n * i;
            System.out.println(i +" * " + n + "= " + result );
        }

    }


}
