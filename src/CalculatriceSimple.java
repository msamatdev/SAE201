public class CalculatriceSimple {

    public static void main(String[] args) {

        Nombre six = new Nombre(6);
        Nombre dix = new Nombre(10);
        Nombre zero = new Nombre(0);

        Operation s = new Soustraction(dix, six);
        System.out.println(s);

        Operation s2 = new Addition(six, dix);
        System.out.println(s2);

        Operation s3 = new Multiplication(six, dix);
        System.out.println(s3);

        Operation s4 = new Division(six, dix);
        System.out.println(s4);
        
        try {
            Operation s5 = new Division(six, zero);
            System.out.println(s5);
        } catch(ArithmeticException e) {
            System.out.println("Vous ne pouvez pas diviser par 0 !");
        }


    }

}