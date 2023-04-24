import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Zad1
        Example exLambda = (a, b) -> a*a*b;
        System.out.println(exLambda.Func(2, 3));
        System.out.println();

        // Przykładowa lista liczb
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i * i);
        }

        // Zad2
        list
            .stream()
            .filter(number -> number % 2 == 0)
            .forEach(System.out::println);
        System.out.println();

        // Zad3
        list
            .stream()
            .filter(number -> number % 2 == 0)
            .filter(number -> number.equals(Collections.min(list)))
            .forEach(System.out::println);
        System.out.println();

        // Zad4
        // Zakres od a do b
        int a = 100;
        int b = 200;
        list
            .stream()
            .filter(number -> number >= a)
            .filter(number -> number <= b)
            .forEach(System.out::println);
        System.out.println();

        // Przykładowa lista osób
        ArrayList<Osoba> lista_osob = new ArrayList<>();
        lista_osob.add(new Osoba("Jan","Kowalski", 1950, Osoba.Plec.M));
        lista_osob.add(new Osoba("Janina","Kowalska", 1951, Osoba.Plec.K));
        lista_osob.add(new Osoba("Anna","Nowak", 2000, Osoba.Plec.K));
        lista_osob.add(new Osoba("Zofia","Kowalska", 2004, Osoba.Plec.K));

        // Zad5
        lista_osob
            .stream()
            .filter(o -> o.getRok() > 1975)
            .map(o -> o.getImie() + " " + o.getNazwisko())
            .forEach(System.out::println);
        System.out.println();

        // Zad6
        lista_osob
            .stream()
            .filter(o -> o.getImie().substring(0, 2).equals("Ja"))
            .sorted(Comparator.comparing(Osoba::getNazwisko))
            .map(o -> o.getImie() + " " + o.getNazwisko())
            .forEach(System.out::println);
        System.out.println();

        // Zad7
        System.out.println(
            lista_osob
                .stream()
                .filter(o -> o.getImie().substring(0, 2).equals("Ja"))
                .count());
        System.out.println();

        // Zad9
        lista_osob
            .stream()
            .sorted((o1, o2)-> - (o1.getNazwisko() + " " + o1.getImie()).compareTo((o2.getNazwisko() + " " + o2.getImie())))
            .map(o -> o.getImie() + " " + o.getNazwisko())
            .forEach(System.out::println);
        System.out.println();
    }
}