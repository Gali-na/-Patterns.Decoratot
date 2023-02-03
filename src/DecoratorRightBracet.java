public class DecoratorRightBracet extends Decorator {
    public DecoratorRightBracet(Printer printer) {
        super(printer);
    }

    @Override
    public void print() {
        printer.print();
        System.out.println("]");
    }
}
