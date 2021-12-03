package Week10.yl29;

public class Student extends Person{
    private int credit;

    public Student(String name, String address) {
        super(name, address);
        this.credit = 0;
    }

    @Override
    public String toString() {
        return super.toString()+"\n  credits "+this.credit;
    }

    public int credits(){
        return this.credit;
    }

    public void study(){
        this.credit++;
    }
}
