package eje6;

public class Termometro {

    private double celsius;

    public void setCelsius(double temperatura) {
        if (temperatura >= -273.15) {
            this.celsius = temperatura;
        } else {
            System.out.println("Temperatura inválida");
        }
    }

    public double getFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }
}