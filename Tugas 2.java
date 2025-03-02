public class ShapeCalculator {
    public static void main(String[] args) {
        // 1. Persegi (Square)
        int sisiPersegi = 5;
        int luasPersegi = sisiPersegi * sisiPersegi;
        int kelilingPersegi = 4 * sisiPersegi;
        System.out.println("1. Persegi:");
        System.out.println("   Luas: " + luasPersegi);
        System.out.println("   Keliling: " + kelilingPersegi);

        // 2. Segitiga (Triangle) - Assuming a simple triangle with base and height for area
        int alasSegitiga = 6;
        int tinggiSegitiga = 4;
        int sisi1 = 5, sisi2 = 5, sisi3 = 6; // Sides for perimeter
        double luasSegitiga = 0.5 * alasSegitiga * tinggiSegitiga;
        int kelilingSegitiga = sisi1 + sisi2 + sisi3;
        System.out.println("2. Segitiga:");
        System.out.println("   Luas: " + luasSegitiga);
        System.out.println("   Keliling: " + kelilingSegitiga);

        // 3. Lingkaran (Circle)
        float jariLingkaran = 7.0f;
        float phi = 3.14f;
        float luasLingkaran = phi * jariLingkaran * jariLingkaran;
        float kelilingLingkaran = 2 * phi * jariLingkaran;
        System.out.println("3. Lingkaran:");
        System.out.println("   Luas: " + luasLingkaran);
        System.out.println("   Keliling: " + kelilingLingkaran);

        // 4. Kubus (Cube) - Surface area and perimeter of one face
        int sisiKubus = 4;
        int luasPermukaanKubus = 6 * sisiKubus * sisiKubus; // Surface area
        int kelilingSisiKubus = 4 * sisiKubus; // Perimeter of one face
        System.out.println("4. Kubus:");
        System.out.println("   Luas Permukaan: " + luasPermukaanKubus);
        System.out.println("   Keliling (sisi): " + kelilingSisiKubus);
    }
}