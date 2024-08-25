package tp03.ej05;

public class B extends A {
    public void print(Number num) {
        System.out.println(MESSAGE.formatted("B","Number",num,num.getClass()));
    }
}
