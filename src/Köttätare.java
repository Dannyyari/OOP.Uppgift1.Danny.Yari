public class Köttätare extends Planta {
   // private double ammountOfProtein;

    public Köttätare(double height, String name) {
        super(height, name);

    }

   /* public double getAmmountOfProtein() {
        return ammountOfProtein= 0.1+(0.2*getHeight());
    }*/
    public String printMe() {
        return "Köttande växten " + getName() + " ska vattnas med " + getProteinReq(getHeight()) +" L "+ Liquds.PROTEINDRYCK.typeLiquid + " per dag";
    }
}
