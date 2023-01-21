package lessons.learn_class;

public class Human {
    private int age;
    private int weight;
    private int height;

    public Human(int newAge, int newWeight) {
        age = newAge;
        weight = newWeight;
    }

    public Human(int age, int weight, int height) {
        this(age, weight);
        this.height = height;
    }

    //access_modifier void(or return type) name(params or absent){body}

    public void setAge(int newAge) {
        age = newAge;
    }

}

class TestHuman {
    public static void main(String[] args) {

        int a = 10;

        a = 15;

        //datatype name_reference = new datatype(incoming parameters or absent)

        Human john = new Human(-20, 160);
//        john = new Human(21, 160);

        /*john.age = -20;
        john.weight = 160;*/

        Human ben = new Human(25, 180);

       /* ben.age = 25;
        ben.weight = 180;*/
    }
}
