public class Puffinduy extends Hogwarts {

    private int industriousness;
    private int loyalty;
    private int honesty;

    public Puffinduy(String fullName, int magic, int teleport,int industriousness, int loyalty, int honesty) {
        if (industriousness < 0 || industriousness > 100){
            throw new RuntimeException("Неверное значение industriousness");
        }
        if (loyalty < 0 || loyalty > 100){
            throw new RuntimeException("Неверное значение loyalty");
        }
        if (honesty < 0 || honesty > 100){
            throw new RuntimeException("Неверное значение honesty");
        }
        this.magic = magic;
        this.teleport = teleport;
        this.fullName = fullName;
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void compareStudents(Puffinduy studentSecond) {
        int powerOne = this.industriousness + this.loyalty + this.honesty;
        int powerTwo = studentSecond.industriousness + studentSecond.loyalty + studentSecond.honesty;
        if (powerOne> powerTwo){
            System.out.println(this.fullName + " сильнее, чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne){
            System.out.println(studentSecond.fullName + " сильнее, чем," + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, как и " + studentSecond.fullName);
        }
    }
    @Override
    public String toString() {
        return "Я - " + fullName +
                "\nfullName = " + fullName +
                "\nindustriousness = " + industriousness +
                "\nloyalty = " + loyalty +
                "\nhonesty = " + honesty +
                "\nmagic = " + magic +
                "\nteleport = " + teleport;
    }
}
