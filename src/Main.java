public class Main {
    public static void main(String[] args) {
        int[][] data = null;
        if (Math.random() < 0.5) {
            NestedLoopsPrintableImpl nest = new NestedLoopsPrintableImpl();
            nest.print(data);
        } else {
            SingleLoopPrintableImpl single = new SingleLoopPrintableImpl();
            single.print(data);
        }

    }
}
