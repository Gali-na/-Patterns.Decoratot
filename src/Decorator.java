public abstract class Decorator implements Printer {
    Printer printer;

    public Decorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print() {

    }
}
