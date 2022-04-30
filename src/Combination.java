import java.util.Scanner;

public class Combination {
    private int N = 0;
    private int r = 0;

    public void setN(int n) {
        N = n;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getN() {
        return N;
    }

    public int getR() {
        return r;
    }

    public void calc() {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        System.out.print("C(N,r) 'N' değerini giriniz :");
        setN(scanner.nextInt());
        System.out.print("C(N,r) 'r' değerini giriniz :");
        setR(scanner.nextInt());
        result = calcFactoriel(getN()) / (calcFactoriel(getR()) * calcFactoriel(getN() - getR()));
        System.out.println("Sonuç = " + result);
    }

    private int calcFactoriel(int num) {
        int result = 1;
        for (int i = num; i > 0; i--) {
            result *= i;
        }
        return result;
    }


}
