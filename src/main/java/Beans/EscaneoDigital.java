package Beans;

public class EscaneoDigital {
    public int getIdEscaneoDigital() {
        return idEscaneoDigital;
    }

    public void setIdEscaneoDigital(int idEscaneoDigital) {
        this.idEscaneoDigital = idEscaneoDigital;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Resolucion getResolucion() {
        return resolucion;
    }

    public void setResolucion(Resolucion resolucion) {
        this.resolucion = resolucion;
    }

    private int idEscaneoDigital;
    private double largo;
    private double ancho;
    private double altura;
    private String fecha;
    private Resolucion resolucion;
}
