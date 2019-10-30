
import java.util.ArrayList;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan
 */
public class DepthFirstSearc {
   ArrayList <Nodo>camino=new ArrayList<Nodo>();

    public DepthFirstSearc() {
        
    }
     
     public ArrayList<Nodo> procesar(String ini, String meta){
          ProcesarPilas pp=new ProcesarPilas();
          pp.obtenerHijos();
          Nodo inicial=pp.buscar(ini);
          Nodo objetivo=pp.buscar(meta);
          
         Stack<Nodo> pila = new Stack<Nodo>();
         inicial.setEstado(true);
         pila.push(inicial);
         
         camino.add(inicial);
         while(!pila.isEmpty()){
             
              Nodo actual=pila.pop();
             actual.setEstado(true);
             if(actual.getValor().equals(objetivo.getValor())){
                
             }else{
               for(int i=0;i<actual.getHijos().size();i++){
                 if(actual.getHijos().get(i).isEstado()==false){
                     actual.setEstado(true);
                     camino.add(actual);
                     pila.push(actual);
                 }
             }  
             }
             
             
         }
         return camino;
     }
}
