package lessons.learn_class;

public class LearnStatic {
    public static void main(String[] args) {
//        GameSoldier soldier1 = new GameSoldier(12);

//        GameSoldier.countAlive = -30;

//        GameSoldier soldier2 = new GameSoldier(56);

//        System.out.println(GameSoldier.countAlive);
        final int a = 10;

//        a = 15;
    }
}

class GameSoldier {
    private final int age;
    private float height;
    public static final int COUNT;
    private static int countAlive;

    {
        System.out.println("Non-static block initialization");
    }

    static {
        COUNT = 12;
        System.out.println("Static block initialization");
    }

    public GameSoldier(int age) {
//        COUNT = 45;
        System.out.println("Constructor");
        this.age = age;
    }

    public GameSoldier(float height) {
        this.height = height;
        age = 10;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        GameSoldier gameSoldier = new GameSoldier(58);

//        gameSoldier.age = 12;
    }

    public static int getCountAlive() {
        return countAlive;
    }

   /* public void setAge(int age) {
        this.age = age;
    }*/

    public static void setCountAlive(int countAlive) {
        GameSoldier.countAlive = countAlive;
    }
}
