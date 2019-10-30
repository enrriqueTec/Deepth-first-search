
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan
 */
public class ProcesarPilas {
     ArrayList<Nodo> pilaPadres=new ArrayList<Nodo>();
     String pilaPadre="A,B,C";

    public ProcesarPilas() {
    }
    
    public ArrayList<Nodo> obtenerPila(){
        String partes[];
         partes=pilaPadre.split(",");
        
       try {
            for (int i = 0; i < partes.length; i++) {
                pilaPadres.add(new Nodo(false, partes[i], null));
               
                
            }
            
      } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La cadena ingresada en la pila padres no tiene el formato requerido, debe estar separado por comas");
        }
        return pilaPadres;
    }
    
    public ArrayList<Nodo> obtenerHijos(){
        int numH=0;
        ArrayList<Nodo> padres=obtenerPila();
        ArrayList<Nodo> hijos=new ArrayList<>();
        for(int i=0; i< pilaPadres.size();i++){
         
            numH=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de hijos de "+padres.get(i).getValor()));
            for(int j=0; j<numH;j++){
                 String h=JOptionPane.showInputDialog("Ingrese el hijo "+j+" de "+padres.get(i).getValor());
                hijos.add(buscar(h));
                
              } 
            //System.out.println("Hijos ingresados "+hijos.get(i).getValor());
            pilaPadres.get(i).setHijos(hijos);
             for(int j=0;j<pilaPadres.get(i).getHijos().size();j++){
                 System.out.println("Nodo "+pilaPadres.get(i).getValor());
                System.out.println("hijo del nodo "+pilaPadres.get(i).getHijos().get(j).getValor());
           }
          hijos.clear();
        }
        return pilaPadres;
    }
    
    public Nodo buscar(String dato){
        Nodo nodo=new Nodo();
       
        for(int i=0; i<pilaPadres.size();i++){
            
            if(pilaPadres.get(i).getValor().equals(dato)){
                nodo=pilaPadres.get(i);
              
            }
        }
        return nodo;
    }
    public void mostrar(){
        for(int i=0; i<pilaPadres.size();i++){
            System.out.println("Nodo "+pilaPadres.get(i).getValor());
          
           for(int j=0;j<pilaPadres.get(i).getHijos().size();j++){
                System.out.println("hijo del nodo "+pilaPadres.get(i).getHijos().get(j).getValor());
           }
        }
    }
     public static void main(String args[]) {
         ProcesarPilas pp=new ProcesarPilas();
         pp.obtenerHijos();
         //pp.mostrar();
     }
}
