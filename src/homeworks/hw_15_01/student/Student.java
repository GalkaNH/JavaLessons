package homeworks.hw_15_01.student;

public class Student {
    public static void main(String[] args) {
        StudentHW student1 = new StudentHW("Dave", 28, 4, 100);
        StudentHW student2 = new StudentHW("Anna", 25, 2, 150);

        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getNumberOfYears());
        System.out.println(student1.getGrantAmount());

        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getNumberOfYears());
        System.out.println(student2.getGrantAmount());
    }
}
