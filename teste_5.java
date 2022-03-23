package Direct_5;

public class teste_5 {
    public static void main(String[] args) {

        // identidicando que a variavel é um Array "[]"
        int[] idades = new int[10]; // Criando um Array de 10 posições; ;
        idades[0] = 27; // Arrays começam com 0;
        idades[1] = 31;
        System.out.println("idade 0: " + idades[0]);
        System.out.println("idade 1: " + idades[1]);
        System.out.println("idade 2: " + idades[2]); // apararecerá zero, pois ela n foi definida;

        int[] i = {10, 25}; // aparecerá correto pois as duas estão sendo definidas;
        System.out.println("i 0: " + i[0]);
        System.out.println("i 1: " + i[1]);

        int[] k = new int[]{1, 2, 3}; // aqui funcionará corretamente;
        System.out.println(" k 0: " + k[0]);
        System.out.println(" k 1: " + k[1]);
        System.out.println(" k 2: " + k[2]);

        int[] j = new int[2]; // aqui não foi definido um valor inicial;
        System.out.println("j 0: " + j[0]);

        idades = new int[]{12, 35, 45, 22, 9, 37, 51, 61};

        for (int idade : idades) { // forech onde os dados iram para a variavel "idade";
            System.out.println("idade: " + idade);

        }
        for (int a = 0; a < idades.length; a++) { // for classico; inicio controle e incremento;
            int idade = idades[a];
            System.out.println("idade: " + idade + "maior que 18 anos!");
        }
        for (int a = 0; a < idades.length; a++) {
            int idade = idades[a];
            if (idade >= 10) {
                System.out.println("idade: " + idade + "maior que 18 anos!");
            }
        }
        long[][] a = new long[3][3]; // matriz de matriz;

        // exemplo jogo da velha;
        char[][] jogo = new char[3][3];
        jogo[0][0] = 'X';
        jogo[2][1] = '0';
        System.out.println(" posição 0 : " + jogo[0][0]);
        System.out.println(" posição 3 : " + jogo[2][1]);

        int[][][] b = new int[3][3][3];
        b[0][0][0] = 10;
        b[1][1][0] = 35;

        int[][] c = new int[][]{{1, 2}, {3, 4}};
        int[][] t = {{5, 6}, {7, 0}};


    }
}