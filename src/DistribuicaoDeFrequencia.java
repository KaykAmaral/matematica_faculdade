import java.util.Arrays;
import java.util.Scanner;

public class DistribuicaoDeFrequencia {

    Scanner sc = new Scanner(System.in);

    private Integer[] TP; // Tabela Primitiva (vou transformar a tabela em rol)
    private Integer AA; // Amplitude da Amostra
    private Integer n; // Número de Itens
    private Integer k; // Número de Classes
    private Integer h; // Amplitude de Classe
    private Integer AT; // Amplitude Total

    public DistribuicaoDeFrequencia(Integer n) {
        setN(n); setTP(); calculateAll();
    }

    private void calculateAll() {
        Arrays.sort(TP);
        setAA(TP[getN()-1] - TP[0]);
        setK((int)Math.round(1 + (3.3 * Math.log10(getN()))));
        setH((int)Math.round(0.5 + (double) getAA() /getK()));
        setAT(getK()*getH());

        System.out.println("AA = " + getAA());
        System.out.println("n  = " + getN());
        System.out.println("k  = " + getK());
        System.out.println("h  = " + getH());
        System.out.println("AT = " + getAT());
    }

    private void setTP() {
        TP = new Integer[getN()];
        for (int i = 0; i < TP.length; i++) {
            System.out.print("n" + (i + 1) + ": ");
            TP[i] = sc.nextInt();
        }
    }
    private void setAA(Integer AA) { this.AA = AA; }
    private void setN(Integer n) { this.n = n; }
    private void setK(Integer k) { this.k = k; }
    private void setH(Integer h) { this.h = h; }
    private void setAT(Integer AT) { this.AT = AT; }

    private Integer getAA() { return this.AA; }
    private Integer getN(){ return this.n; }
    private Integer getK() { return this.k; }
    private Integer getH(){ return this.h; }
    private Integer getAT() { return this.AT; }

}