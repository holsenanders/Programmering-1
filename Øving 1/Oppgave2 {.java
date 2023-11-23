class Oppgave2 {
    public static void main(String[] args) {
        int antTim = 2;
        int antMin = 32;
        int antSek = 55;
        double sekiTim = antTim * 60 * 60;
        double timiMin = antMin * 60;
        double tot = sekiTim + timiMin + antSek;
        System.out.println("I " + antTim + " Timer " + antMin + " minutter og " + antSek + " sekunder er det " + tot + " sekunder");
    }

}
