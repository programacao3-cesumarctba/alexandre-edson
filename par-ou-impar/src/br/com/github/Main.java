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
        Main.testNumber(Main.numberInsert);
    }

    public static void testNumber(Integer n){
        if((n%2)==0){
            if(n<10){
                System.out.println("Não é estranho");
            } else if (n>=10 && n<=20){
                System.out.println("Estranho par");
            } else if (n>20) {
                System.out.println("Não é estranho maior que 20");
            }
        } else {
            System.out.println("Estranho");
        }
    }


}
