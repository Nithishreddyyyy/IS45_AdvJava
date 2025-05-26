package LabPrac._9CGPA;

public class Student {
    String name, usn, address, category;
    int age;
    float sgpa_1, sgpa_2, sgpa_3, sgpa_4;

    public Student(String name, String usn, String address, String category, int age, float sgpa_1, float sgpa_2, float sgpa_3, float sgpa_4) {
        this.name = name;
        this.usn = usn;
        this.address = address;
        this.category = category;
        this.age = age;
        this.sgpa_1 = sgpa_1;
        this.sgpa_2 = sgpa_2;
        this.sgpa_3 = sgpa_3;
        this.sgpa_4 = sgpa_4;
    }

    public float computeCGPA() {
        return (sgpa_1 + sgpa_2 + sgpa_3 + sgpa_4) / 4;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + '\'' +
                ", usn='" + usn + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", category='" + category + '\'' +
                ", CGPA=" + computeCGPA() +
                '}';
    }
}
