package stream;

/**
 * @author liangze
 * @create 2020-07-30 下午5:32
 */
public class Test {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Test(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
