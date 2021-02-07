package Collection;

import java.util.Objects;

/**
 * @Author xiaobai
 * @Date 2021/2/7 20:41
 * @Version 1.0
 */
public class Person implements Comparable<Person>{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        int n1 = this.getName().compareTo(o.getName());
        int n2 = this.getAge() - o.getAge();
        return n1 == 0 ? n2 : n1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
