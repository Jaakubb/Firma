import java.util.ArrayList;

public class Firma {
    public static void main(String[] args) {
        ArrayList<Pracownik> lista = new ArrayList<>();
        lista.add(new Pracownik());
        for(int i = 0; i<1;i++){
            lista.add(new Pracownik());
        }
        for(Pracownik i : lista) {
            System.out.println(i.toString());
        }
    }
}
