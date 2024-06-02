public class CalculatriceSimple {

    public static void main(String[] args) {

        Nombre six = new Nombre(6);
        Nombre dix = new Nombre(10);
        Nombre zero = new Nombre(0);

        Operation s = new Soustraction(dix, six);
        System.out.println(s + " = " + s.valeur());

        Operation s2 = new Addition(six, dix);
        System.out.println(s2 + " = " + s2.valeur());

        Operation s3 = new Multiplication(six, dix);
        System.out.println(s3 + " = " + s3.valeur());

        Operation s4 = new Division(six, dix);
        System.out.println(s4 + " = " + s3.valeur());
        
        try {
            Operation s5 = new Division(six, zero);
            System.out.println(s5 + " = " + s5.valeur());

            
        } catch(ArithmeticException e) {
            System.out.println("Vous ne pouvez pas diviser par 0 !");
        }

        try{
            Expression a = new Addition(six, dix);
            Expression m = new Multiplication(six, dix);
            Expression d = new Division(a, m);

            System.out.println(d + " = " + d.valeur());
        } catch(ArithmeticException e) {
            System.out.println("Vous ne pouvez pas diviser par 0 !");
        }

    }

}