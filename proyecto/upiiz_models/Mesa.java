package upiiz_models;
import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private String codigo;
    private String color;
    private String material;
    private List<Computadora> computadoras;

    public Mesa(String material, String color) {//Constructor
        this.material = material;
        this.color = color;
        computadoras = new ArrayList<>();
    }

    public void agregarComputadora(Computadora computadora) {
        computadoras.add(computadora);
    }

    public void mostrarComputadoras() {
        computadoras.stream().forEach((computadora -> {
            System.out.println("Marca: " + computadora.getMarca());
        }));
    }

}