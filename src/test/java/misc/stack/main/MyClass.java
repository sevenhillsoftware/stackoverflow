package misc.stack.main;

enum Colors {
    RED("red"), BLUE("blue");

    private String data;

    Colors(final String data) {
        this.data = data;
    }
}

enum Palette {
    BW(Colors.RED.name() + " Palette");

    private String data;

    Palette(final String data) {
        this.data = data;
    }
}

abstract class MyClass {
    public static void main(final String[] args) {
        System.out.println("Hello World");
    }
}
