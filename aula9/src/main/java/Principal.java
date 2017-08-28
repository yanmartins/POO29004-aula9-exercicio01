public class Principal {

    public static void main(String[] args) {

        Complexo x = new Complexo(2,3);
        Complexo y = new Complexo(6,3);

        Complexo j = new Complexo();
        Complexo g = new Complexo();

        j.soma(x);
        System.out.println(j.toString());

        j.soma(g);
        System.out.println(j.toString());

        x.subtracao(x);
        System.out.println(x.toString());

        j.subtracao(g);
        System.out.println(j.toString());

        j.soma(j);
        System.out.println(j.toString());
    }
}
