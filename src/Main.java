public class Main {
    public static void main(String[] args) {
        Griffindor harryPoter = new Griffindor("Harry Poter", 45, 67, 14, 36, 87);
        Griffindor ronWizzley = new Griffindor("Ron Wizzley", 23, 45, 56, 24, 50);
        Griffindor germionaGinger= new Griffindor("Germiona Ginger", 90, 90, 90, 90, 90);
        Kogtevran joeyJunk = new Kogtevran("Joey Junk", 43, 56,84,84,36, 32);
        Kogtevran padmaPatil = new Kogtevran("Padma Patil", 73, 32,18,73,54, 51);
        Kogtevran marcusBalby = new Kogtevran("Marcus Balby", 42, 21,64,32,21, 32);
        Puffinduy zacharySmith = new Puffinduy("Zachary Smith", 57, 37, 38, 37, 54);
        Puffinduy cedricDiggori = new Puffinduy("Cedic  Diggori", 53, 12, 42, 21, 43);
        Puffinduy justinFinch = new Puffinduy("Justin Finch", 87, 32, 16, 19, 14);
        Slizerin grahamMontegu = new Slizerin("Graham Montegu", 58, 48, 29, 52, 94, 92, 10);
        Slizerin drakoMalfoy = new Slizerin("Drako Malfoy", 38, 48, 49, 52, 94, 92, 13);
        Slizerin gregoryGoyl = new Slizerin("Gregory Goyl", 18, 28, 49, 52, 24, 52, 50);
        harryPoter.compareStudents(ronWizzley);
    }
}