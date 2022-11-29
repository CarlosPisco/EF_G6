package Beans;

public class CorteLaser {
    private int idCorteLaser;
    private double alto;
    private double ancho;
    private String urlImagen;
    private String fecha;
    private GrosorLinea grosorLinea;
    private ColorLinea colorLinea;

    public int getIdCorteLaser() {
        return idCorteLaser;
    }

    public void setIdCorteLaser(int idCorteLaser) {
        this.idCorteLaser = idCorteLaser;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public GrosorLinea getGrosorLinea() {
        return grosorLinea;
    }

    public void setGrosorLinea(GrosorLinea grosorLinea) {
        this.grosorLinea = grosorLinea;
    }

    public ColorLinea getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(ColorLinea colorLinea) {
        this.colorLinea = colorLinea;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    private Material material;

}
