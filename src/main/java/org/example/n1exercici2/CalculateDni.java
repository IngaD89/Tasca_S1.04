package org.example.n1exercici2;

public class CalculateDni {

    public char calculateDniLetter(Dni dni){
        int rest;
        char letter = ' ';
        char[] letters = new char[] {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        rest =  dni.getDniNumber() % 23;

        for (int i = 0; i < letters.length; i++){
            if(rest == i){
                letter = letters[i];
                System.out.println("Letra correspondiente es " + letter);
            }
        }

        return letter;
    }
}
