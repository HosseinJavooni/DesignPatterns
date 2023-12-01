package decoratorImplType_2;

public class DecoratorMain {
    public static void main(String[] args) {
        var behave1and2 = new ComponentType2Behave_01(new ComponentType2Behave_02(new ComponentType2BaseBehave()));
        behave1and2.doSomething("(Hi)");

        var base = new ComponentType2BaseBehave();
        var behave4 = new ComponentType2Behave_04(base);
        var behave3 = new ComponentType2Behave_03(behave4);
        var behave1 = new ComponentType2Behave_01(behave3);
        behave1.doSomething("(bay)");
    }
}
