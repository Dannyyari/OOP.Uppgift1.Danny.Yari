abstract class Planta implements IPrinter {//har bara implementerat i min superklass för att alla ärver denna
    private double height; //Attribut som representerar höjd, inkapslad för att skydda värdet
    private String name;

    /**
     * Inkapsling ovan.
     * Jag har INTE setters då ingen ska kunna gå in och ändra höjd på växter så de får felaktig mängd vätska
     * I framtida program kan detta vara en idé för att kunna över tid då växter blir större kan man lägga in setters.
     */

    //Konstruktor
    public Planta(double height, String name) {
        this.height = height;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void printMe() {

    }

}
