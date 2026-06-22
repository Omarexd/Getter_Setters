package eje9;

public class Jugador {

    private String nombre;
    private int puntajeActual;
    private int puntajeMaximo;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntajeActual(int puntajeActual) {
        if (puntajeActual >= 0) this.puntajeActual = puntajeActual;
    }

    public int getPuntajeMaximo() {
        return puntajeMaximo;
    }

    public void actualizarPuntaje(int nuevoPuntaje) {

        if (nuevoPuntaje > puntajeMaximo) {
            puntajeMaximo = nuevoPuntaje;
        }

        puntajeActual = nuevoPuntaje;
    }
}
