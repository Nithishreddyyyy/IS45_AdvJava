package Lab._8.pass.Telephone;
import java.lang.*;
import java.time.*;
public class MissedCall {
    LocalTime lt;
    String name;
    long number;
    MissedCall(LocalTime l , String n , long num){
        this.lt = l;
        this.number = num;
        this.name = n;
    }
    public String toString(){
        return lt+" "+name+" "+number;
    }
}
