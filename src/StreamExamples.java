import java.util.*;
import java.util.Collection;
import java.lang.*;
import java.io.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class StreamExamples {
        public static void main(String[] args) {
            System.out.println("practica usando stream()");

            List<String> items = new ArrayList<String>();

            items.add("hola");
            items.add("adios");
            System.out.println(items);

            items.stream().forEach(e -> System.out.println(e));


            Stream<Integer> numeros = Stream.of(1,2,3);
            numeros.forEach(e -> System.out.println(e));

            Stream<String> cadenas = Stream.of("Hi", "Good bye");
            cadenas.forEach(e->  System.out.println(e));

            List<Person> persons = new ArrayList<>();
            persons.add(new Person("Meybis", 39));
            persons.add(new Person("Ismael", 48));
            persons.add(new Person("Luis", 14));
            persons.add(new Person("Marcos", 8));
            persons.add(new Person("Lucas", 1));

            persons.stream().forEach(e -> System.out.println(e.getName()));
            System.out.println("menores de  15 años");
            persons.stream()
                    .filter(e -> e.getAge() < 15)
                    .forEach(e -> System.out.println(e.getName()));

            System.out.println("Promedio de edad de la familia");
            double ageAverage = persons.stream()
                    .mapToInt(e -> e.getAge())
                    .average()
                    .getAsDouble();
            System.out.println(ageAverage);

            System.out.println("cantidad de miembros");
            long quantity = persons.stream()
                    .count();

            System.out.println(quantity);

            System.out.println("cantidad de miembros menores de edad");
            long kids = persons.stream()
                    .filter(e -> e.getAge() < 18)
                    .count();
            System.out.println(kids);

            System.out.println("Ordenando por nombre");
            persons.stream().sorted(Comparator.comparing(Person::getName))
                    .forEach(e->  System.out.println(e.getName()));


            System.out.println("Ordenando por edad de mayor a menor");
            persons.stream().sorted(Comparator.comparing(Person::getAge).reversed())
                    .forEach(e->  System.out.println(e.getName()));

            System.out.println("Obteniendo la lista de personas adultas");
            List<Person> adults = persons.stream()
                    .filter(e -> e.getAge() > 17)
                    .collect(Collectors.toList());

            //mostrando valores  de  una  lista con iterador

            Iterator<Person> iter = adults.iterator();
            while(iter.hasNext())
            {
                Person adulto = iter.next();
                System.out.println("imprimiendo nombre de adultos");
                System.out.println(adulto.getName());
            }


            //otra forma de iterar
            for(Person adulto : adults){
                System.out.println("**imprimiendo nombre de adultos otra forma de iterar**");
                System.out.println(adulto.getName());
            }

            System.out.println("Obteniendo un elemento, persona con edad igual  a 14");

            Person tiene14 = persons.stream()
                    .filter(e -> e.getAge() == 14)
                    .findFirst()
                    .get();

            System.out.println(tiene14.getName());









        }
    }


final class Person{
    private String name;
    private int age;

    public Person(){}
    public Person(String name,int age){
        this.name =  name;
        this.age = age;
    }

    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setAge(int age){this.age = age;}
    public int getAge(){return age;}
}
