package javamtpalindrom;

import java.util.Scanner;

public class JavaMTPalindrom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String red;
        novi_red:
        do {
            System.out.println("Unesite novu recenizu (<enter> za kraj):");
            red = input.nextLine();
            red.toLowerCase(); // pretvaranje svih znakova reda u mala slova
            String recenica = "";
            for (int i = 0; i < red.length(); i++) {
                char znak = red.charAt(i);
                if (Character.isLetter(znak)) 
                    recenica = recenica + znak;
                }

                int l = 0;
                int d = recenica.length() - 1;
                while (l < d) {
                    if (recenica.charAt(l) != recenica.charAt(d)) {
                        System.out.println("To nije palindrom");
                        continue novi_red;

                    }
                    l++;
                    d--;
                }
                System.out.println("To jeste palindrom");

            }while (red.length() != 0);



        }
        }