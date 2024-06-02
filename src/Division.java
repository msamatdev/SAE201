public class Division extends Operation {

    public Division(Expression op1, Expression op2) throws ArithmeticException {
        super(op1, op2);
        if(op2.valeur() == 0) throw new ArithmeticException("Zero division error");
    }

    public double valeur() {
        return super.getOperande1().valeur() / super.getOperande2().valeur();
    }

    @Override
    public String toString() {
        return "(" + this.getOperande1() + ")" + " / " + "(" + this.getOperande2() + ")";
    }

}