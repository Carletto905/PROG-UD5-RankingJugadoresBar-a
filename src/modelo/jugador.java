package modelo;

/**
 * Representa un jugador histórico del FC Barcelona.
 */
public class jugador {
    private String nombre;
    private String posicion;
    private int añosEnElClub;
    private int puntuacion;

    public jugador(String nombre, String posicion, int añosEnElClub, int puntuacion) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.añosEnElClub = añosEnElClub;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public int getAñosEnElClub() {
        return añosEnElClub;
    }
    public void setAñosEnElClub(int añosEnElClub) {
        this.añosEnElClub = añosEnElClub;
    }
    public int getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                ", añosEnElClub=" + añosEnElClub +
                ", puntuacion=" + puntuacion +
                '}';
    }

}
