package LabPrac.Try.Practice.Telephone;

import java.time.LocalTime;

public class MissedCall {
    LocalTime lt;
    String name;
    Long number;

    public MissedCall(LocalTime lt, String name, Long number) {
        this.lt = lt;
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "MissedCall{" +
                "lt=" + lt +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
