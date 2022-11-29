package Beans;

public class Impresion3D {
    private int idImpresion3D;
    private boolean autoservicio;
    private String fecha;
    private String urlImagen;
    private Material3D material3D;
    private Grosor grosor;
    private Altura altura;

    public int getIdImpresion3D() {
        return idImpresion3D;
    }

    public void setIdImpresion3D(int idImpresion3D) {
        this.idImpresion3D = idImpresion3D;
    }

    public boolean isAutoservicio() {
        return autoservicio;
    }

    public void setAutoservicio(boolean autoservicio) {
        this.autoservicio = autoservicio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public Material3D getMaterial3D() {
        return material3D;
    }

    public void setMaterial3D(Material3D material3D) {
        this.material3D = material3D;
    }

    public Grosor getGrosor() {
        return grosor;
    }

    public void setGrosor(Grosor grosor) {
        this.grosor = grosor;
    }

    public Altura getAltura() {
        return altura;
    }

    public void setAltura(Altura altura) {
        this.altura = altura;
    }

    public DensidadPieza getDensidadPieza() {
        return densidadPieza;
    }

    public void setDensidadPieza(DensidadPieza densidadPieza) {
        this.densidadPieza = densidadPieza;
    }

    private DensidadPieza densidadPieza;
}
