package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        //Initialisation de la variable quota
        int quota = 10;

        //Question
        System.out.print("Combien de vente avez vous effectuer cette semaine ?");
        Scanner clavier = new Scanner(System.in);
        int nbvente = clavier.nextInt();
        clavier.close();

        //Les réponses
        if (nbvente < quota) { 
            System.out.print("Ce n'est pas assez");
        }
        else{if (nbvente == quota) {
            System.out.print("C'est juste !");
        }
        else{if (nbvente > quota) {
            System.out.print("Félicitation vous avez depassé le quota");
        }
    }
    }
    }
    
}
