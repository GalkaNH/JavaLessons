package homeworks.hw_17_01;

public class Main {
    public static void main(String[] args) {

        Group group1 = new Group(GroupName.IT, 10);
        Group group2 = new Group(GroupName.BIOTECH, 10);
        Group group3 = new Group(GroupName.CHEMISTRY, 10);
        Group group4 = new Group(GroupName.EDUCATION, 10);
        Group group5 = new Group(GroupName.HISTORY, 10);
        Group group6 = new Group(GroupName.MATHEMATICS, 10);
        Group group7 = new Group(GroupName.PFILOSOPHY, 10);
        Group group8 = new Group(GroupName.PSYCHOLOGY, 10);
        Group group9 = new Group(GroupName.NANOENGINEERING, 10);
        Group group10 = new Group(GroupName.PHYSICS, 10);


        University uni1 = new University(UniversityName.MIT, 10, 1-1-1950);
        University uni2 = new University(UniversityName.COLUMBIA, 10, 01-01-1960);
        University uni3 = new University(UniversityName.CAMBRIDGE, 8, 01-01-1970);
        University uni4 = new University(UniversityName.HARVARD, 9, 01-01-1980);
        University uni5 = new University(UniversityName.OXFORD, 7, 01-01-1940);
        University uni6 = new University(UniversityName.OXFORD, 10, 01-01-1930);


        Student st1 = new Student("Dan", "Danilewski", 25, Gender.MALE, group1, uni1);
        Student st2 = new Student("Ben", "Ladan", 28, Gender.MALE, group1, uni1);
        Student st3 = new Student("Anna", "Maria", 20, Gender.FEMALE, group2, uni1);


        Student st4 = new Student("Bob", "Marowiecki", 25, Gender.MALE, group2, uni4);
        Student st5 = new Student("Natalia", "Kon", 28, Gender.FEMALE, group2, uni4);
        Student st6 = new Student("Anna", "Markowa", 20, Gender.FEMALE, group6, uni4);
        Student st7 = new Student("Robert", "Iwaniuk", 23, Gender.MALE, group3, uni4);


//        System.out.printf("%s%n", st1);
//        System.out.printf("%s%n", st2);
//        System.out.printf("%s%n", st3);
//        System.out.printf("%s%n", st4);

        StudentService service = new StudentService();

        boolean isEqualGroup = service.compareGroups(st1, st3);


        StudentService service1 = new StudentService();

        boolean isEqualUniversity = service1.compareUniversities(st1, st2);

        StudentService service2 = new StudentService();

        boolean isEqualStudent = service2.compareLastNames(st1, st2);

        System.out.println(isEqualGroup);
        System.out.println(isEqualUniversity);
        System.out.println(isEqualStudent);
    }
}
