public class Griffindor extends Hogwarts {
    private int honor;
    private int nobility;
    private int bravery;

    public Griffindor(String fullName, int magic, int teleport, int honor, int nobility, int bravery) {
        super(fullName, magic, teleport);

        if (honor < 0 || honor > 100){
            throw new RuntimeException("Неверное значение honor");
        }
        if (nobility < 0 || nobility > 100){
            throw new RuntimeException("Неверное значение nobility");
        }
        if (bravery < 0 || bravery > 100){
            throw new RuntimeException("Неверное значение bravery");
        }
        this.honor = honor;
        this.nobility = nobility;
        this.bravery = bravery;
    }
    public int getHonor() {
        return honor;
    }
    public int getNobility() {
        return nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public void compareStudents (Griffindor studentSecond) {
        int powerOne = this.honor + this.nobility + this.bravery;
        int powerTwo = studentSecond.honor + studentSecond.nobility + studentSecond.bravery;
        if (powerOne > powerTwo){
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
        "\nfaculty = " + "Griffindor" +
                "\nhonor = " + honor +
                "\nnobility = " + nobility +
                "\nbravery = " + bravery;
    }
}