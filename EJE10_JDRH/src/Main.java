import figuras.Circulo;

//Jorge Daniel Rodŕiguez Hernández

public class Main {
    public static void main(String[] args) {
        
        System.out.println("CREACIÓN DE CÍRCULOS");
        Circulo c1 = new Circulo();                     // (0, 0), por defecto el radio es 1
        Circulo c2 = new Circulo(3.0, 4.0);             
        Circulo c3 = new Circulo(-3.4, 7.0, 3.3);       // (-3.4, 7), r = 3.3

        // Dibujar estado inicial
        c1.dibujar();
        c2.dibujar();
        c3.dibujar();

        // Cálculo de área y perímetro
        System.out.println("\nCÁLCULOS DE ÁREA Y PERÍMETRO");
        mostrarMetricas("Círculo 1", c1);
        mostrarMetricas("Círculo 2", c2);
        mostrarMetricas("Círculo 3", c3);

        // Modificación de posición
        System.out.println("\nTRASLACIÓN DE CÍRCULOS");
        c1.moverX(7.0);           // Se mueve 7 unidades en X
        c2.moverY(-5.0);          // Se mueve -5 unidades en Y
        c3.moverXY(5.5, -5.0);    // Se mueve a la derecha y abajo

        System.out.println("Nuevas posiciones tras el movimiento:");
        c1.dibujar();
        c2.dibujar();
        c3.dibujar();
    }

    // Método auxiliar para imprimir métricas
    private static void mostrarMetricas(String nombre, Circulo c) {
        System.out.printf("%s -> Área: %.4f | Perímetro: %.4f%n",
                nombre, c.calcularArea(), c.calcularPerimetro());
    }
}