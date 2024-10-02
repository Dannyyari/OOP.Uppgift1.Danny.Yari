import javax.swing.*;

public class Main {

    public Main() {
        int loop = JOptionPane.showConfirmDialog(null, "Välkommen till Greenest, vill du vattna idag?");
        while (loop != JOptionPane.NO_OPTION && loop != JOptionPane.CLOSED_OPTION && loop != JOptionPane.CANCEL_OPTION) {
            String inputOfUser = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska");
            while (inputOfUser != null) {
                if (inputOfUser.equalsIgnoreCase("Olof")) {
                    olof().printMe();
                    break;
                } else if (inputOfUser.equalsIgnoreCase("laura")) {
                    laura().printMe();
                    break;
                } else if (inputOfUser.equalsIgnoreCase("Igge")) {
                    igge().printMe();
                    break;
                } else if (inputOfUser.equalsIgnoreCase("Meatloaf")) {
                    meatloaf().printMe();
                    break;
                } else
                    JOptionPane.showMessageDialog(null, "Oj! Den plantan sover inte hos oss! Försök igen.");
                break;
                //Ifall användaren matar in namn på en planta som inte finns på hotellet.
            }
            loop = JOptionPane.showConfirmDialog(null, "Vill du vattna en annan växt?");
        }
    }

    public Planta olof() { //här kan vi lägga till flera plantor om vi får fler gäster i hotellet.
        Planta plamenolof = new Palmer(1, "olof"); //polymorfism
        return plamenolof;
    }

    public Planta laura() {
        Planta palmenlaura = new Palmer(5, "Laura"); //Polymorfism
        return palmenlaura;
    }

    public Planta igge() {
        Planta kaktusenigge = new Kaktusar(0.2, "igge");//polymorfism
        return kaktusenigge;
    }

    public Planta meatloaf() {
        Planta köttätare = new Köttätare(0.7, "Meatloaf");//polymorfism
        return köttätare;

    }

    public static void main(String[] args) {
        Main vgUppgift = new Main();

    }
}

