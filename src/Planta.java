abstract class Planta implements IPrinter {
    private final double height;
    private final String name;

    /**
     * Inkapsling ovan.
     * Jag hade kunnat sätta setters i denna klass men valde att inte göra det
     * då programmet ej kommer kräva detta.
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
