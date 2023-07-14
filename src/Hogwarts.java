public abstract class Hogwarts {
    private String fullName;
    private int magic;
    private int teleport;

    public Hogwarts(String fullName, int magic, int teleport) {

        if (magic < 0 || magic > 100){
            throw new RuntimeException("Неверное значение magic");
        }
        if (teleport < 0 || teleport > 100){
            throw new RuntimeException("Неверное значение teleport");
        }
        this.magic = magic;
        this.teleport = teleport;
        this.fullName = fullName;
    }

    private int getTeleport() {
        return teleport;
    }
    private void setTeleport(int teleport) {
        if (teleport < 0 || teleport > 100) {
            throw new RuntimeException("Введено неверное значение.");
        }
        this.teleport = teleport;
    }

    private String getFullName() {
        return fullName;
    }
    private void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private int getMagic() {
        return magic;
    }
    private void setMagic(int magic) {
        if (magic < 0 || magic > 100) {
            throw new RuntimeException("Введено неверное значение.");
        }
        this.magic = magic;
    }

    private void compareStudents(Hogwarts studentSecond) {
        int powerOne = this.magic + this.teleport;
        int powerTwo = studentSecond.magic + studentSecond.teleport;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " сильнее чем, " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.fullName + " сильнее чем, " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, как и " + studentSecond.fullName);
        }
    }
    @Override
    public String toString() {
        return "Я - " + fullName +
                "\nschool - " + "Hogwarts" +
                "\nmagic = " + magic +
                "\nteleport = " + teleport;
    }
}
