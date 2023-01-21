package lessons.learn_class;

public class PassParameters {

    public static void main(String[] args) {
        final int a = 10;

//        a = 15;

        final byte[] array = new byte[10];
//        array = new byte[15];


        passInt(a);

//        System.out.println(a);

        ForPass forPass = new ForPass();

        forPass.count = 15;

        passObject(forPass);

//        System.out.println(forPass.count);

        String str = "Hello";

        passString(str);

        System.out.println(str);
    }

    public static void passInt(int a) {
        a = 15;
    }

    public static void passObject(ForPass pass) {
        pass.count = 20;
    }

    public static void passString(String str) {
        str = "World";
    }
}

class ForPass {
    int count;
}
