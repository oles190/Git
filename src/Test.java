public class Test {

    int b = 10;
    int c = 22;


    public static void main(String[] args) {

        Test test = new Test();
        System.out.println(test.sum());
    }

    public int sum() {
        return b + c;
    }
}
