import java.util.Scanner;

public class NotasEscolares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[8];

    
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a " + (i+1) + "ª nota: ");
            notas[i] = sc.nextDouble();
        }

        double b1 = (notas[0] + notas[1]) / 2;
        double b2 = (notas[2] + notas[3]) / 2;
        double b3 = (notas[4] + notas[5]) / 2;
        double b4 = (notas[6] + notas[7]) / 2;

      
        double s1 = (b1 + b2) / 2;
        double s2 = (b3 + b4) / 2;
        double mediaFinal = (s1 + s2) / 2;

    
        String resultado = String.format("""
            \n--- Resultados ---
            1 Bimestre: %.2f
            2 Bimestre: %.2f
            1 Semestre: %.2f
            3 Bimestre: %.2f
            4 Bimestre: %.2f
            2 Semestre: %.2f
            ----------------------
            Media Final: %.2f
            """, b1, b2, s1, b3, b4, s2, mediaFinal);

        System.out.println(resultado);

        sc.close();
    }
}