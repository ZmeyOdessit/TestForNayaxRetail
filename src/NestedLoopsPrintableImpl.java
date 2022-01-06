public class NestedLoopsPrintableImpl implements MatrixPrintable {
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
                    for (int i : datum) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
