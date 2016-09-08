import java.util.ArrayList;

class Problem72 {
    public static void main(String[] argv) {
        System.out.println(Problem72.calc());
    }

    public static long calc() {
        int max = 1000000;
        ArrayList<Integer> phi = new ArrayList<Integer>();
        long out = 0;
        for (int t = 0; t <= max; t++) {
            phi.add(t);
        }
        for (int i = 2; i <= max; i++) {
            if (phi.get(i) == i) {
                for (int j = i; j <= max; j += i) {
                    phi.set(j, phi.get(j) / i * (i - 1));
                }
            }
            out += phi.get(i);
        }
        return out;
    }
}

