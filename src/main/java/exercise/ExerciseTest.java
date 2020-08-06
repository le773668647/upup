package exercise;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author liangze
 * @create 2020-07-25 下午12:06
 */
public class ExerciseTest {
    private static final Logger logger = LoggerFactory.getLogger(ExerciseTest.class);

    public static void main(String[] args) {
//        List<Person> personList = new ArrayList<>();
//        personList.add(new Person("a",12));
//        personList.add(new Person("b",13));
//        Map<String,Person> map =personList.stream().collect(Collectors.toMap(Person::getName, Function.identity()));
//        System.out.println(map);
        System.out.println(Arrays.asList("a".split("@"))
                .parallelStream()
                .collect(Collectors.toList()));
        String a = "   a  b ";
        System.out.println(a.trim());
        System.out.println(StringUtils.isBlank(a));
        int c = 1;
        logger.info(""+c);
        String s = "a";
        String [] array = s.split("@");
        System.out.println(array[1]);
        String [] f = {"A","B","C"};
        System.out.println(new Random().nextInt(f.length));

    }
}
