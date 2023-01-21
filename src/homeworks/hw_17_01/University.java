package homeworks.hw_17_01;

public class University {
    private UniversityName uniName;
    private int quantityGroup;
    private  int dateOfStart;

    public University(UniversityName uniName,int quantityGroup, int dateOfStart) {
        this.uniName = uniName;
        this.quantityGroup = quantityGroup;
        this.dateOfStart = dateOfStart;
    }

    public UniversityName getNameUniversity() {
        return uniName;
    }

    public int getQuantityGroup() {return quantityGroup;}

    public int getDateOfStart() {return dateOfStart=01-01-1950;}

    public String toString() {
        return String.format("%s", uniName);
    }

}
