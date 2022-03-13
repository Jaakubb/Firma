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

}
