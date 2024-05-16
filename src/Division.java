public class Division extends Operation {

    public Division(Nombre op1, Nombre op2) throws ArithmeticException {
        super(op1, op2);
    }

    public int valeur() {
        return super.getOperande1().valeur() / super.getOperande2().valeur();
    }

    @Override
    public String toString() {
        return super.getOperande1().valeur() + " / " + super.getOperande2().valeur() + " = " + this.valeur();
    }

}