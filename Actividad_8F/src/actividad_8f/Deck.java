/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_8f;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author jc_ca
 */
public class Deck {
    int NumCartas= 52 ;
    //Mezcla
    public static  void shuffle(ArrayList deck){
        int cont =1;
        System.out.println("*********************");
        ArrayList<String> mazo = deck;
        Collections.shuffle(mazo);
        System.out.println("Se mezcló el Deck.");
        System.out.println(" " );
        //Iterator<String> nombreIterator2 = deck.iterator();
      /*while(nombreIterator2.hasNext()){
            String elemento = nombreIterator2.next();
           System.out.println(cont+".-"+elemento);
           cont++;
       }*/
    }

   //Head
    public static void head(ArrayList deck){
         System.out.println("*********************");
        System.out.println(deck.get(0));
        deck.remove(0);
        System.out.println("Quedan " + deck.size() + " cartas ");
        System.out.println(" ");
    }

    //Pick
    public static void pick(ArrayList  deck){
         System.out.println("*********************");
        Random a = new Random();
        System.out.println(deck.get(a.nextInt(deck.size())));
        deck.remove(a.nextInt(deck.size()));
        System.out.println("Quedan " + deck.size() + " cartas ");
        System.out.println(" ");
    }

   //hand
    public static void hand(ArrayList deck){
         System.out.println("*********************");
        for(int i=0; i<=4; i++){
            System.out.println(deck.get(i));
        }
        for(int i=0; i<=4; i++){
            deck.remove(i);
        }
        System.out.println("Quedan " + deck.size()+ " cartas");
        System.out.println(" " );
    }

  
        
    }
