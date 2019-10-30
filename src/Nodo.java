
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan
 */
public class Nodo {
    boolean estado;
    String valor;
    ArrayList<Nodo> hijos;

    public Nodo(boolean estado, String valor, ArrayList<Nodo> hijos) {
        this.estado = estado;
        this.valor = valor;
        this.hijos = hijos;
    }

    public Nodo() {
        super();
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public ArrayList<Nodo> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Nodo> hijos) {
        this.hijos = hijos;
    }
    
    
}
