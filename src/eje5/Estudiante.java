package eje5;

public class Estudiante {

    private String carnet;
    private String nombre;
    private double promedio;

    public void setCarnet(String carnet) { this.carnet = carnet; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 100) {
            this.promedio = promedio;
        }
    }

    public boolean esBecado() {
        return promedio >= 85;
    }
}
