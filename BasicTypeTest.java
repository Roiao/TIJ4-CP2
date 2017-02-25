/**
 * Created by zzZ on 2017/2/24.
 */
public class BasicTypeTest {
    private BasicType bt;

    public static void main(String args[]) {
        BasicTypeTest btt = new BasicTypeTest();
        btt.printValue(btt.bt);

        btt.bt.no1Increment();
        btt.printValue(btt.bt);

        btt.bt.no2Increment();
        btt.printValue(btt.bt);

        btt.bt.no3Increment();
        btt.printValue(btt.bt);

        btt.bt.no4Increment();
        btt.printValue(btt.bt);
    }

    public BasicTypeTest() {
        bt = new BasicType();
    }

    private void printValue(BasicType bt) {
        System.out.println("NO.1 >>>> bl1   = " + bt.bl1
                + "; c1 =  " + bt.c1
                + "; b1 =  " + bt.b1
                + "; s1 =  " + bt.s1
                + "; i1 =  " + bt.i1
                + "; l1 =  " + bt.l1
                + "; f1 =  " + bt.f1
                + "; d1 =  " + bt.d1
        );

        System.out.println("NO.2 >>>> lool1 = " + bt.lool1
                + "; ch1 = " + bt.ch1
                + "; bt1 = " + bt.bt1
                + "; sh1 = " + bt.sh1
                + "; it1 = " + bt.it1
                + "; lt1 = " + bt.lo1
                + "; fl1 = " + bt.fl1
                + "; db1 = " + bt.db1
        );

        System.out.println("NO.3 >>>> bl2   = " + bt.bl2
                + ";  c2 =  " + bt.c2
                + "; b2 =  " + bt.b2
                + "; s2 =  " + bt.s2
                + "; i2 =  " + bt.i2
                + "; l2 =  " + bt.l2
                + "; f2 =  " + bt.f2
                + "; d2 =  " + bt.d2
        );

        System.out.println("NO.4 >>>> lool2 = " + bt.lool2
                + ";  ch2 = " + bt.ch2
                + "; bt2 = " + bt.bt2
                + "; sh2 = " + bt.sh2
                + "; it2 = " + bt.it2
                + "; lt2 = " + bt.lo2
                + "; fl2 = " + bt.fl2
                + "; db2 = " + bt.db2 + "\n"
        );
    }
}
/*    boolean bl1  =  false;
    char c1  =  'x';
    byte b1  =  11;
    short s1  =  1111;
    int i1  =  1111111;
    long l1  =  111111111L;
    float f1  =  1111.11f;
    double d1  =  111111111.11d;

    Boolean lool1  =  new Boolean(bl1);
    Character ch1  =  new Character(c1);
    Byte bt1  =  new Byte(b1);
    Short sh1  =  new Short(s1);
    Integer it1  =  new Integer(i1);
    Long lo1  =  new Long(l1);
    Float fl1  =  new Float(f1);
    Double db1  =  new Double(d1);

    Boolean lool2  =  true;
    Character ch2  =  'Y';
    Byte bt2  =  22;
    Short sh2  =  2222;
    Integer it2  =  2222222;
    Long lo2  =  222222222L;
    Float fl2  =  2222.22f;
    Double db2  =  222222222.22d;

    boolean bl2  =  lool2;
    char c2  =  ch2;
    byte b2  =  bt2;
    short s2  =  sh2;
    int i2  =  it2;
    long l2  =  lo2;
    float f2  =  fl2;
    double d2  =  db2;*/