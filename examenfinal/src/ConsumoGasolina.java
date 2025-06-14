public class ConsumoGasolina {

    public static int contarConsumosAltos(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int consumo : fila) {
                if (consumo > 8) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static double promedioConsumoModerado(int[][] matriz) {
        int suma = 0;
        int contador = 0;
        for (int[] fila : matriz) {
            for (int consumo : fila) {
                if (consumo >= 4 && consumo <= 7) {
                    suma += consumo;
                    contador++;
                }
            }
        }
        return contador > 0 ? (double) suma / contador : 0.0;
    }

    public static void imprimirConsumoBajo(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 3) {
                    System.out.println("Consumo bajo de " + matriz[i][j] + " galones en posición [" + i + "][" + j + "]");
                }
            }
        }
    }

    public static int[] posicionConsumoMaximo(int[][] matriz) {
        int max = matriz[0][0];
        int[] posicion = {0, 0};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
        return posicion;
    }

    public static int totalConsumo(int[][] matriz) {
        int total = 0;
        for (int[] fila : matriz) {
            for (int consumo : fila) {
                total += consumo;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[][] consumo = {
            {2, 5, 9},
            {3, 7, 8},
            {1, 10, 6}
        };

        System.out.println("Consumos altos (>8): " + contarConsumosAltos(consumo));
        System.out.println("Promedio consumo moderado (4-7): " + promedioConsumoModerado(consumo));
        imprimirConsumoBajo(consumo);

        int[] posMax = posicionConsumoMaximo(consumo);
        System.out.println("Mayor consumo en posición: [" + posMax[0] + "][" + posMax[1] + "]");

        // BONUS
        System.out.println("Total de galones consumidos: " + totalConsumo(consumo));
    }
}
 