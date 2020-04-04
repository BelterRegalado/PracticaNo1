/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicano1;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner end = new Scanner (System.in);
        Cliente cliente = new Cliente();
       
       
       //cliente.Cobro();
       //cliente.Añadir(cliente);
       //cliente.Imprimir();
       
          String Nombre,Placa;
           int NIT,Tel,Fec_Nac;
           double Hora_Salida;
           System.out.println("__________Bienvenido Nuevo cliente________________\n");
           int op;
           do{
             
       System.out.print("Ingrese su nombre : ");
       Nombre=end.next();
       System.out.print("En que año nacio? : ");
       Fec_Nac =end.nextInt();  
       System.out.print("Ingrese la placa vehiculo:");
       Placa =end.next(); 
       System.out.print("Ingrese su NIT : ");
       NIT =end.nextInt();  
       System.out.print("Ingrese su Numero de telefono: ");
       Tel =end.nextInt(); 
     DatosCliente datos = new DatosCliente(Nombre,Fec_Nac,Placa,NIT,Tel);
       
       int edad =2020-Fec_Nac;
     /*if (Fec_Nac>60){
         
         System.out.println(" Usted tiene : ¨"+edad+"¨ Y sera tomada como una persona mayor ");
     }else{
       System.out.println("Datos ingresados con exito...");
     }
*/
         System.out.println("Desea ingresar otro cliente 1.-Si 2.-No");
         op =end.nextInt();
     
     }while(op==1);
           
    cliente.ImprimirNombre();
           
    }
    
    
    
}
