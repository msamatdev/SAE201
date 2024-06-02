public class Soustraction extends Operation {

    public Soustraction(Expression op1, Expression op2) {
        super(op1, op2);
    }

    public double valeur() {
        return super.getOperande1().valeur() - super.getOperande2().valeur();
    }

    @Override
    public String toString() {
        return "(" + this.getOperande1() + ")" + " - " + "(" + this.getOperande2() + ")";
    }

}