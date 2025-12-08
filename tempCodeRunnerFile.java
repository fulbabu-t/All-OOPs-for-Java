
class G {
    int a=10;
}
class Y extends G {
    int a=20;
   void show() {
        System.out.println( a);
        System.out.println(super.a);
    }
}
class T {
    public static void main(String[] args) {
        Y r=new Y();
        r.show();
    }
}