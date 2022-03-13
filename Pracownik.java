import java.util.Scanner;

public class Pracownik {
    private String Imie;
    private String Nazwisko;
    private int Placa;
    private String Adres;

    public Pracownik(){
        Scanner input = new Scanner(System.in);
        System.out.println("Imię pracownika");
        this.Imie = input.next();
        System.out.println("Nazwisko pracownika");
        this.Nazwisko = input.next();
        System.out.println("Adres pracownika");
        this.Adres = input.next();
        System.out.println("Płaca pracownika");
        this.Placa = Integer.parseInt(input.next());
    }
    public String getImie() {
        return Imie;
    }
    public void Imie(String Imie) {
        this.Imie = Imie;
    }
    public String getAdres() {
        return Adres;
    }
    public void Adres(String Adres) {
        this.Adres = Adres;
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
        this.Nazwisko = Nazwisko;
    }
    public String toString() {
        String tekst = "Imie: " + Imie + "  Nazwisko: " + Nazwisko + "  Adres: " + Adres + "  Płaca: " + Placa;
        return tekst;
    }

}
