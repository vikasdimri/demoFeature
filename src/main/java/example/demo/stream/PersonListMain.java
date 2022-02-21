package example.demo.stream;

import example.demo.model.Gender;
import example.demo.model.Person;
import example.demo.model.Place;

import java.util.*;
import java.util.stream.Collectors;

public class PersonListMain {
    public static void main(String[] args) {
        List<Person> personList = Person.populateList();

        List<Person> personList1 = personList.stream()
                .filter(p -> p.getAge() > 10)
                .collect(Collectors.toList());
        personList1.forEach(System.out::println);
        System.out.println("<-----------------1----------------------->");

        Optional<Person> personList2 = personList.stream()
                .filter(p -> p.getAge() > 35)
                .findFirst();
        System.out.println(personList2.toString());
        System.out.println("<-------------------2--------------------->");

        Optional<Person> personList3 = personList.stream()
                .filter(p -> p.getGender().equals(Gender.FEMALE))
                .findAny();
        System.out.println(personList3);
        System.out.println("<------------------3---------------------->");

        List<Integer> personList4 = personList.stream()
                .map(Person::getAge)
                .collect(Collectors.toList());
        personList4.forEach(System.out::println);
        System.out.println("<------------------4---------------------->");

        List<Integer> personList5 = personList.stream()
                .map(Person::getAge)
                .filter(p -> p > 30)
                .collect(Collectors.toList());
        personList5.forEach(System.out::println);
        System.out.println("<-----------------5----------------------->");

        Integer personList6 = personList.stream()
                .filter(p -> p.getGender().equals(Gender.FEMALE))
                .map(Person::getAge).filter(a -> a > 30)
                .findFirst()
                .orElse(null);
        System.out.println("Age :: " + personList6);
        System.out.println("<----------------6------------------------>");

        Person[] personList7 = personList.stream()
                .toArray(Person[]::new);
        Arrays.stream(personList7).forEach(System.out::println);
        System.out.println("<-----------------7----------------------->");

        List<List<Person>> array = Arrays.asList(Arrays.asList(personList7));
        List<Person> personList8 = array.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        personList8.forEach(System.out::println);
        System.out.println("<-----------------8----------------------->");

        List<Person> personList9 = personList.stream()
                .peek(p -> p.setSalary(p.getSalary() * 2))
                .filter(p -> p.getSalary() > 20000)
                .collect(Collectors.toList());
        personList9.forEach(System.out::println);
        System.out.println("<-----------------9----------------------->");

        personList.stream().forEach(e -> {
            e.setSalary(e.getSalary() * 2);
        });
        personList.forEach(System.out::println);
        System.out.println("<-----------------10----------------------->");

        long count = personList.stream()
                .filter(e -> e.getGender().equals(Gender.FEMALE))
                .count();
        System.out.println(count);
        System.out.println("<-----------------11----------------------->");

        List<Person> personList10 = personList.stream()
                .skip(3)
                .limit(2)
                .collect(Collectors.toList());
        personList10.forEach(System.out::println);
        System.out.println("<-----------------12----------------------->");

        List<Person> personList11 = personList.stream()
                .sorted((e1, e2) -> e1.getSalary().compareTo(e2.getSalary()))
                .collect(Collectors.toList());
        personList11.forEach(System.out::println);
        System.out.println("<-----------------13----------------------->");

        List<Person> personList12 = personList.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
        personList12.forEach(System.out::println);
        System.out.println("<-----------------14----------------------->");

        Person person1 = personList.stream()
                .min((p1, p2) -> p1.getSalary() - p2.getSalary())
                .orElseThrow(RuntimeException::new);
        System.out.println(person1);
        System.out.println("<-----------------15----------------------->");

        Person person2 = personList.stream()
                .min(Comparator.comparing(Person::getSalary))
                .orElseThrow(RuntimeException::new);
        System.out.println(person2);
        System.out.println("<-----------------16----------------------->");

        Person person3 = personList.stream()
                .max((p1, p2) -> p1.getSalary() - p2.getSalary())
                .orElseThrow(RuntimeException::new);
        System.out.println(person3);
        System.out.println("<-----------------17----------------------->");

        Person person4 = personList.stream()
                .max(Comparator.comparing(Person::getSalary))
                .orElseThrow(RuntimeException::new);
        System.out.println(person4);
        System.out.println("<-----------------18----------------------->");

        List<Integer> distinctSalary = personList.stream()
                .map(Person::getSalary)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        distinctSalary.forEach(System.out::println);
        System.out.println("<-----------------19----------------------->");

        boolean allMatch = personList.stream()
                .filter(p -> p.getAge() > 35)
                .allMatch(p -> p.getGender().equals(Gender.MALE));
        System.out.println(allMatch);
        System.out.println("<-----------------20----------------------->");

        boolean anyMatch = personList.stream()
                .filter(p -> p.getGender().equals(Gender.MALE))
                .anyMatch(p -> p.getAge() > 30);
        System.out.println(anyMatch);
        System.out.println("<-----------------21----------------------->");

        boolean noneMatch = personList.stream()
                .filter(p -> p.getGender().equals(Gender.FEMALE))
                .noneMatch(p -> p.getAge() > 35);
        System.out.println(noneMatch);
        System.out.println("<-----------------22----------------------->");

        int maxSalary = personList.stream()
                .mapToInt(Person::getSalary)
                .max()
                .orElseThrow(NoSuchElementException::new);

        System.out.println(maxSalary);
        System.out.println("<-----------------23----------------------->");

        double averageSalary = personList.stream()
                .mapToInt(Person::getSalary)
                .average()
                .orElseThrow(NoSuchElementException::new);
        System.out.println(averageSalary);
        System.out.println("<-----------------24----------------------->");

        String firstNames = personList.stream()
                .map(Person::getFirstName)
                .collect(Collectors.joining(", "));
        System.out.println(firstNames);
        System.out.println("<-----------------25----------------------->");

        Set<Gender> genderSet = personList.stream()
                .map(Person::getGender)
                .collect(Collectors.toSet());
        genderSet.forEach(System.out::println);
        System.out.println("<-----------------26----------------------->");

        Vector<List<Place>> vector = personList.stream()
                .map(Person::getListOfVisitedPlace)
                .peek(System.out::println)
                .collect(Collectors.toCollection(Vector::new));
        System.out.println("<-----------------27----------------------->");

        List<Place> placeList = vector.stream()
                .flatMap(Collection::stream)
                .distinct()
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println("<-----------------28----------------------->");

        DoubleSummaryStatistics doubleSummaryStatistics = personList.stream()
                .collect(Collectors.summarizingDouble(Person::getSalary));
        System.out.println("Max :: " + doubleSummaryStatistics.getMax());
        System.out.println("Average :: " + doubleSummaryStatistics.getAverage());
        System.out.println("Sum :: " + doubleSummaryStatistics.getSum());
        System.out.println("Count :: " + doubleSummaryStatistics.getCount());
        System.out.println("Min :: " + doubleSummaryStatistics.getMin());
        System.out.println("<-----------------29----------------------->");

        Map<Boolean, List<Person>> booleanListMap = personList.stream()
                .collect(Collectors.partitioningBy(p -> p.getGender().equals(Gender.MALE)));
        System.out.println(booleanListMap.get(true));
        System.out.println(booleanListMap.get(false));
        System.out.println("<-----------------30----------------------->");

        Map<Gender, List<Person>> genderListMap = personList.stream()
                .collect(Collectors.groupingBy(Person::getGender));
        System.out.println(genderListMap.get(Gender.MALE));
        System.out.println(genderListMap.get(Gender.FEMALE));
        System.out.println("<-----------------31----------------------->");

        Map<String, List<String>> stringListMap = personList.stream()
                .collect(Collectors.groupingBy(Person::getLastName,
                        Collectors.mapping(Person::getFirstName, Collectors.toList())));
        System.out.println(stringListMap);
        System.out.println("<-----------------32----------------------->");
    }

}
