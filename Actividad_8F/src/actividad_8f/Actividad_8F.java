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
public static String mensaje =("Gracias por utilizar el programa");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
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
            deck.add("Palo: "+card.palo[j]+ ", Color: "+color + ", Valor: "+ card.valor[i]); } 
        }
        System.out.println("Bienvenido a Poker!" );
        boolean s;
  do{
      try{
       int deck1 = showMenu(deck);  
        s = false;
        
    
        }catch (Exception e){
            String men = e.getMessage();
            if(men!="Se han agotado las cartas"){
                s= true;
                
                
            }
            else{
            
            s = false;}
            System.out.println(e.getMessage());
        }
        
   }while(s==true); }

    private static int inicio() throws Exception{
        
     
        /* Iterator<String> nombreIterator = deck.iterator();
        int cont =1;
       while(nombreIterator.hasNext()){
            String elemento = nombreIterator.next();
            System.out.println(cont+".-"+elemento);
           cont++;
        }*/
        
        
    return 0;
    
    }
    //MÉTODO PARA MOSTRAR MENÚ Y SELECCIÓN DE OPCIONES POR PARTE DEL USUARIO
    private static int showMenu(ArrayList deck) throws IOException,Exception {
        int m;
        
    
    do{
        m = 0;
        boolean e = true;
System.out.println("Selecciona una opción:");
System.out.println("1-Mezclar deck"); 
System.out.println("2-Sacar una carta");
System.out.println("3-Carta al azar" );
System.out.println("4-Generar una mano de 5 cartas");
System.out.println("0-Salir");
      Deck llamada = new Deck();
  int opcion = Integer.parseInt(entrada.readLine());

  
   switch(opcion){
       case 0:
           System.out.println("Haz elegido salir\n"+mensaje);
//           return m;
          
        case 1:  
            llamada.shuffle(deck);
           break;
        case 2:

            llamada.head(deck);
           break;
        case 3:
            llamada.pick(deck);
           break;
           
        case 4:
            llamada.hand(deck);
           break;
           
         default: 
         m = 1;
         e = false;
         throw new Exception("Opción no válida, vuelva a intentarlo");
   
           
   }
   if(e ==true){
   System.out.println("Presione (1) para volver a elegir una opción del menú o cualquier otra para salir");
   int o =Integer.parseInt(entrada.readLine());
   if (o==1){
       m=1;
   }}
    }while(m==1);
    System.out.println(mensaje);
    return m;
       
        
    }
    
}