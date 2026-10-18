package figuras;

/**
 * Clase que representa un Círculo en un plano cartesiano de dos dimensiones.
 */
public class Circulo {
    // Atributos encapsulados (privados)
    private double x;
    private double y;
    private double radio;

    // Constructor por defecto: círculo unitario en el origen (0, 0) con radio 1
    public Circulo() {
        this.x = 0;
        this.y = 0;
        this.radio = 1;
    }

    // Constructor con coordenada X
    public Circulo(double x) {
        this.x = x;
        this.y = 0;
        this.radio = 1;
    }

    // Constructor con coordenadas X e Y
    public Circulo(double x, double y) {
        this.x = x;
        this.y = y;
        this.radio = 1;
    }

    // Constructor completo con coordenadas y radio
    public Circulo(double x, double y, double radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    /**
     * Calcula y retorna el área del círculo (PI * r^2).
     */
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    /**
     * Calcula y retorna el perímetro o circunferencia (2 * PI * r).
     */
    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    /**
     * Desplaza el círculo sobre el eje X.
     * @param unidadesX Unidades a sumar a la posición en X.
     */
    public void moverX(double unidadesX) {
        this.x += unidadesX;
    }

    /**
     * Desplaza el círculo sobre el eje Y.
     * @param unidadesY Unidades a sumar a la posición en Y.
     */
    public void moverY(double unidadesY) {
        this.y += unidadesY;
    }

    /**
     * Desplaza el círculo en ambos ejes simultáneamente.
     */
    public void moverXY(double unidadesX, double unidadesY) {
        this.x += unidadesX;
        this.y += unidadesY;
    }

    /**
     * Muestra en consola el estado actual del círculo.
     */
    public void dibujar() {
        System.out.println("Círculo en posición -> X: " + this.x + ", Y: " + this.y + " | Radio: " + this.radio);
    }

    // Getters y Setters (útiles para el desafío opcional y buenas prácticas)
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}