import Matrix.MatrixRow;

public class Main {

    public static void main(String[] args) {

        MatrixRow a = new MatrixRow(5);
        a.print();

        double[] arr = {1, 2, 3, 4, 5};
        MatrixRow b = new MatrixRow(arr);
        b.print();

        a.swap(b);

        a.print();
        b.print();

        b.add(a);
        a.mul(3);


        a.print();
        b.print();

        a.swap(b);

        b.add(a);
        a.mul(3);

        a.print();
        b.print();
    }
}
