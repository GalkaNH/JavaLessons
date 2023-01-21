package homeworks.hw_17_01;

public class Student {
    private String firstName;
    private String lastName;

    private int age;

    private Gender gender;
    private Group nameGroup;
    private University uniName;

    public Student(String firstName, String lastName, int age, Gender gender,
                   Group nameGroup, University uniName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.nameGroup = nameGroup;
        this.uniName = uniName;

    }

    public Group getGroup() {
        return nameGroup;
    }

    public University getNameUniversity() {
        return uniName;
    }

    public String getLastName() {return lastName;}



    public String toString() {
        return String.format("%s, %s, %s, %s, %s, %s", firstName, lastName, age, gender, nameGroup, uniName);
    }



}
