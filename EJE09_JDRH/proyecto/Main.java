import upiiz_models.Computadora;
import upiiz_models.Laboratorio;
import upiiz_models.Mesa;

public class Main {
    public static void main(String[] args) {//Repositorio Github: https://github.com/DanielUpiiz/ProyectosParadigmas/tree/main/EJE09_JDRH/proyecto

        Computadora comp1 = new Computadora("SN-3287428", "Lenovo", 16800.75f);// Instanciar objetos computadora
        Computadora comp2 = new Computadora("SN-8957421", "Alienware", 15500.50f);
        Computadora comp3 = new Computadora("SN-9128992", "Asus", 16800.75f);
        Computadora comp4 = new Computadora("SN-4214782", "Dell", 16800.75f);

        Mesa mesa1 = new Mesa("Madera", "Café");// Instanciar objetos mesa
        Mesa mesa2 = new Mesa("Metal", "Negro");

        mesa1.agregarComputadora(comp1);// Agregar las computadoras a sus mesas
        mesa1.agregarComputadora(comp2);

        mesa2.agregarComputadora(comp3);
        mesa2.agregarComputadora(comp4);

        Laboratorio lab1 = new Laboratorio(1, "Blanco", "Laboratorio de Cómputo 1");// Instanciar el Laboratorio

        lab1.setEncargado("Rafael");

        lab1.agregarMesa(mesa1);// Agregar las mesas
        lab1.agregarMesa(mesa2);

        System.out.println("---- INVENTARIO DEL LABORATORIO ----");
        lab1.mostrarMesas();
    }
}
