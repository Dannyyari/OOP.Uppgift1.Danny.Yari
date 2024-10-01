public class Palmer extends Planta{
    //private double givenWater;

    public Palmer( double height, String name) {
        super(height, name);
    }

  /*  public double getGivenWater() {
        return givenWater= height* 0.5;
        Behåller jag den bara i klassen här?
    }*/

    @Override
    public double getLiquidAmmount() {
        return 0.5*this.height;
    }

    @Override
    public String getLiquidName() {
        return Liquds.KRANVATTEN.typeLiquid;
    }

    public String printMe() {
        return "Palmen " + getName() + " ska vattnas med " + getWatereq(getHeight())+ "--"+  getLiquidAmmount() +" L "
                + Liquds.KRANVATTEN.typeLiquid + "--" + getLiquidName() + " per dag";
    }

}
