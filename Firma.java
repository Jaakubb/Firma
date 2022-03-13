import java.util.ArrayList;
import java.util.Scanner;

public class Firma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pracownik> lista = new ArrayList<>();
        String dzialanie = "1";
        while (true) {
            System.out.println("Wyjscie(x),Dodawanie(d),Zwolnij(z),lista(l),Podnieś płacę(p)");
            dzialanie = input.next();
            //Przerwanie aplikacji jesli x
            if (dzialanie.equals("x")) {
                break;
            }
            switch (dzialanie) {
                case "d":
                    lista.add(new Pracownik());
                    break;
                case "l":
                    for (Pracownik i : lista) {
                        System.out.println(i.toString());
                    }
                    break;
                case "z":
                    System.out.println("Którego usunąć");
                    int ktorego_usunac = input.nextInt();

                    lista.remove(ktorego_usunac);
                    break;
                case "p":
                    for (getPlaca :
                    break;
                default:
                    break;
            }
        }
    }
}
