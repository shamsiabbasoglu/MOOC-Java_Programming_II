
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        if (size % 2 == 0) {
            throw new IllegalArgumentException("Size must be an odd number.");
        }

        MagicSquare square = new MagicSquare(size);
        int n = size;
        int[][] magicSquare = new int[n][n];

        int number = 1;
        int i = 0;
        int j = n / 2;

        while (number <= n * n) {
            magicSquare[i][j] = number;
            number++;
            int newi = (i - 1 + n) % n;
            int newj = (j + 1) % n;

            if (magicSquare[newi][newj] != 0) {
                i = (i + 1) % n;
            } else {
                i = newi;
                j = newj;
            }
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                square.placeValue(j, i, magicSquare[i][j]);
            }
        }

        return square;
    }

    public static void main(String[] args) {
        MagicSquareFactory factory = new MagicSquareFactory();
        MagicSquare square = factory.createMagicSquare(3);
        System.out.println(square);
    }
}
