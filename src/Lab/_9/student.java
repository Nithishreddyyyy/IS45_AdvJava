package Lab._9;

public class student {
    String name, usn, addr, category;
    int age;
    float sgpa_1, sgpa_2, sgpa_3, sgpa_4, cgpa;

    public student(String name, String usn, String addr, String category, int age, float sgpa_1, float sgpa_2, float sgpa_3, float sgpa_4) {
        this.name = name;
        this.usn = usn;
        this.addr = addr;
        this.category = category;
        this.age = age;
        this.sgpa_1 = sgpa_1;
        this.sgpa_2 = sgpa_2;
        this.sgpa_3 = sgpa_3;
        this.sgpa_4 = sgpa_4;
        this.cgpa = (sgpa_1 + sgpa_2 + sgpa_3 + sgpa_4) / 4;
    }

    public String toString() {
        return "Student [Name: " + name + ", USN: " + usn + ", Address: " + addr + ", Age: " + age +
                ", Category: " + category + ", CGPA: " + cgpa + "]\n";
    }
}
