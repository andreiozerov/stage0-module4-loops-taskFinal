package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public static final String ASTERISK = "*";
    public static final String SPACE = " ";

    public void printHalfPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            System.out.println(SPACE.repeat(i) + ASTERISK.repeat(cathetusLength - i));
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
