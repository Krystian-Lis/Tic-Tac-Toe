package com.kolkoikrzyzyk;

public class Zasady {
    
    
    boolean drugiGracz = true;

    public boolean sprawdzWynik(char[][] tab) {
         if ((tab[0][0] == tab[1][0] && tab[1][0] == tab[2][0] && tab[2][0] != '.') ||
            (tab[0][1] == tab[1][1] && tab[1][1] == tab[2][1] && tab[2][1] != '.') ||
            (tab[0][2] == tab[1][2] && tab[1][2] == tab[2][2] && tab[2][2] != '.') ||
            (tab[0][0] == tab[0][1] && tab[0][1] == tab[0][2] && tab[0][2] != '.') ||
            (tab[1][0] == tab[1][1] && tab[1][1] == tab[1][2] && tab[1][2] != '.') ||
            (tab[2][0] == tab[2][1] && tab[2][1] == tab[2][2] && tab[2][2] != '.') ||
            (tab[0][0] == tab[1][1] && tab[1][1] == tab[2][2] && tab[2][2] != '.') ||
            (tab[0][2] == tab[1][1] && tab[1][1] == tab[2][0] && tab[2][0] != '.')) {
             
        if (drugiGracz) 
            System.out.println("Wygral gracz 2 - Krzyzyk!");
        else 
            System.out.println("Wygral gracz 1 - Kolko!");
        return true;
        }
        if (tab[0][0] != '.' && tab[1][0] != '.' && tab[2][0] != '.' &&
            tab[0][1] != '.' && tab[1][1] != '.' && tab[2][1] != '.' &&
            tab[0][2] != '.' && tab[1][2] != '.' && tab[2][2] != '.') {
                System.out.println("Remis!");
                return true;
            }
        
   
    drugiGracz = !drugiGracz;
    return false;
    }
}