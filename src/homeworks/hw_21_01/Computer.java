package homeworks.hw_21_01;

public class Computer {

    private Manufacturer name;
    private int serialNumber;
    private double price;
    private int quantityCPU;
    private int frequencyCPU;

    public Computer(Manufacturer name, int serialNumber, float price, int quantityCPU, int frequencyCPU){
        this.name = name;
        this.serialNumber = serialNumber;
        this.setPrice(price);
        this.quantityCPU = quantityCPU;
        this.frequencyCPU = frequencyCPU;
    }
    public Manufacturer getName() {return name;}
    public int getSerialNumber() {return serialNumber;}

    public double getPrice() {return price;}



    public int getQuantityCPU() {return quantityCPU;}

    public int getFrequencyCPU() {return frequencyCPU;}

    public String toString() {
        return String.format("%s, %s, %s, %s, %s", name, serialNumber, price, quantityCPU, frequencyCPU);
    }


    public void setPrice(double price) {
        this.price = price;
    }
}
