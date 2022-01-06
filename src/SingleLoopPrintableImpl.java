import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SingleLoopPrintableImpl implements MatrixPrintable {
    @Override
    public void print(int[][] data) {
        if (data == null) {
            System.out.println("null");
        } else {
            for (int[] datum : data) {
                if (datum == null) {
                    System.out.print("null");
                } else if (datum.length == 0) {
                    System.out.print("empty");
                } else {
                    System.out.print(IntStream.of(datum).
                            mapToObj(Integer::toString).
                            collect(Collectors.joining(" ")));
                }
                System.out.println();
            }
        }
    }
}
