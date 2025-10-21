public class oop_exe {
    static void add(oop obj){
         obj.number+=10;
    }

    public static void main(String[] args) {
        oop obj = new oop();
         add(obj);
        System.out.println(obj.number);
    }
}
