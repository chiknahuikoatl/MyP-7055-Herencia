// Clase Abstracta para pasajeros
package Transporte.Clasificacion;

import Transporte.TT;

public abstract class Pasajeros implements TT {


    public void conducir() {
        System.out.println("Conduciendo");
    }

    public abstract String toString();

}