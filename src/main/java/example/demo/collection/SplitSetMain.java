package example.demo.collection;

import java.util.*;

public class SplitSetMain {

    public static void main(String[] args) {
        List<Integer> a1= new ArrayList<>();
        Set<String> set = new HashSet<>(Arrays.asList("a", "b", "c", "d", "e"));
        Optional<List<Set<String>>> split = split(set, 2);
        split.ifPresent(sets -> sets.stream().forEach(System.out::println));


        System.out.println("-------------------");
        set = new HashSet<>(Arrays.asList("a"));
        split = split(set, 2);
        split.ifPresent(sets -> sets.stream().forEach(System.out::println));
        System.out.println("-------------------");
        split = split(null, 2);
        split.ifPresent(sets -> sets.stream().forEach(System.out::println));
        System.out.println("-------------------");
        split = split(new HashSet<>(), 2);
        split.ifPresent(sets -> sets.stream().forEach(System.out::println));
        System.out.println("-------------------");
        split = split(new HashSet<>(), 0);
        split.ifPresent(sets -> sets.stream().forEach(System.out::println));
    }

    public static Optional<List<Set<String>>> split(Set<String> original, int subsetSize) {
        if (original == null || original.isEmpty() || subsetSize <= 0) {
            return Optional.empty();
        }

        int subsetCount = (int) (Math.ceil((double) original.size() / subsetSize));
        List<Set<String>> subsets = new ArrayList<>(subsetCount);
        Iterator<String> iterator = original.iterator();

        for (int i = 0; i < subsetCount; i++) {
            Set<String> subset = new LinkedHashSet<String>(subsetSize);
            for (int j = 0; j < subsetSize && iterator.hasNext(); j++) {
                subset.add(iterator.next());
            }
            subsets.add(subset);
        }
        return Optional.ofNullable(subsets);
    }
}
