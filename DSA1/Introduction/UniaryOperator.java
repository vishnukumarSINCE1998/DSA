package Introduction;

public class UniaryOperator {
    public static void main(String Args[]){
        int a=100;
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(++a);
        System.out.println(--a);

        int b=a--;
        System.out.println(a++);
        System.out.println(b);

        System.out.println(a++ + a++);
        System.out.println(--a - --a);

    }
}
