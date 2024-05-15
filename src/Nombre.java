public class Nombre {

    private int valeurNombre;

    public Nombre(int valeurNombre) {
        this.valeurNombre = valeurNombre;
    }


    public int valeur() {
        return this.valeurNombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.valeurNombre;
    }

}
