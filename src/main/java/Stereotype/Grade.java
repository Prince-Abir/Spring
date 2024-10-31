package Stereotype;

public class Grade {
    private int mark = 100;

    public Grade(int mark) {
        this.mark = mark;
    }

    public Grade() {
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    public static String mark(){
        return "100";
    }


    @Override
    public String toString() {
        return "Grade{" +
                "mark=" + mark +
                '}';
    }

}
