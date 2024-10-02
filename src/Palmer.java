import javax.swing.*;

public class Palmer extends Planta {

    public Palmer(double height, String name) {
        super(height, name);
    }

    public double getLiquidAmmount() {
        return 0.5 * getHeight();
    }

    public String getLiquidType() {
        return Liquds.KRANVATTEN.typeLiquid;
    }

    //placerar in min JOptionPane inne i klassen då vi kanske vill ha 4 nya palmer, då kommer det printa ut korrekt direkt.
    public void printMe() {
        JOptionPane.showMessageDialog(null, "Palmen " + getName() + " ska vattnas med "
                + getLiquidAmmount() + " L " + getLiquidType() + " per dag");
    }

}