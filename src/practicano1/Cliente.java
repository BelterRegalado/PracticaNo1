/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicano1;

import java.util.Scanner;
import practicano1.DatosCliente;
/**
 *
 * @author pc
 */
public class Cliente {
    
    Scanner end = new Scanner (System.in);
   public  Nodo inicio = null;
     public int tamanio = 0;
  public boolean isVacia(){
        return tamanio==0;
    }

    
    public void Añadir(DatosCliente datos){
      
          Nodo nodoTmp = new Nodo (DatosCliente datos,null);
        
        if (isVacia()){
            inicio= nodoTmp;
            
        }else{
            nodoTmp.siguiente = inicio;
            inicio = nodoTmp;
            
                
        }
        tamanio++;

    }
    
    public void Cobro(){
        double tiempo,Total;
        
        System.out.println(" Cuanto tiempo estuvo en el parqueo hrs: ");
        tiempo =end.nextDouble();
        Total=tiempo*15;
        System.out.println("Su total a pagar es Q "+Total);
        
    }
    
    public void Busqueda(){
        
    }
    public void Grafo(){
        
    }
    public void ImprimirNombre(){
          
        Nodo nodoTmp = inicio;
        System.out.println("---------ID Producto--------");
        System.out.print("|"+nodoTmp+"|-->");
        while(nodoTmp.siguiente!=null){
            nodoTmp = nodoTmp.siguiente;
            System.out.print("|"+nodoTmp.informacionNodo.idProducto+"|-->");
        }  
    }


    }

