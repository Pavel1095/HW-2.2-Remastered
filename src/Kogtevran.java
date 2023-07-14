public class Kogtevran extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Kogtevran(String fullName, int magic, int teleport,int mind, int wisdom, int wit, int creation) {
        super(fullName, magic, teleport);
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
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }
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
            System.out.println(this.getFullName() + " сильнее, чем " + studentSecond.getFullName());
        } else if (powerTwo > powerOne){
            System.out.println(studentSecond.getFullName() + " сильнее, чем " + this.getFullName());
        } else {
            System.out.println(this.getFullName() + " такой же сильный, как и " + studentSecond.getFullName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nfaculty - " + "Kogtevran" +
                "\nmind = " + mind +
                "\nwisdom = " + wisdom +
                "\nwit = " + wit +
                "\ncreation = " + creation;
    }
}