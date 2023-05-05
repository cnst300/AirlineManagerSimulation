import java.time.LocalDate;

abstract class Employee {
    private String name;
    private LocalDate birthDate;
    private Type type;

    public Employee(String name, Type type) {
        this.name = name;
        this.type = type;
        this.birthDate = LocalDate.now();
    }


    public Type getType() {
        return type;
    }
}
