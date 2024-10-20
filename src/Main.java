public class Main {
    public static void main(String[] args) {
        Scoala scoala = new Scoala();
        Clasa clasa1A = new Clasa(30, NumarClasa.I, 'A');
        Clasa clasa2B = new Clasa(25, NumarClasa.II, 'B');

        scoala.adaugaClasa("1A", clasa1A);
        scoala.adaugaClasa("2B", clasa2B);

        Elev elev1 = new Elev("Ion", Gen.Masculin);
        Elev elev2 = new Elev("Maria", Gen.Feminin);

        scoala.adaugaElevInClasa("1A", elev1);
        scoala.adaugaElevInClasa("2B", elev2);

        System.out.println("Numar clase: " + scoala.getNumarClase());
        System.out.println("Total elevi: " + scoala.getTotalElevi());
    }
}
