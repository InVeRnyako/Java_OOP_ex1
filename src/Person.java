// import java.sql.Date;
// import java.util.Objects;

public class Person {
    private Integer id;
    private String fullName;
    // private Date BirthDate;
    // private Date DeathDate;

    public Person(Integer id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getId() {
        return id;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (o instanceof Integer){
            return o == id;
        }
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return person.id.equals(id);
    }

    
    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return fullName;
    }

    // (TODO) Объявление класса, варианты вывода (для программы и для вывода)
}
