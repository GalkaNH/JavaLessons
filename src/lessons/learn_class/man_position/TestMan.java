package lessons.learn_class.man_position;

public class TestMan {
    public static void main(String[] args) {
        Position it = new Position("IT");

        Man man1 = new Man("John", "Kennedi", 32, Gender.MALE, it);
        Man man2 = new Man("Ben", "Travolta", 32, Gender.MALE, it);

        ManService service = new ManService();

        boolean isEqualPositions = service.comparePositions(man1, man2);
        System.out.println(isEqualPositions);
    }
}
