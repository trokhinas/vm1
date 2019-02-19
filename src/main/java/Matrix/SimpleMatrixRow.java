package Matrix;

import java.util.Arrays;

public abstract class SimpleMatrixRow {
    protected int size;
    protected double[] elements;

    public SimpleMatrixRow(int size) {
        this.size = size;
        elements = new double[size];
    }

    public double[] getElements() {
        return elements;
    }

    public int getSize() {
        return size;
    }

    public SimpleMatrixRow(double[] array) {
        this.size = array.length;
        elements = array.clone();
    }

    public void mul(double x) {
        var stream = Arrays.stream(elements);

        elements = stream
                .map(elem -> elem * x)
                .toArray();
    }

    public void add(SimpleMatrixRow row) {
        if (size != row.size)
            return;

        for (int i = 0; i < size; i++) {
            elements[i] += row.elements[i];
        }
    }



    public double get(int index) {
        return elements[index];
    }

    public void swap(SimpleMatrixRow row) {
        if(size != row.size)
            return;

        double[] temp = row.elements.clone();
        row.elements = elements.clone();
        elements = temp.clone();
    }

    public void print() {
        System.out.println("Row size is " + size);
        for (var elem : elements) {
            System.out.printf("|%-5.2f|", elem);
        }
        System.out.println('\n');
    }
}
