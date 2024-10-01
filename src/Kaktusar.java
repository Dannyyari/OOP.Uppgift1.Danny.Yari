public class Kaktusar extends Planta {
    //private final double givenLiquid=0.02;

    public Kaktusar(double height, String name) {
        super(height, name);
    }

   /* public double getGivenLiquid() {
        return givenLiquid;
    }*/
    public String printMe() {
        return "Kaktusen " + getName() + " ska vattnas med " + getMineralreq() +" L "+ Liquds.MINERALVATTEN.typeLiquid + " per dag";
    }
}
