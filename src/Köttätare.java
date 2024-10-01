import javax.swing.*;

public class Köttätare extends Planta {

    public Köttätare(double height, String name) {
        super(height, name);
    }

    public double getLiquidAmmount() {
        return 0.1 + (0.2 * getHeight());
    }

    public String getLiquidType() {
        return Liquds.PROTEINDRYCK.typeLiquid;
    }


    public void printMe() {
        JOptionPane.showMessageDialog(null, "Köttande växten " + getName() + " ska vattnas med "
                + getLiquidAmmount() + " L " + getLiquidType() + " per dag");
    }

}
