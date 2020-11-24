package com.company.Exercicis;

import java.util.Scanner;

public class Exercici7 {
//
    public static boolean exercici1y2(int number) {
        if (number > 0) {
            return true;
        } else if (number < 0) {
            return false;
        }
        return false;
    }
//
public static void exercici3(int number, int number2) {

        if (number > number2) {
            System.out.println(number + " és major que " + number2);
        } else if(number > number2) {
            System.out.println(number + " és menor que " + number2);
        }
    }
//
public void exercici4(int number) {
    if (number == 1) {
        System.out.println("Dilluns");
    } else if (number == 2) {
        System.out.println("Dimarts");
    } else if (number == 3) {
        System.out.println("Dimecres");
    } else if (number == 4) {
        System.out.println("Dijous");
    } else if (number == 5) {
        System.out.println("Divendres");
    } else if (number == 6) {
        System.out.println("Dissabte");
    } else if (number == 7) {
        System.out.println("Diumenge");
    } else {
        System.out.println("Número incorrecte");
    }

}
//
public void exercici5(int number) {
    if (number == 1) {
        System.out.println("Demati");
            else if (number == 2) {
            System.out.println("Migdia");
        }
        else if (number == 3) {
            System.out.println("Capvespre");
        } else if (number == 4) {
            System.out.println("Vespre");
        }
    }
}
//
public void exercici6(int nota) {
        System.out.println(nota + " és la nota");
    }
//
public static boolean exercici7 (int number){
    if (number > 0) {
        return true;
    } else if(number < 0) {
        return false;
    }
//
    public static void exercici10(int edat_persona) {

            Scanner sc = new Scanner(System.in);
            if(edat_persona < 18) {
                System.out.println("És menor d'edat");
            }else if(edat_persona > 18){
                System.out.println("És major d'edat");
            }
    }



}
