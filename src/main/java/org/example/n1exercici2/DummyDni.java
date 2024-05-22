package org.example.n1exercici2;

public class DummyDni {

   private static final CalculateDni calculateDni = new CalculateDni();

    public static char dniZ(){
        Dni dni1 = new Dni(12345678);
        return calculateDni.calculateDniLetter(dni1);
    }
}
