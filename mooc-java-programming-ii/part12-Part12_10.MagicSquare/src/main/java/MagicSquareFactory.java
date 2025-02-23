
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        int x = size / 2;
        int y = 0;

        for (int i = 1; i <= size * size; i++) {
            square.placeValue(x, y, i);
            int newX = (x + 1) % size;
            int newY = (y - 1 + size) % size;
            if (square.readValue(newX, newY) != 0) {
                newX = x;
                newY = y + 1;
            }

            x = newX;
            y = newY;

        }
        return square;

    }
}
