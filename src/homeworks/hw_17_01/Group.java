package homeworks.hw_17_01;

public class Group {

    private GroupName groupName;

    private int quantityStudent;

    public Group(GroupName groupName , int quantityStudent) {
        this.groupName = groupName;
        this.quantityStudent = quantityStudent;
    }

    public GroupName getName() {
        return groupName;
    }

    public String toString() {
        return String.format("%s", groupName);
    }
}
