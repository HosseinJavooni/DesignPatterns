package decoratorImplType_2;

public class ComponentType2Behave_01 extends ComponentType2BaseBehave {
    ComponentType2BaseBehave componentBaseBehave;
    public ComponentType2Behave_01(ComponentType2BaseBehave componentBaseBehave){
        this.componentBaseBehave = componentBaseBehave;
    }
    @Override
    public void doSomething(String s) {
        s = "[1 " + s + " Behave01]";
        componentBaseBehave.doSomething(s);
    }
}
