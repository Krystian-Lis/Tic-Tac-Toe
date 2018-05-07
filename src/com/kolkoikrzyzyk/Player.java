package com.kolkoikrzyzyk;

import java.util.Scanner;

public class Player{
    
    Scanner input = new Scanner (System.in);
    
    public void ruch(char tab[][], String nazwaGracza, char symbolGracza) throws Exception {
        
        boolean prawidlowyRuch = false;
        System.out.println("Ruch gracza: " + nazwaGracza);
        
        do {
            String wspolrzedne = input.next().toLowerCase();
            
            if (wspolrzedne.equals("qt")){
                System.exit(0);
            }
            if (wspolrzedne.length() != 2) 
                System.out.println("Nieprawidlowe wspolrzedne, wymagane np. a1");
            else {
                try{
                    if(wspolrzedne.charAt(0) == 'a' || wspolrzedne.charAt(0) == 'b' 
                    || wspolrzedne.charAt(0) == 'c'
                    && wspolrzedne.charAt(1) == '1' || wspolrzedne.charAt(1) == '2'
                    || wspolrzedne.charAt(1) == '3'){
                    
                    char b = wspolrzedne.charAt(1);
                    char a = wspolrzedne.charAt(0);
                    switch (wspolrzedne.charAt(0)) {
                        case 'a':
                            a = 0;
                            break;
                        case 'b':
                            a = 1;
                            break;
                        case 'c':
                            a = 2;
                            break;
                    }
                    switch (wspolrzedne.charAt(1)) {
                        case '1':
                            b = 0;
                            break;
                        case '2':
                            b = 1;
                            break;
                        case '3':
                            b = 2;
                            break;
                    }
                    if (tab[a][b] != '.') {
                        System.out.println("To pole jest już zajęte");
                        prawidlowyRuch = false;
                    } else {
                        tab[a][b] = symbolGracza;
                        prawidlowyRuch = true;
                    } 
                    } 
                } catch (ArrayIndexOutOfBoundsException e){
                     System.out.println(e+ "\nNieprawidlowe wspolrzedne!"
                                        + " Sproboj jeszcze raz");
                    prawidlowyRuch = false;
                }
                
            } 
            
        }  while (!prawidlowyRuch);
    }
    
}

