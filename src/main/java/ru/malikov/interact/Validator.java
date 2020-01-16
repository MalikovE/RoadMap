package ru.malikov.interact;

import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;
import java.util.Scanner;
import java.util.Set;

public class Validator implements Closeable {
    private final IO io;

    public Validator(final IO io) {
        this.io = io;
    }

    public double getDouble(String message) {
        boolean invalid = false;
        do {
            try {
                this.io.println(message);
                return Double.valueOf(this.io.read());
            } catch (NumberFormatException n) {
                n.printStackTrace();
            }
        } while (invalid);
        throw new UnsupportedOperationException();
    }

    public int getInt(String message) {
        boolean invalid = false;
        do {
            try {
                System.out.print(message);
                return Integer.valueOf(io.read());
            } catch (NumberFormatException n) {
                invalid = true;
                System.out.println("Error read of int, Please enter new one.");
            }
        } while (invalid);
        throw new UnsupportedOperationException();
    }

    public boolean compare(final String msg, final String answer) {
        System.out.print(msg);
        return answer.equals(io.read());
    }

    public int getIntFromList(final String msg, final Collection<Integer> keys) {
        boolean invalid = false;
        do {
            try {
                System.out.print(msg);
                final int result = Integer.valueOf(io.read());
                if (keys.contains(result)) {
                    return result;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException n) {
                invalid = true;
                System.out.println("Error read of int, Please enter new one.");
            }
        } while (invalid);
        throw new UnsupportedOperationException();
    }

    public String getString(String message) {
        System.out.print(message);
        return this.io.read();
    }

    @Override
    public void close() {
    }
}
