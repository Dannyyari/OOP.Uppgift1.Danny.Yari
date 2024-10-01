import javax.swing.*;

public class Palmer extends Planta {

    public Palmer(double height, String name) {
        super(height, name);
    }

    @Override
    public double getLiquidAmmount() {
        return 0.5 * getHeight();
    }

    @Override
    public String getLiquidType() {
        return Liquds.KRANVATTEN.typeLiquid;
    }

    public void printMe() {
        JOptionPane.showMessageDialog(null, "Palmen " + getName() + " ska vattnas med "
                + getLiquidAmmount() + " L " + getLiquidType() + " per dag");
    }

}