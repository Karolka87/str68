public class piesTester {
    public static void main(String[] args) {
        Pies p = new Pies();
        p.imie = "Azor";
        System.out.println(p.imie);
        p.szczekaj();
    }
}

class Pies {
    int wielkosc;
    String imie;
    String rasa;

    void szczekaj() {
        System.out.println("Hau-hau");
    }
}
