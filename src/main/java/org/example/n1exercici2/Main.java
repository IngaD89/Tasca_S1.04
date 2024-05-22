package org.example.n1exercici2;

public class Main {
       private static final CalculateDni calculateDni = new CalculateDni();

    public static void main(String[] args) {

        Dni dni = new Dni(457873955);
        calculateDni.calculateDniLetter(dni);
    }
}
