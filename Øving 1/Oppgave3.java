class Oppgave3 {
    public static void main(String[] args) {
       int sek = 9344;
       double tim =  sek / 3600;
       double min = (sek % 3600) / 60;
       double tSek = sek % 60;
       System.out.println("I " + sek + " sekunder er det " + tim + " timer " + min + " minutter og " + tSek + " sekunder");
    }

}
