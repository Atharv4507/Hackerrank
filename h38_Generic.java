public class h38_Generic {
    public static void main(String[] args) {
        Integer i[] = {1,2,3};
        String str[] = {"Hello","World"};
        printer(i);
        printer(str);

    }
    public static <E> void printer(E[] p){
        for (E e : p) {
            System.out.println(e);
        }
    }
}
