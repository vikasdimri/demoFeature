package example.demo.model;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class Person {
    String firstName;
    String lastName;
    Integer age;
    Gender gender;
    Integer salary;
    List<Place> listOfVisitedPlace;


    public static List<Person> populateList() {
        List<Person> personList = new ArrayList<>();
        List<Place> listOfVisitedPlace = populateListOfVisitedPlace();
        personList.add(createPerson("Sumit", "Verma", 37, Gender.MALE, 10000, populateListOfVisitedPlace()));
        personList.add(createPerson("Amit", "Kuksal", 40, Gender.MALE, 20000, populateListOfVisitedPlace()));
        personList.add(createPerson("Vijay", "Panwar", 46, Gender.MALE, 25000, populateListOfVisitedPlace()));
        personList.add(createPerson("Deepmala", "Rajput", 34, Gender.FEMALE, 15000, populateListOfVisitedPlace()));
        personList.add(createPerson("Evi", "Dimri", 3, Gender.FEMALE, 1000, populateListOfVisitedPlace()));
        personList.add(createPerson("Atharv", "Dimri", 7, Gender.MALE, 30000, populateListOfVisitedPlace()));
        return personList;
    }

    private static List<Place> populateListOfVisitedPlace() {
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
