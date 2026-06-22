package eje3;

public class CuentaBancaria {

    private String titular;
    private double saldo;
    private int pin;

    public String getTitular() { return titular; }
    public void setTitular(String titular) { this.titular = titular; }

    public double getSaldo() { return saldo; }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void retirar(double monto, int pinIngresado) {

        if (pinIngresado == pin) {

            if (monto <= saldo) {
                saldo -= monto;
                System.out.println("Retiro exitoso");
            } else {
                System.out.println("Saldo insuficiente");
            }

        } else {
            System.out.println("PIN incorrecto");
        }
    }
}
