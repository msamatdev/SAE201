public class Addition extends Operation {

    public Addition(Nombre operande1, Nombre operande2) {
        super(operande1, operande2);
    }
    
    public int valeur() {
        return super.getOperande1().valeur() + super.getOperande2().valeur();
    }

    public String toString() {
        return super.getOperande1().valeur() + " + " + super.getOperande2().valeur() + " = " + this.valeur();
    }
}