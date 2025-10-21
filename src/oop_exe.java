public class oop_exe {
    static int add(oop obj){
        return obj.number+=10;
    }

    public static void main(String[] args) {
        oop obj = new oop();
        int a = add(obj);
        System.out.println(a);
    }
}
