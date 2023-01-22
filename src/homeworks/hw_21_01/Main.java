package homeworks.hw_21_01;

public class Main {
    public static void main(String[] args){

        Computer comp = new Computer(Manufacturer.DELL, 1234567890, 3000, 64, 25 );
        Computer comp1 = new Computer(Manufacturer.APPLE, 987654321, 5000, 64, 25 );
        Computer comp2 = new Computer(Manufacturer.HP, 1029384857, 2500, 64, 25 );
        Computer comp3 = new Computer(Manufacturer.ACER, 1230984756, 2000, 32, 12 );
        Computer comp4 = new Computer(Manufacturer.LENOVO, 543216789, 1000, 16, 12 );

        Computer[] compinfo = {comp, comp1, comp2, comp3, comp4};

        double x = 1.10;

//        System.out.printf("%s%n", compinfo[0].getPrice());

        //            System.out.println(compinfo[i].getPrice());
        for (int i = 0; i < compinfo.length; i++) {
            compinfo[i].setPrice((compinfo[i].getPrice())*1.1);
            System.out.println(compinfo[i].getPrice());

        }

        for (int i = 0; i < compinfo.length; i++)
        {
            System.out.println(compinfo[i]);
        }

    }
}
