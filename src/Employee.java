import java.util.Objects;

/**
 * @Author xiaobai
 * @Date 2020/12/29 17:23
 * @Version 1.0
 */
public class Employee {
    private String name;
    private Integer number;

    public Employee(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return name.equals(employee.name) && number.equals(employee.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
