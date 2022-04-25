package expo.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(1);
    list.add(-1);
    list.add(0);

    List<String> listString = new ArrayList<>();
    listString.add("Piedra");
    listString.add("Papel");
    listString.add("Tijera");
    listString.add("Pisapapeles");
    listString.add("Tijera");
    listString.add("Escritorio");

    // filter
//    list.stream().filter(x -> x < 3).forEach(System.out::println);
//    listString.stream().filter(x -> x.equals("Tijera")).forEach(System.out::println);

    // map
//    listString.stream().map(String::toUpperCase).forEach(System.out::println);

    // sorted
//    Arrays.asList(10, 23, -4, 0, 18).stream().sorted().forEach(System.out::println);

    // foreach
//    list.stream().forEach(System.out::println);

    // collect
//    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//    List<Integer> evenNumbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//    System.out.println(evenNumbers);

    // count
//    long positiveNumbers = Arrays.asList(10, 23, -4, 0, 18).stream().filter(x -> x > 0).count();
//    System.out.println(positiveNumbers);

    // anyMatch
//    boolean match = Stream.of("one", "two", "three", "four").anyMatch(s -> s.contains("three"));
//    System.out.println(match);

    // find First
//    Optional<String> first = Stream.of("one", "two", "three", "four").findFirst();
//    System.out.println(first.get());

    // findAny
//    Optional<String> any = Stream.of("car", "plane", "ship", "bicycle").findAny();
//    System.out.println(any.get());

    // Array
//    String[] nombres = new String[3];
//    nombres[0] = "Juan";
//    nombres[1] = "Diana";
//    nombres[2] = "Ramon";
//    Arrays.stream(nombres).map(String::toUpperCase).forEach(System.out::println);

    // MAP
//    Map<String, String> map = new HashMap<>();
//    map.put("Juan", "Abogado");
//    map.put("Diana", "Secretaria");
//    map.put("Ramon", "Fiscal");
//    map.keySet().stream().map(String::toLowerCase).forEach(System.out::println);
//    map.values().stream().map(String::toUpperCase).forEach(System.out::println);


//    Acceso a los elementos de un array usando indices
//    List nombres = Arrays.asList("Jose","Pedro","Diana","Maria","Samuel","Kiara");

//    Con un ciclo for:
//    for (int i = 0; i< nombres.size(); i++){
//      if (i % 2 == 0){
//        System.out.println(nombres.get(i));
//      }
//    }

//    Con un stream
//    Arrays.asList(0,1,2,3,4,5).stream()
//        .filter(i -> i % 2 == 0)
//        .map(i -> nombres.get(i))
//        .forEach(System.out::println);


//    IntStream.range(0, nombres.size())
//        .filter(i -> i % 2 == 0)
//        .mapToObj(i -> nombres.get(i))
//        .forEach(System.out::println);

  }
}
