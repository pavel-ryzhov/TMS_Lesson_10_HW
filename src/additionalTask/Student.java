package additionalTask;

public class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private int age;
    private double averageScore;

    public Student(String name, String surname, int age, double averageScore) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public Student() {}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", averageScore=" + averageScore +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return (this.name + this.surname).compareTo(o.name + o.surname);
    }
}
