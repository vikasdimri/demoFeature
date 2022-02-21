package example.demo.optional;

import example.demo.model.Gender;
import example.demo.model.Person;
import example.demo.model.Place;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalDemo {


    public static void main(String[] args) {
        Optional<List<Person>> personList = populateList();
        System.out.println("<-----------------1----------------------->");

        System.out.println(Optional.ofNullable(null).orElse("Dimri"));
        System.out.println(Optional.ofNullable("Vikas").orElse("Dimri"));
        System.out.println("<-----------------2----------------------->");

        if (personList.isPresent()) {
            System.out.println(personList.get());
        }
        System.out.println("<-----------------3----------------------->");
        personList.ifPresent(people -> people.stream()
                .forEach(person -> System.out.println(person.getFirstName())));
        Optional<List<Person>> personList1 = Optional.ofNullable(null);
        personList1.ifPresent(persons -> persons.stream()
                .forEach(person -> System.out.println(person.getFirstName())));
        System.out.println("Empty list orElse :: " + personList1.orElse(Collections.emptyList()));
        System.out.println("Empty list orElseGet :: " + personList1.orElseGet(() -> Collections.emptyList()));

        System.out.println("<-----------------4----------------------->");
        Optional<List<String>> firstNameList = personList.map(
                people -> people.stream()
                        .map(Person::getFirstName)
                        .collect(Collectors.toList()));
        firstNameList.ifPresent(firstName-> System.out.println(firstName));

        System.out.println("<-----------------4----------------------->");

    }


    private static Optional<List<Person>> populateList() {
        List<Person> personList = new ArrayList<>();
        List<Place> listOfVisitedPlace = getListOfVisitedPlace();
        personList.add(createPerson("Sumit", "Verma", 37, Gender.MALE, 10000, getListOfVisitedPlace()));
        personList.add(createPerson("Amit", "Kuksal", 40, Gender.MALE, 20000, getListOfVisitedPlace()));
        personList.add(createPerson("Vijay", "Panwar", 46, Gender.MALE, 25000, getListOfVisitedPlace()));
        personList.add(createPerson("Deepmala", "Rajput", 34, Gender.FEMALE, 15000, getListOfVisitedPlace()));
        personList.add(createPerson("Evi", "Dimri", 3, Gender.FEMALE, 1000, getListOfVisitedPlace()));
        personList.add(createPerson("Atharv", "Dimri", 7, Gender.MALE, 30000, getListOfVisitedPlace()));
        return Optional.of(personList);
    }

    private static List<Place> getListOfVisitedPlace() {
        List<Place> listOfVisitedPlace = new ArrayList<Place>();
        listOfVisitedPlace.add(createPlace("Srinagar", "Uttrakhand", "India"));
        listOfVisitedPlace.add(createPlace("Dehradun", "Uttrakhand", "India"));
        listOfVisitedPlace.add(createPlace("New Delhi", "Delhi", "India"));
        listOfVisitedPlace.add(createPlace("Jaipur", "Rajasthan", "India"));
        listOfVisitedPlace.add(createPlace("Udaipur", "Rajasthan", "India"));
        listOfVisitedPlace.add(createPlace("Chandigarh", "UT", "India"));
        listOfVisitedPlace.add(createPlace("Mumbai", "Maharashtra", "India"));
        listOfVisitedPlace.add(createPlace("Pune", "Maharashtra", "India"));
        return listOfVisitedPlace;
    }

    private static Place createPlace(String city,
                                     String state,
                                     String country) {
        return Place.builder()
                .city(city)
                .state(state)
                .country(country)
                .build();
    }

    private static Person createPerson(String firstName,
                                       String lastName,
                                       Integer age,
                                       Gender gender,
                                       Integer salary,
                                       List<Place> listOfVisitedPlace) {
        return Person.builder()
                .firstName(firstName)
                .lastName(lastName)
                .age(age)
                .gender(gender)
                .salary(salary)
                .listOfVisitedPlace(listOfVisitedPlace)
                .build();
    }
}
