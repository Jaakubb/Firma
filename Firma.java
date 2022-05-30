import java.util.ArrayList;
import java.util.Scanner;

public class Firma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pracownik> lista = new ArrayList<>();
        String dzialanie = "1";
        while (true) {
            System.out.println("Wyjscie(x),Dodawanie(d),Zwolnij(z),lista(l),Podnieś płacę(p)Suma wydatków(s)");
            dzialanie = input.next();
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
                    System.out.println("Któremu podnieść płacę");
                    int ktoremu_podniesc = input.nextInt();
                    System.out.println("O ile");
                    int oIle = input.nextInt();
                    lista.get(ktoremu_podniesc).podnoszenie_placy(oIle);
                    break;
                case "s":
                    for (Pracownik i : lista) {
                        int suma_plac = 0;
                        for (Pracownik b : lista) {
                            suma_plac += b.getPlaca();
                        }
                        System.out.println(suma_plac);
                        break;

                    }
                    break;
                default:
                    break;
            }
        }
    }
}

