import java.util.Scanner;

public class MMQ {

    Scanner sc = new Scanner(System.in);

    private int n; //quantidade de números (de X ou de Y)
    private int[] g1g1; // x^4
    private int[] g1g2; // x^3
    private int[] g1g3; // x^2
    private int[] g2g3; // x
    private int[] g3g3; // 1
    private int[] g1y;  // x²y
    private int[] g2y;  // xy
    private int[] g3y;  // y

    private int[] x;
    private int[] y;

    public MMQ(int n) {
        setAllFields(n); setXandYvalues(n); setAllValues(); showTable();
    }

    // Setando o tamanho dos vetores da tabela (exceto X e Y)
    private void setAllFields(int tamanho) {
        this.g1g1 = new int[tamanho];
        this.g1g2 = new int[tamanho];
        this.g1g3 = new int[tamanho];
        this.g2g3 = new int[tamanho];
        this.g3g3 = new int[tamanho];
        this.g1y = new int[tamanho];
        this.g2y = new int[tamanho];
        this.g3y = new int[tamanho];
    }

    // Setando o tamanho e os valores de X e Y
    private void setXandYvalues(int tamanho) {
        x = new int[tamanho];y = new int[tamanho];
        for (int i = 0; i < x.length; i++) {
            System.out.print("Digite o valor de X: "); x[i] = sc.nextInt();
            System.out.print("Digite o valor de Y: "); y[i] = sc.nextInt();
        }
    }

    // Preenchendo os vetores da tabela (exceto X e Y)
    private void setAllValues() {
        for (int i = 0; i < x.length; i++) {
            this.g1g1[i] = (int)Math.pow(x[i], 4);
            this.g1g2[i] = (int)Math.pow(x[i], 3);
            this.g1g3[i] = (int)Math.pow(x[i], 2);
            this.g2g3[i] = x[i];
            this.g3g3[i] = 1;
            this.g1y[i] = (int)Math.pow(x[i], 2) * y[i];
            this.g2y[i] = x[i] * y[i];
            this.g3y[i] = y[i];
        }
    }

    // Mostra a tabela (não é algo bonito, mas está funcional :/  )
    private void showTable() {

        System.out.print("X  ||  ");
        System.out.print("Y  ||  ");
        System.out.print("g1g1  ||  ");
        System.out.print("g1g2  ||  ");
        System.out.print("g1g3  ||  ");
        System.out.print("g2g3  ||  ");
        System.out.print("g3g3  ||  ");
        System.out.print("g1y  ||  ");
        System.out.print("g2y  ||  ");
        System.out.println("g3y");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "  ||  ");
            System.out.print(y[i] + "  ||  ");
            System.out.print(g1g1[i] + "  ||  ");
            System.out.print(g1g2[i] + "  ||  ");
            System.out.print(g1g3[i] + "  ||  ");
            System.out.print(g2g3[i] + "  ||  ");
            System.out.print(g3g3[i] + "  ||  ");
            System.out.print(g1y[i] + "  ||  ");
            System.out.print(g2y[i] + "  ||  ");
            System.out.println(g3y[i]);
        }
    }

}