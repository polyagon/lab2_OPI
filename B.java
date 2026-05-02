public class B implements C {

    private int f = 1;

    private String b = "hello";

    public void bb() {
        System.out.println(42);
    }

    public Object rr() {
        return null;
    }

    public int[] ii() {
        return new int[]{0, 1, 2, 3, 4};
    }

    public Object pp() {
        return this;
    }

    public java.lang.Class qq() {
        return getClass();
    }

    public void aa() {
        System.out.println("void aa");
    }

    public double ad() {
        return 11.09;
    }
}
