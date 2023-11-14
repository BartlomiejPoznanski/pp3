public class C2 {
    public int counter=0;

    public void increase(){
        counter++;
    }

    public void decrease(){
        counter--;
    }
    public void increase(int n){
        counter=counter+n;
    }
    public void decrease(int n){
        counter=counter-n;
    }
    public int value(){
        return counter;
    }
    public static void main(String[] args) {
        C2 o = new C2();
        System.out.println(o.value());
        o.increase();
        System.out.println(o.value());
        o.increase();
        System.out.println(o.value());
        o.decrease();
        System.out.println(o.value());
        o.increase(5);
        System.out.println(o.value());
        o.decrease(2);
        System.out.println(o.value());
    }
}
