public class Multiplication extends Operation {

    public Multiplication(Nombre op1, Nombre op2) {
        super(op1, op2);
    }

    public int valeur() {
        return super.getOperande1().valeur() * super.getOperande2().valeur();
    }

    @Override
    public String toString() {
        return super.getOperande1().valeur() + " * " + super.getOperande2().valeur() + " = " + this.valeur();
    }

}