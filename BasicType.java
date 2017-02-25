import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by zzZ on 2017/2/24.
 * @author rongyao
 */
class BasicType {

    boolean bl1 = false;
    char c1 = 'a';
    byte b1 = 11;
    short s1 = 1111;
    int i1 = 1111111;
    long l1 = 111111111L;
    float f1 = 1111.11f;
    double d1 = 111111111.11d;

    Boolean lool1 = new Boolean(bl1);
    Character ch1 = new Character(c1);
    Byte bt1 = new Byte(b1);
    Short sh1 = new Short(s1);
    Integer it1 = new Integer(i1);
    Long lo1 = new Long(l1);
    Float fl1 = new Float(f1);
    Double db1 = new Double(d1);

    Boolean lool2 = true;
    Character ch2 = 'm';
    Byte bt2 = 22;
    Short sh2 = 2222;
    Integer it2 = 2222222;
    Long lo2 = 222222222L;
    Float fl2 = 2222.22f;
    Double db2 = 222222222.22d;

    boolean bl2 = lool2;
    char c2 = ch2;
    byte b2 = bt2;
    short s2 = sh2;
    int i2 = it2;
    long l2 = lo2;
    float f2 = fl2;
    double d2 = db2;

    public void no1Increment() {
        bl1 = true;
        c1++;
        b1++;
        s1++;
        i1++;
        l1++;
        f1++;
        d1++;
    }

    public void no2Increment() {
        lool1 = true;
        ch1++;
        bt1++;
        sh1++;
        it1++;
        lo1++;
        fl1++;
        db1++;
    }

    public void no3Increment() {
        bl2 = false;
        c2++;
        b2++;
        s2++;
        i2++;
        l2++;
        f2++;
        d2++;
    }

    public void no4Increment() {
        lool2 = false;
        ch2++;
        bt2++;
        sh2++;
        it2++;
        lo2++;
        fl2++;
        db2++;
    }
}
