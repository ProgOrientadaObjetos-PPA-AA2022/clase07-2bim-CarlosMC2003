/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Ciudad {

    private String nombres;
    private int poblacion;

    public void establecerNombres(String n) {
        nombres = n;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public void establecerPoblacion(int n) {
        poblacion = n;
    }

    public int obtenerPoblacion() {
        return poblacion;
    }

    @Override
    public String toString() {
        String expResult = String.format("Ciudad de Ecuador\n Nombre: %s\n\n\t"
                + "Población: %d\n",
                obtenerNombres(),
                obtenerPoblacion());
        return expResult;
    }
}
