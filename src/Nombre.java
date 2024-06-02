public class Nombre extends Expression {

    private double valeurNombre;

    public Nombre(double uneValeur) {
        this.valeurNombre = uneValeur;
    }


    public double valeur() {
        return this.valeurNombre;
    }

    @Override
    public String toString() {
        return this.valeurNombre + "";
    }

}
