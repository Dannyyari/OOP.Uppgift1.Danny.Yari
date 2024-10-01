
abstract class Planta implements IPrinter {
protected double height;
protected String name;

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

    public String printMe(){

        return "";
    }

    @Override
    public double getLiquidAmmount() {
        return 0;
    }

    @Override
    public String getLiquidName() {
        return "";
    }
}
