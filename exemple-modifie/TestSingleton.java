public class TestSingleton {
    public static void main(String[] args) {
        int som = Singleton.getInstance().Somme(2, 5);
        System.out.println("la somme est: " + som);

        int max = Singleton.getInstance().maximum(4, 9);
        System.out.println("le maximum est: " + max);

        Singleton s1 = Singleton.getInstance(8, 3);
        s1.affiche();

        Singleton s2 = Singleton.getInstance(16, 19);
        s2.affiche();

        System.out.println("\n s1 et s2 sont la meme instance: " + (s1 == s2));
    }
}