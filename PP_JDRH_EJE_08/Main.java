import java.util.ArrayList;
import java.util.List;

public class Main {

    /*Un Stream en Java es como una cinta transportadora de fábrica: en lugar de procesar los elementos 
    de una lista uno por uno usando un bucle for tradicional, la lista envía sus elementos en flujo constante 
    a través de una serie de operaciones (filtrar, sumar, buscar el mayor, etc.).
    No guarda datos por sí mismo ni modifica la lista original; solo los toma, los procesa en secuencia y 
    produce un resultado.*/

    public static void main(String[] args){

        List<Integer> numeros;
        numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(7);
        numeros.add(30);
        numeros.add(20);
        numeros.add(1);
        numeros.add(-7);
        numeros.add(67);
        numeros.add(0);
        numeros.add(80);

        List<String> nombres;
        nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Alejandro");
        nombres.add("Beatriz");
        nombres.add("Sofia");
        nombres.add("Alberto");

        //1. Sumar elementos
        Integer sumaNumeros = numeros.stream()
            .reduce(0, (suma,n)->{//(suma,n) es lambda o "función anónima" y reduce() es temrinal (para que termine las operaciones)
                return suma + n;
            });
        System.out.println("Sumatoria: "+ sumaNumeros);

        //2. Obtener el máximo
        Integer numeroMayor = numeros.stream()
            .max((n1,n2)->{//max() es lambda (función anónima) y optional
                return n1.compareTo(n2);//-1, 0, 1
            })
            .orElse(0);//orElse() sirve para cuando la lista no tiene elementos para comparar
        System.out.println("Mayor valor: "+ numeroMayor);

        //3. Obtener el mínimo
        Integer numeroMenor = numeros.stream()
            .min((n1,n2)->{//min() es lambda (función anónima) y optional
                return n1.compareTo(n2);
            })
            .orElse(0);//terminal
        System.out.println("Menor valor: "+ numeroMenor);

        //4. Contar elementos
        Long totalNumeros = numeros.stream()
            .count();//terminal
        System.out.println("Total de elementos: "+ totalNumeros);

        //5. Números pares
        List<Integer> numerosPares = numeros.stream()
            .filter((n)->{//filter() es un predicate
                return n % 2 == 0;
            })
            .toList();
        System.out.println("Pares en la lista: "+ numerosPares);

        //6. Números mayores que 50
        List<Integer> numerosMayoresA50 = numeros.stream()
            .filter((n)->{
                return n > 50;
            })
            .toList();
        System.out.println("Mayores que 50 en la lista: "+ numerosMayoresA50);

        //7.Contar números positivos
        Long totalNumerosPositivos = numeros.stream()
            .filter((n->{
                return n > 0;
            }))
            .count();
        System.out.println("Total de positivos: "+ totalNumerosPositivos);

        //8. Obtener números dentro de un rango
        List<Integer> numerosEntre10Y40 = numeros.stream()
            .filter((n)->{
                return n > 10 && 40 > n;
            })
            .toList();
        System.out.println("Mayores que 20 y menores que 40: "+ numerosEntre10Y40);

        //9. Elevar al cuadrado
        List<Integer> numerosAlCuadrado = numeros.stream()
            .map((n)->{
                return n*n;
            })
            .toList();
        System.out.println("Elevados al cuadrado: "+ numerosAlCuadrado);


        //10. Multiplicar por 10
        List<Integer> numerosPor10 = numeros.stream()
            .map((n)->{
                return n*10;
            })
            .toList();
        System.out.println("Multiplicados por 10: "+ numerosPor10);

        // 11. Convertir temperaturas
        List<Double> fahrenheit = numeros.stream()
            .map((c) -> {
                return (c * 9.0 / 5.0) + 32;
            })
            .toList();

        System.out.println("Celcius a Fahrenheit: " + fahrenheit);

        //12. Pares elevados al cuadrado
        List<Integer> paresCuadrados = numeros.stream()
            .filter((n) -> {
                return n % 2 == 0;
            })
            .map((n) -> {
                return n * n;
            })
            .toList();
        System.out.println("Pares elevados al cuadrado: " + paresCuadrados);

        //13. Suma de números pares
        Integer paresSumados = numeros.stream()
            .filter((n) -> {
                return n % 2 == 0;
            })
            .reduce(0, (suma, n) -> {
                return suma + n;
            });
        System.out.println("Sumatoria de pares: " + paresSumados);

        //14. Promedio de números mayores que 50
        Double promedioMayoresA50 = numeros.stream()
            .filter((n) -> {
                return n > 50;
            })
            .mapToInt((n) -> {
                return n;
            })
            .average()
            .orElse(0.0);
        System.out.println("Promedio de números mayores a 50: " + promedioMayoresA50);

        //15. Máximo de números pares
        Integer elementoMaxA50 = numeros.stream()
            .filter((n) -> {
                return n % 2 == 0 && n > 50;
            })
            .max((n1,n2)->{//max() es lambda (función anónima) y optional
                return n1.compareTo(n2);//-1, 0, 1
            })
            .orElse(0);//orElse() sirve para cuando la lista no tiene elementos para comparar

        System.out.println("Máximo de números mayores a 50: " + elementoMaxA50);

        //16. Ordenar de menor a mayor
        List<Integer> numOrdenadosmM = numeros.stream()
            .sorted((n1, n2) -> {
                return n1.compareTo(n2);
            })
            .toList();
        System.out.println("Ordenados de menor a mayor: " + numOrdenadosmM);

        //18. Tres números más grandes
        List<Integer> mayores3 = numeros.stream()
            .sorted((n1, n2) -> {
                return n2.compareTo(n1);
            })
            .limit(3)
            .toList();
        System.out.println("Los 3 más grandes: " + mayores3);

        //19. Filtrar nombres
        List<String> nombresConA = nombres.stream()
            .filter((nombre) -> {
                return nombre.startsWith("A");
            })
            .toList();
        System.out.println("Nombres que empiezan con 'A': " + nombresConA);

        //20. Nombre con más de 5 caracteres
        List<String> nombresCon5C = nombres.stream()
            .filter((nombre) -> {
                return nombre.length() > 5;
            })
            .toList();
        System.out.println("Nombres con más de 5 caracteres: " + nombresCon5C);

        //21. Convertir a mayúsculas
        List<String> nombresMayus = nombres.stream()
            .map((nombre) -> {
                return nombre.toUpperCase();
            })
            .toList();
        System.out.println("Nombres en mayúsculas: " + nombresMayus);

        //22. Ordenar nombres
        List<String> nombresOrdenados = nombres.stream()
            .sorted((n1, n2) -> {
                return n1.compareTo(n2);
            })
            .toList();
        System.out.println("Nombres ordenados: " + nombresOrdenados);

        //23. Buscar un número
        Integer numeroBuscado = numeros.stream()
            .filter((n) -> {
                return n == 67;
            })
            .findFirst()
            .orElse(null);//orElse() sirve para cuando la lista no tiene el elemento
        System.out.println("Número buscado: " + numeroBuscado);

        //24. Determinar si todos cumplen una condición
        boolean sonTodosMenoresA100 = numeros.stream()
        .allMatch((n) -> {
            return 100 > n;
        });
        System.out.println("Son todos menores a 100?: " + sonTodosMenoresA100);

        //25. Determinar si alguno cumple una condición
        boolean hayAlgunoMenorA0 = numeros.stream()
        .anyMatch((n) -> {
            return 0 > n;
        });
        System.out.println("hay alguno menor a 0?: " + hayAlgunoMenorA0);

    }
}