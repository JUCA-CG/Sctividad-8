/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_8f;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author jc_ca
 */
public class Actividad_8F {
public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));  
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

             
        int deck1 = showMenu(deck);
       /* Iterator<String> nombreIterator = deck.iterator();
        int cont =1;
       while(nombreIterator.hasNext()){
            String elemento = nombreIterator.next();
            System.out.println(cont+".-"+elemento);
           cont++;
        }*/
     
        }catch (Exception e){
            System.out.println("Ha sucedido un error, vuelva intentar");   
        }
   } 
    
    //MÉTODO PARA MOSTRAR MENÚ Y SELECCIÓN DE OPCIONES POR PARTE DEL USUARIO
    private static int showMenu(ArrayList deck) throws IOException {
        int m;
    System.out.println("Bienvenido a Poker!" );
    do{
        m = 0;
        boolean e = true;
System.out.println("Selecciona una opción:\n" +
"1-Mezclar deck\n" +
"2-Sacar una carta\n" +
"3-Carta al azar\n" +
"4-Generar una mano de 5 cartas\n" +
"0-Salir");
      Deck llamada = new Deck();
  int opcion = Integer.parseInt(entrada.readLine());
   switch(opcion){
       case 0:
           System.out.println("Haz elegido salir\n"+"Gracias por utilizar el programa");
           
           return m;
          
        case 1:
            System.out.println("Haz elegido mezclar deck");
            llamada.shuffle(deck);
           break;
        case 2:
            System.out.println("Haz elegido sacar una carta");
            llamada.head(deck);
           break;
        case 3:
            System.out.println("Haz elegido una carta al azar");
            llamada.pick(deck);
           break;
           
        case 4:
            System.out.println("Haz elegido generar una mano de 5 cartas");
            llamada.hand(deck);
           break;
           
         default: System.out.println("opción no válida, favor de elegir otra opción");
         m = 1;
         e = false;
             break;
   
           
   }
   if(e ==true){
   System.out.println("Presione (1) para volver a elegir una opción del menú o cualquier otro número para salir");
   int o =Integer.parseInt(entrada.readLine());
   if (o==1){
       m=1;
   }}
    }while(m==1);
    System.out.println("Gracias por utilizar el programa");
    return m;
       
        
    }
}
    