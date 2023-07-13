public class Slizerin extends Hogwarts{
    private int cunning;

    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public int getCunning() {
        return cunning;
    }
    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }
    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }
    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }
    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }
    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public void compareStudents(Slizerin studentSecond) {
        int powerOne = this.cunning + this.determination + this.ambition +
                this.resourcefulness + this.lustForPower;
        int powerTwo = studentSecond.cunning + studentSecond.determination + studentSecond.ambition +
                studentSecond.resourcefulness + studentSecond.lustForPower;
        if (powerOne> powerTwo){
            System.out.println(this.fullName + " сильнее ,чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne){
            System.out.println(studentSecond.fullName + " сильнее, чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, как и " + studentSecond.fullName);
        }
    }

    public Slizerin(String fullName, int magic, int teleport,int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, magic, teleport);

        if (cunning < 0 || cunning > 100){
            throw new RuntimeException("Неверное значение cunning");
        }
        if (determination < 0 || determination > 100){
            throw new RuntimeException("Неверное значение determination");
        }
        if (ambition < 0 || ambition > 100){
            throw new RuntimeException("Неверное значение ambition");
        }
        if (resourcefulness < 0 || resourcefulness > 100){
            throw new RuntimeException("Неверное значение resourcefulness");
        }
        if (lustForPower < 0 || lustForPower > 100){
            throw new RuntimeException("Неверное значение lustForPower");
        }
        this.magic = magic;
        this.teleport = teleport;
        this.fullName = fullName;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }
    @Override
    public String toString() {
        return "Я - " + fullName +
                "\nfaculty = " + "Slizerin" +
                "\ncunning = " + cunning +
                "\ndetermination = " + determination +
                "\nambition = " + ambition +
                "\nresourcefulness = " + resourcefulness +
                "\nlustForPower = " + lustForPower +
                "\nmagic = " + magic +
                "\nteleport = " + teleport;
    }
}
