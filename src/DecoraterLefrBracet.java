public class DecoraterLefrBracet extends Decorator {
    public DecoraterLefrBracet(Printer printer) {
        super(printer);
    }@Override
    public void print() {
        System.out.print("[");
        printer.print();
    }
}
