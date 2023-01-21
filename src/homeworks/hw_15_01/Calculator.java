package homeworks.hw_15_01;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double chyslo2, rezultat = 0;

        System.out.println("Введите первое число : ");
        double chyslo1 = Double.parseDouble(sc.nextLine());

        System.out.println("Введите второе число : ");
        chyslo2 = Double.parseDouble(sc.nextLine());

        System.out.println("Введіть дію (+-*/) :  ");

        String diya = sc.nextLine();

        if (diya.equals("+")) {
            rezultat = chyslo1 + chyslo2;
        } else if (diya.equals("-")) {
            rezultat = chyslo1 - chyslo2;
        } else if (diya.equals("*")) {
            rezultat = chyslo1 * chyslo2;
        } else if (diya.equals("/")) {
//            rezultat =
        }

        System.out.println("Результат: " + rezultat);


    }


}
