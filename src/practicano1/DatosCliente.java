/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicano1;

/**
 *
 * @author pc
 */
public class DatosCliente {
    
    String Nombre="";
    int Fec_Nac=0;
    String Placa="";
    int NIT=0;
    int Tel=0;
    
    public DatosCliente(String Nombre,int Fec_Nac,String Placa,int NIT,int Tel){
        this.Fec_Nac=Fec_Nac;
        this.Nombre=Nombre;
        this.Placa=Placa;
        this.NIT=NIT;
        this.Tel=Tel;
    }
}
