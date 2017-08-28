public class Complexo {

    private int real;
    private int imaginario;

    public Complexo(){
        real = 0;
        imaginario = 0;
    }

    public Complexo(int r, int i){
        real = r;
        imaginario = i;
    }

    public void soma(Complexo a){
        real = a.real + real;
        imaginario = a.imaginario + imaginario;
    }
    public void subtracao(Complexo a){
        real = real - a.real;
        imaginario = imaginario - a.imaginario;
    }

    public String toString(){
        return "("+real+","+imaginario+")";
    }
}
