package ru.malikov.interact;

import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleIO implements IO {
    private final Scanner scanner;
    private final PrintStream out;

    public ConsoleIO(final Scanner scanner, final PrintStream out) {
        this.scanner = scanner;
        this.out = out;
    }

    @Override
    public String read() {
        return this.scanner.next();
    }

    @Override
    public void println(Object value) {
        this.out.println(value);
    }
}
