/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.pkg2;

/**
 *
 * @author Estudiante
 */
public class Parcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    CargarArchivos cargar= new CargarArchivos();
    cargar.Cargar("data.txt");
    String inmuebles=cargar.empresa.Listarinmuebles();
        System.out.println(inmuebles);
    }
}
