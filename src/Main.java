public class Main {
    public static void main(String[] args) {
        Printer printer = new ConcterePrinter();
        printer.print();
        System.out.println("");
        System.out.println("********");
        Printer printerDecor =new DecoratorRightBracet(new DecoraterLefrBracet(new  ConcterePrinter()) );
        printerDecor.print();
    }
}