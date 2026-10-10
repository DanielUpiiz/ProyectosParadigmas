package upiiz_models;
public class Computadora {
    private String numeroSerie;
    private String codigo;
    private String marca;
    private float precio;

    public Computadora(String numeroSerie, String marca, float precio) {//Constructor
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.precio = precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca(){
        return this.marca;
    }
}