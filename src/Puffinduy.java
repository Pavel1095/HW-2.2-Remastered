public class Puffinduy extends Hogwarts {

    private int industriousness;
    private int loyalty;
    private int honesty;

    public Puffinduy(String fullName, int magic, int teleport,int industriousness, int loyalty, int honesty) {
        super(fullName, magic, teleport);
        if (industriousness < 0 || industriousness > 100){
            throw new RuntimeException("Неверное значение industriousness");
        }
        if (loyalty < 0 || loyalty > 100){
            throw new RuntimeException("Неверное значение loyalty");
        }
        if (honesty < 0 || honesty > 100){
            throw new RuntimeException("Неверное значение honesty");
        }
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void compareStudents(Puffinduy studentSecond) {
        int powerOne = this.industriousness + this.loyalty + this.honesty;
        int powerTwo = studentSecond.industriousness + studentSecond.loyalty + studentSecond.honesty;
        if (powerOne> powerTwo){
            System.out.println(this.getFullName() + " сильнее, чем " + studentSecond.getFullName());
        } else if (powerTwo > powerOne){
            System.out.println(studentSecond.getFullName() + " сильнее, чем," + this.getFullName());
        } else {
            System.out.println(this.getFullName() + " такой же сильный, как и " + studentSecond.getFullName());
        }
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nindustriousness = " + industriousness +
                "\nloyalty = " + loyalty +
                "\nhonesty = " + honesty;
    }
}
