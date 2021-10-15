/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_8f;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author jc_ca
 */
public class Actividad_8F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
    Card card = new Card();
        int PALOS = card.palo.length;
        int VALORES = card.valor.length;
        int COLORES = card.color.length;
        String color;

      
        ArrayList<String> deck = new ArrayList<String>();
        for (int i = 0; i < VALORES; i++) {
            for (int j = 0; j < PALOS; j++) {
                if(Card.palo[j].toLowerCase().equals("diamante")||Card.palo[j].toLowerCase().equals("corazón")){
                  color = card.color[0];
            }
                else{
                    color = card.color[1];     
        }
            deck.add("Palo: "+card.palo[j]+ ", Color: "+color + ", Valor: "+ card.valor[i]); }        }

       
       /* Iterator<String> nombreIterator = deck.iterator();
        int cont =1;
       while(nombreIterator.hasNext()){
            String elemento = nombreIterator.next();
            System.out.println(cont+".-"+elemento);
           cont++;
        }*/
        Deck llamada = new Deck();
        llamada.shuffle(deck);
        llamada.head(deck);
        llamada.pick(deck);
        llamada.hand(deck);
        }catch (Exception e){
            System.out.println("Ha sucedido un error, vuelva intentar");   
        }
   } 
}
   