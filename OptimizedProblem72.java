public class OptimizedProblem72 {

    public static void main(String[] argv) {
        System.out.println(Problem72.calc());
    }

    public static long calc() {
        int max = 1000000;
        int[] phi = new int[max + 1];
        long out = 0;
        for (int t = 0; t <= max; t++) {
            phi[t] = t;
        }
        for (int i = 2; i <= max; i++) {
            if (phi[i] == i) {
                for (int j = i; j <= max; j += i) {
                    phi[j] =  phi[j] / i * (i - 1);
                }
            }
            out += phi[i];
        }
        return out;
    }

}
