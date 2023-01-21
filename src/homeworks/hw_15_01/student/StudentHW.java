package homeworks.hw_15_01.student;

public class StudentHW {
    private String name;
    private int numberOfYears;
    private int age;
    private int grantAmount;

    StudentHW(String name, int age, int numberOfYears, int grantAmount) {
        this.setName(name);
        this.age = age;
        this.numberOfYears = numberOfYears;
        this.grantAmount = grantAmount;
    }


    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int getGrantAmount() {
        return grantAmount;
    }

    public void setGrantAmount(int grantAmount) {
        this.grantAmount = grantAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 10) {
            this.name = name.substring(0, 10);
        } else {
            this.name = name;
        }
    }

    public void showInfo() {
        System.out.println("Age = " + age + "Grant Amount = " + grantAmount);
    }
}
