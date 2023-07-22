package Logica;

public class Conversor {

    private final double USD = 0.00024 ;
    private final double Euro = 0.00022;
    private final double librasEsterlinas = 0.0;
    private final double jenJapones = 0.0;
    private final double wonSulCorearo = 0.0;
    private double COP;

    public double getCOP(){
        return this.COP;
    }

    public void setCOP(double COP){
        this.COP = COP;
    }

    public double convertirCOPaUSD(double cantidad){
        double total = cantidad * USD;
        return total;
    }

    public double convertirUSDaCOP(double cantidad){
        COP = 4139.39;
        double total = cantidad * COP;
        return total;
    }

    public double convertirCOPaEuro(double cantidad){
        double total = cantidad * Euro;
        return total;
    }

    public double convertirEuroaCOP(double cantidad){
        COP = 4613.70;
        double total = cantidad * COP;
        return total;
    }

    public static void main(String[] args) {
        Conversor a = new Conversor();


    }


}
