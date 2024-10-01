import javax.swing.*;

public class Kaktusar extends Planta {

    public Kaktusar(double height, String name) {
        super(height, name);
    }

    public String getLiquidType() {
        return Liquds.MINERALVATTEN.typeLiquid;
    }

    public double getLiquidAmmount() {
        return 0.02;
    }


    public void printMe() {
        JOptionPane.showMessageDialog(null, "Kaktusen " + getName() + " ska vattnas med "
                + getLiquidAmmount() + " L " + getLiquidType() + " per dag");
    }
}
