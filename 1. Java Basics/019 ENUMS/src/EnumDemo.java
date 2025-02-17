enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L");

    private String abbreviation;

    Size(String abbreviation) { // Constructor
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() { // Method
        return abbreviation;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Size mySize = Size.MEDIUM;
        System.out.println("Size: " + mySize + ", Abbreviation: " + mySize.getAbbreviation());
    }
}
