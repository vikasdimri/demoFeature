package example.demo.stream;

import example.demo.model.Person;

import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    /*public static void main(String[] args) {
        biPredicateImpl();
        System.out.println("<===================1================>");

        List<Person> personList = Person.populateList();
        BiPredicate<Person,Person> biPredicate1=
                (person1,person2)->person1.getAge()>person2.getAge()
                        && person1.getGender().equals(person2.getGender());
        System.out.println(biPredicate1.test(personList.get(0),personList.get(1)));
        System.out.println("<===================2================>");


    }

    private static void biPredicateImpl() {
        BiPredicate<Integer,Integer> biPredicate = new BiPredicateImplementation();
        System.out.println(biPredicate.test(10,15));
        System.out.println(biPredicate.test(10,5));
    }
}

class BiPredicateImplementation implements BiPredicate {

    @Override
    public boolean test(Object o1, Object o2) {
        Integer number1= (Integer) o1;
        Integer number2= (Integer) o2;

        if(number1<number2){
            return true;
        }
        return false;
    }*/
}
