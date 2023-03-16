package GCD;

public class Lcm {
    public static void main(String args[]) {
        int x = 10;
        int y = 20;
        int hcf = 0;
        int lcm;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0 && y % i == 0) {
                hcf = i;
            }
        }
        lcm = (x * y) / hcf;
        System.out.println("hcf :" + hcf);
        System.out.println("lcm :" + lcm);
    }
}
