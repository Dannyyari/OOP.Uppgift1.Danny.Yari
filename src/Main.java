import javax.swing.*;

public class Main {

    public Main() {
        int loop= JOptionPane.showConfirmDialog(null, "Välkommen till Greenest, vill du vattna idag?");
        while (loop!=JOptionPane.NO_OPTION && loop!=JOptionPane.CLOSED_OPTION && loop !=JOptionPane.CANCEL_OPTION) {
            String inputOfUser = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska");
            while (inputOfUser != null) {
                if (inputOfUser.equalsIgnoreCase("Olof")) {
                    JOptionPane.showMessageDialog(null, olof().printMe());
                    break;
                } else if (inputOfUser.equalsIgnoreCase("laura")) {
                    JOptionPane.showMessageDialog(null, laura().printMe());
                    break;
                } else if (inputOfUser.equalsIgnoreCase("Igge")) {
                    JOptionPane.showMessageDialog(null, igge().printMe());
                    break;
                } else if (inputOfUser.equalsIgnoreCase("Meatloaf")) {
                    JOptionPane.showMessageDialog(null, meatloaf().printMe());
                    break;
                } else
                    JOptionPane.showMessageDialog(null, "Oj! Den plantan sover inte hos oss!");
                break;
            }
            loop=JOptionPane.showConfirmDialog(null, "Vill du vattna en annan växt?");
        }
    }
    public Planta olof() { //här kan vi lägga till flera plantor om vi får fler gäster i hotellet.
        Planta plamenolof = new Palmer(1, "olof");
        return plamenolof;
    }

    public Planta laura() {
        Planta palmenlaura = new Palmer(5, "Laura");
        return palmenlaura;
    }

    public Planta igge() {
        Planta kaktusenigge = new Kaktusar(0.2, "igge");
        return kaktusenigge;
    }

    public Planta meatloaf() {
        Planta köttätare = new Köttätare(0.7, "Meatloaf");
        return köttätare;
    }

    public static void main(String[] args) {
        Main vgUppgift=new Main();

      /*  int loop= JOptionPane.showConfirmDialog(null, "Välkommen till Greenest, vill du vattna idag?");
        while (loop!=JOptionPane.NO_OPTION && loop!=JOptionPane.CLOSED_OPTION && loop !=JOptionPane.CANCEL_OPTION) {
            String inputOfUser = JOptionPane.showInputDialog(null, "Vilken planta vill du vattna");
            Main input = new Main();
            while (inputOfUser != null) {
                if (inputOfUser.equalsIgnoreCase("Olof")) {
                    JOptionPane.showMessageDialog(null, input.olof().printMe());
                break;
                } else if (inputOfUser.equalsIgnoreCase("laura")) {
                    JOptionPane.showMessageDialog(null, input.laura().printMe());
                    break;
                } else if (inputOfUser.equalsIgnoreCase("Igge")) {
                    JOptionPane.showMessageDialog(null, input.igge().printMe());
                    break;
                } else if (inputOfUser.equalsIgnoreCase("meatloaf")) {
                    JOptionPane.showMessageDialog(null, input.meatloaf().printMe());
                    break;
                } else
                    JOptionPane.showMessageDialog(null, "Oj! Den plantan sover inte hos oss!");
                break;
            }
            loop=JOptionPane.showConfirmDialog(null, "Vill du vattna en annan växt?");
        }*/

    }
}

