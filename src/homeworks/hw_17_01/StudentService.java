package homeworks.hw_17_01;

public class StudentService {

    public boolean compareGroups(Student student1, Student student2) {
        String name1 = String.valueOf(student1.getGroup().getName());
        String name2 = String.valueOf(student2.getGroup().getName());

        return name1.equals(name2);
    }

    public boolean compareUniversities(Student student1, Student student2) {
        String name1 = String.valueOf(student1.getNameUniversity().getNameUniversity());
        String name2 = String.valueOf(student2.getNameUniversity().getNameUniversity());

        return name1.equals(name2);
    }

    public boolean compareLastNames(Student student1, Student student2) {
        String name1 = String.valueOf(student1.getLastName());
        String name2 = String.valueOf(student2.getLastName());


        return name1.equals(name2);
    }
}
