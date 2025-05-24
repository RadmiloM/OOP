public class MessagePrinter {

    public void printMessage(String message) {
        System.out.println("Printing the message " + message);
    }

    public static void main(String[] args) {
        MessagePrinter messagePrinter = new MessagePrinter();
        messagePrinter.printMessage("Hello World");
    }
}
