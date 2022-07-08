package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public static final String ONE = "1";
    public static final String SPACE = " ";

    public void printHalfPyramid(int cathetusLength) {
        if (cathetusLength > 0) {
            String[] pyramid = new String[cathetusLength];
            pyramid[0] = ONE;

            for (int row = 1; row < cathetusLength; row++) {
                pyramid[row] = (row + 1) + pyramid[row - 1] + (row + 1);
            }

            for (int i = 0; i < pyramid.length; i++) {
                System.out.println(SPACE.repeat(pyramid.length - i)
                        + pyramid[i]
                        + SPACE.repeat(pyramid.length - i - 1));
            }
        }
    }

    public static void main(String[] args) {
        new Pyramid().printHalfPyramid(7);
    }
}
