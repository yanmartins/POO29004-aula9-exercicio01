public class Principal {

    public static void main(String[] args) {

        Complexo x = new Complexo(2,3);
        Complexo y = new Complexo(6,3);

        Complexo j = new Complexo();
        Complexo g = new Complexo();

        j.soma(x,y);
        System.out.println(j.toString());

        j.soma(g, x);
        System.out.println(j.toString());

        x.subtracao(x,y);
        System.out.println(x.toString());

        j.subtracao(g,y);
        System.out.println(j.toString());

        j.soma(j,j);
        System.out.println(j.toString());
    }
}
