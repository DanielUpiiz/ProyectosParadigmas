import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main (String[] CorridosTumdcfsfsdbados){
        //int - tipo de dato primitivo
        //Integer - clase  que maneja el dato int
        List<Integer> listadoNumeros;
        listadoNumeros = new ArrayList<>(); //iniciar la calse ListadoNumero

        mostrarMenu(listadoNumeros);
        
    }

    public static int menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\tMenu");
        System.out.println("1. Leer dato");
        System.out.println("2. Muestre los numeros pares");
        System.out.println("3. Muestre los cuadrados de los valores");
        System.out.println("4. Suma de los numeros de la lista");
        System.out.println("5. Buscar un numero de la lista");
        System.out.println("6. Encontrar el valor maximo");
        System.out.println("7. Mostrar lista");
        System.out.println("8. Salir");
        System.out.print("Elige una opcion: ");
        return sc.nextInt();
    }

    public static void mostrarMenu(List<Integer> listado){
        int opcion = 0;
        while(opcion != 8){
            opcion = menu();
            switch (opcion) {
            case 1:
                leerDato(listado);
                break;

            case 2:
                mostrarPares(listado);
                break;

            case 3:
                mostrarCuadrados(listado);
                break;

            case 4:
                mostrarSumatoria(listado);
                break;

            case 5:
                buscarElemento(listado);
                break;

            case 6:
                buscarElementoMayor(listado);
                break;

            case 7: //no era requisito pero lo agrego para verificar las funciones
                mostrarLista(listado);
                break;

            case 8: break;

            default: System.out.print("Opcion no valida");
                
            }
        }
    }

    public static boolean hayElementos(List<Integer> listado){
        if (listado.isEmpty()) {
            System.out.print("La lista esta vacia");
            return false;
        }
        return true;
    }

    public static void mostrarLista(List<Integer> listado){
        if (!hayElementos(listado)) {
            return;
        }

        System.out.print("Los numeros son : ");
            for(int i = 0; i < listado.size(); i++){
                System.out.print(listado.get(i) + " ");
            } 
    }


    public static void leerDato(List<Integer> listado){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un nuemro: ");
        int num = sc.nextInt();
        listado.add(num);

    }

    public static void mostrarPares(List<Integer> listado){
        if (!hayElementos(listado)) {
            return;
        }

        boolean encontrado = false;
        for(int i = 0; i < listado.size(); i++){
            if(listado.get(i) % 2 == 0){
                if(!encontrado){
                    System.out.print("Los numeros pares son : ");
                }
                encontrado = true;
                System.out.print(listado.get(i) + " ");
            }
        }
        if(!encontrado){
            System.out.print("No hay numeros pares");
        }
    }

    public static void mostrarCuadrados(List<Integer> listado){
        if (!hayElementos(listado)) {
            return;
        }

        System.out.print("Los numeros al cuadrado son : ");
        for(int i = 0; i < listado.size(); i++){
            int producto = listado.get(i) * listado.get(i);
            System.out.print(producto + " ");
        }
    }

    public static void mostrarSumatoria(List<Integer> listado){
        if (!hayElementos(listado)) {
            return;
        }

        int suma = 0;
        for(int i = 0; i < listado.size(); i++){
            suma += listado.get(i);
        }
        System.out.print("La sumatoria de los numeros es: " + suma);
    }

    public static void buscarElemento(List<Integer> listado){
        if (!hayElementos(listado)) {
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el numero a buscar: ");
        int num = sc.nextInt();
        boolean encontrado = false;

        for(int i = 0; i < listado.size(); i++){
            if(num == listado.get(i)){
                encontrado = true;
                System.out.print("Numero encontrado en el indice "+ i);
            }
        }

        if(!encontrado)
            System.out.print("Numero no encontrado");
    }

    public static void buscarElementoMayor(List<Integer> listado){
        if (!hayElementos(listado)) {
            return;
        }

        int valorMayor = listado.get(0);
        for(int i = 0; i < listado.size(); i++){
            if(valorMayor < listado.get(i)){
                valorMayor = listado.get(i);
            }
        }
        System.out.print("El valor mayor es: " + valorMayor);

    }
 }