import java.util.Arrays;

public class SegundoMayorMenor {
    public static void main(String[] args) {
        int[] arreglo = {5, 3, 9, 1, 6, 9, 2};

        if (arreglo.length < 2) {
            System.out.println("El arreglo debe tener al menos dos elementos");
            return;
        }

        int mayor = Integer.MIN_VALUE;
        int segundoMayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int segundoMenor = Integer.MAX_VALUE;

        for (int x : arreglo) {
            if (x > mayor) {
                segundoMayor = mayor;
                mayor = x;
            } else if (x > segundoMayor && x != mayor) {
                segundoMayor = x;
            }

            if (x < menor) {
                segundoMenor = menor;
                menor = x;
            } else if (x < segundoMenor && x != menor) {
                segundoMenor = x;
            }
        }

        System.out.println("Segundo mayor: " + segundoMayor);
        System.out.println("Segundo menor: " + segundoMenor);
    }
}
