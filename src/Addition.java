public class Addition extends Operation {

    public Addition(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }
    
    public double valeur() {
        return super.getOperande1().valeur() + super.getOperande2().valeur();
    }

    public String toString() {
        return "(" + this.getOperande1() + ")" + " + " + "(" + this.getOperande2() + ")";
    }
}
