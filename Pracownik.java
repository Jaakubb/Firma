import java.util.Scanner;

public class Pracownik {
    private String Imie;
    private String Nazwisko;
    private int Placa;

    public Pracownik(){
        Scanner input = new Scanner(System.in);
        System.out.println("Imię pracownika");
        this.Imie = input.next();
        System.out.println("Nazwisko pracownika");
        this.Nazwisko = input.next();
        System.out.println("Płaca pracownika");
        this.Placa = Integer.parseInt(input.next());
    }
    public String getImie() {
        return Imie;
    }
    public void Imie(String Imie) {
        this.Imie = Imie;
    }

    public int Placa() {
        return Placa;
    }

    public void Placa(int predkosc_max) {
        this.Placa = Placa;
    }
    public String getNazwisko() {
        return Nazwisko;
    }
    public void Nazwisko(String Nazwisko) {
        this.Imie = Imie;
    }
    public String toString() {
        String tekst = "Imie: " + Imie + "  Nazwisko: " + Nazwisko + "  Płaca: " + Placa;
        return tekst;
    }
}
