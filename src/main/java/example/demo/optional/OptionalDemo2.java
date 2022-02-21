package example.demo.optional;

import example.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class OptionalDemo2 {

    public static void main(String[] args) {
        /*Optional<String> stringOptional = null;
        String stringOptional2 = "abc";

        System.out.println(stringOptional.orElse("null value"));*/

        StringBuilder sb = new StringBuilder("Hi there, are you there?");
        Pattern.compile("there").matcher(sb).replaceAll("niru");
        System.out.println(sb);

        Optional<List<Person>> personList = Optional.of(Person.populateList());

        List<Person> collect = personList.get().stream().filter(f -> false).collect(Collectors.toList());

        System.out.println("aaaaa    "+collect);
    }
}
