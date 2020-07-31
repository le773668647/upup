package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author liangze
 * @create 2020-07-25 下午12:06
 */
public class ExerciseTest {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("a",12));
        personList.add(new Person("b",13));
        Map<String,Person> map =personList.stream().collect(Collectors.toMap(Person::getName, Function.identity()));
        System.out.println(map);
        System.out.println(Arrays.asList(",".split(","))
                .parallelStream()
                .map(a -> Long.parseLong(a.toString()))
                .collect(Collectors.toList()).size());
    }
}
