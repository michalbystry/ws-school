package school.model;

/**
 * Created by michal on 24.05.15.
 */
public class Student {
    String name;
    String surname;

    public Student() {
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getSurname();
    }

       public boolean eguals(Object o) {
        if (o instanceof Student && ((Student) o) != null) {
            if (
                    this.getName().equalsIgnoreCase(((Student) o).getName()) &&
                            this.getSurname().equalsIgnoreCase(((Student) o).getSurname())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public int hashCode(){
        return (name+surname).hashCode();
    }
}
