/**
 * Created by zzZ on 2017/2/24.
 * @author rongyao
 */
public class Incrementable {
    StaticTest st1 = new StaticTest();
    StaticTest st2 = new StaticTest();
    StaticTest st3 = new StaticTest();

    public static void main(String args[]) {
        Incrementable it = new Incrementable();
        System.out.println("st1.i=" + it.st1.i + ";st2.i=" + it.st2.i + ";st3.i=" + it.st3.i + ";StaticTest.i=" + StaticTest.i);
        increment();
        System.out.println("st1.i=" + it.st1.i + ";st2.i=" + it.st2.i + ";st3.i=" + it.st3.i + ";StaticTest.i=" + StaticTest.i);
        increment();
        System.out.println("st1.i=" + it.st1.i + ";st2.i=" + it.st2.i + ";st3.i=" + it.st3.i + ";StaticTest.i=" + StaticTest.i);
        increment();
        System.out.println("st1.i=" + it.st1.i + ";st2.i=" + it.st2.i + ";st3.i=" + it.st3.i + ";StaticTest.i=" + StaticTest.i);
    }

    static void increment() {
        StaticTest.i++;
    }
}

