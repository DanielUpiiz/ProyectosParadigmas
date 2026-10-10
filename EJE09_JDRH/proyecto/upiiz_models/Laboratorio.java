package upiiz_models;
import java.util.ArrayList;
import java.util.List;

public class Laboratorio {
    
    private int id;
    private String nombre;
    private String color;
    private String encargado;
    private List<Mesa> mesas;

    public Laboratorio(int id, String color, String nombre) {//Constructor
        this.id = id;
        this.color = color;
        this.nombre = nombre;
        this.mesas = new ArrayList<>();
    }

    public void agregarMesa(Mesa mesa) {
        this.mesas.add(mesa);
    }

    public void mostrarMesas() {
        System.out.println(this.nombre);
        for (int i = 0; i < mesas.size(); i++) {
            System.out.println("--- Mesa " + (i + 1) + " ---");
            mesas.get(i).mostrarComputadoras();
        }
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getEncargado() {
        return this.encargado;
    }
}