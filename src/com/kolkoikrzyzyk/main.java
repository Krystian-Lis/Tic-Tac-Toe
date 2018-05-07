package com.kolkoikrzyzyk;

public class main {

    public static char tab[][] ={   {'.', '.', '.'},
                                    {'.', '.', '.'},
                                    {'.', '.', '.'}};
    
    public static void main (String[] args) throws Exception {
        
        Player player1 = new Player();
        Player player2 = new Player();
        Zasady zasady = new Zasady();
        System.out.println("Witam w grze \"Kolko i krzyzyk\".\nAby wyjsc z gry"
                + " w dowolnym momencie napisz: qt \n"
        + "--------------------\n");
        
        while(!zasady.sprawdzWynik(tab)){
            narysujTabele();
            if(zasady.drugiGracz){
            player2.ruch(tab, "Krzyzyk", 'X');
            } else {
                player1.ruch(tab, "Kolko", 'O');
            }
        }
        narysujTabele();
    }
    
    private static void narysujTabele() {
        
        System.out.println("  1 2 3");
        System.out.println("A " + tab[0][0]+ "|" + tab[0][1]+ "|"
                + tab[0][2]);
        System.out.println("B " + tab[1][0]+ "|" + tab[1][1]+ "|" 
                + tab[1][2]);
        System.out.println("C " + tab[2][0]+ "|" + tab[2][1]+ "|"
                + tab[2][2]);
        
    }      
    
}



    
    
    
       
     
    


