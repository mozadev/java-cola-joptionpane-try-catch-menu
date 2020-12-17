/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola;

/**
 *
 * @author Jose
 */
public class Cola {
    NodoCola inicio, fin;
    int tama;
//constructor de inicializar la cola
    public Cola(){
        inicio=fin=null;
        tama=0;
    }
    //para saber si esta vacia la cola
    
    public boolean estaVacia(){
        
        return inicio==null;
    }
    
    //metodo para ingresar
    
    public void insertar(int ele){
        
        
        NodoCola nuevo=new NodoCola(ele);
        
        if(estaVacia()){
            inicio=nuevo;
        }else{
            fin.siguiente=nuevo;
        }
        
        fin=nuevo;
        tama++;
    }
            
       //metodo para quitar un elem de la cola
    public int quitar(){
        int aux=inicio.dato;
        //trasladamos al inicio el q estaba atras
        inicio=inicio.siguiente;
        tama--;
        return aux;
        
    }
            
    //metodo para saber quien esta al inicio de la cola
    public int inicioCola(){
        
        return inicio.dato;
        
        
    }
     public int tamanoCola(){
        
        return tama;
        
        
    }
    
    
}
