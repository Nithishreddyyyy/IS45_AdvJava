package LabPrac.Try.Practice.Telephone;

public class Contact {
    String name;
    Long number;
    public Contact(String name, Long number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
