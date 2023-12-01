package decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        var behave1and2 = new ComponentBehave_01(new ComponentBehave_02(new ComponentBaseBehave()));
        behave1and2.doSomething("(Hi)");

        var base = new ComponentBaseBehave();
        var behave4 = new ComponentBehave_04(base);
        var behave3 = new ComponentBehave_03(behave4);
        var behave1 = new ComponentBehave_01(behave3);
        behave1.doSomething("(bay)");
    }
}
