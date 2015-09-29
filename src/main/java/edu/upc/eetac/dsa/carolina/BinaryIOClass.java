package edu.upc.eetac.dsa.carolina;

import java.io.*;

/**
 * Created by Carolina on 29/09/2015.
 */
public class BinaryIOClass {
    private int integer;
    private double decimal;
    private char character;

    public BinaryIOClass(int integer, double decimal, char character) {
        this.integer = integer;
        this.decimal = decimal;
        this.character = character;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public int getInteger() {
        return integer;
    }

    public double getDecimal() {
        return decimal;
    }

    public char getCharacter() {
        return character;
    }

    public void saveToFile(String filename) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
        dos.writeInt(integer);
        dos.writeDouble(decimal);
        dos.writeChar(character);
        dos.close();
    }

    public final static BinaryIOClass readFromFile(String filename) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream(filename));
        int integer = dis.readInt();
        double decimal = dis.readDouble();
        char character = dis.readChar();

        return new BinaryIOClass(integer, decimal, character);
    }
}
