package example.demo.stream;

import example.demo.model.Gender;
import example.demo.model.Person;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExampleMain {
    public static void main(String[] args) {
        predicateImp();
        System.out.println("<===================1================>");
        Predicate<Integer> tPredicate1 = number -> number > 10;
        System.out.println(tPredicate1.test(8));

        System.out.println("<===================2================>");
        customClassPredicate();

        System.out.println("<===================3================>");
        IntPredicate intPredicate1 = number -> number > 5;
        System.out.println(intPredicate1.test(10));
        System.out.println(intPredicate1.test(2));
    }

    private static void customClassPredicate() {
        List<Person> personList = Person.populateList();
        Predicate<Person> tPredicate3 = person -> person.getAge() > 30;
        Predicate<Person> tPredicate4 = person -> person.getGender().equals(Gender.FEMALE);
        List<Person> collect = personList.stream()
                .filter(tPredicate3.negate().and(tPredicate4.negate()))
                .collect(Collectors.toList());
        collect.forEach(p -> System.out.println(p.toString()));
    }

    private static void predicateImp() {
        PredicateImplementation predicateImplementation = new PredicateImplementation();
        System.out.println(predicateImplementation.test(10));
        System.out.println(predicateImplementation.test(4));
    }
}

class PredicateImplementation implements Predicate {

    @Override
    public boolean test(Object number) {
        Integer value = (Integer) number;
        if (value % 5 == 0) {
            return true;
        }
        return false;
    }
}

