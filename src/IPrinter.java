public interface IPrinter {
    abstract String printMe();

    default double getWatereq(double h){
        return h*0.5;
    }
    default double getProteinReq(double h){
        return 0.1+(0.2*h);
    }
    default double getMineralreq(){
        return 0.02;
    }

    public double getLiquidAmmount();

    public String getLiquidName();



    //kanske ha en metod i interface som ger vatten, kolla iPartyAnimal

    //göra metoder för olika vätskor och ta in enums
    //implemtentera getWater sen ska enum in, detta ska vara en metod som returnar enum.
    //Liquids w=Liquis.VATTEN detta kanske ska in i interface
    //man kan deklarera enum direkt i en klass, kanske ska man deklarera dessa här i
}
