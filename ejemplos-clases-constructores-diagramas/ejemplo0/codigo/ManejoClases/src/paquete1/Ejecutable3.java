/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author User
 */
public class Ejecutable3 {
    public static void main(String[] args){
        
        Computadora personal = new Computadora();
        personal.establecerTipoProcesador("Intel  vPRo");
        
        
        System.out.printf("%s - %s.2f",
                personal.obtenerTipoProcesador(), 
                personal.obtenerMemoria());
        
        
    }
}
