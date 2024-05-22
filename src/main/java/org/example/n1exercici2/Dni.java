package org.example.n1exercici2;

public class Dni {
    private int dniNumber;
    public Dni(int dniNumber) {
        this.dniNumber = dniNumber;
    }
    public int getDniNumber() {
        return this.dniNumber;
    }
    public void setDniNumber(int dniNumber) {
        this.dniNumber = dniNumber;
    }

    @Override
    public String toString() {
        return "DNI{" +
                "dniNumber = " + this.dniNumber +
                '}';
    }
}

