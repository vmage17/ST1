package w65479.st1_lab3;

public class Osoba {
    private String imie = null;
    private String nazwisko = null;

    public Osoba() {
    }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }
}
