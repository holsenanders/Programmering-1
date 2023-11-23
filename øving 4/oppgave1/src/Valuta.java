class Valuta {
    private String navn;
    private double kurs;

    public Valuta(String navn, double kurs) {
        this.navn = navn;
        this.kurs = kurs;
    }

    public double tilNorskeKroner(double belop) {
        return belop * kurs;
    }

    public String getNavn() {
        return navn;
    }
}