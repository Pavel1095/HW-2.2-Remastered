public class Kogtevran extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public int getMind() {
        return mind;
    }
    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }
    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }
    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }
    public void setCreation(int creation) {
        this.creation = creation;
    }

    public void compareStudents( Kogtevran studentSecond) {
        int powerOne = this.mind + this.wisdom + this.wit + this.creation;
        int powerTwo = studentSecond.mind + studentSecond.wisdom + studentSecond.wit + studentSecond.creation;
        if (powerOne> powerTwo){
            System.out.println(this.fullName + " сильнее, чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne){
            System.out.println(studentSecond.fullName + " сильнее, чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, как и " + studentSecond.fullName);
        }
    }

    public Kogtevran(String fullName, int magic, int teleport,int mind, int wisdom, int wit, int creation) {
        if (mind < 0 || mind > 100){
            throw new RuntimeException("Неверное значение mind");
        }
        if (wisdom < 0 || wisdom > 100){
            throw new RuntimeException("Неверное значение wisdom");
        }
        if (wit < 0 || wit > 100){
            throw new RuntimeException("Неверное значение wit");
        }
        if (creation < 0 || creation > 100){
            throw new RuntimeException("Неверное значение creation");
        }
        this.magic = magic;
        this.teleport = teleport;
        this.fullName = fullName;
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "Я - " + fullName +
                "\nfaculty - " + "Kogtevran" +
                "\nmind = " + mind +
                "\nwisdom = " + wisdom +
                "\nwit = " + wit +
                "\ncreation = " + creation +
                "\nmagic = " + magic +
                "\nteleport = " + teleport;
    }
}