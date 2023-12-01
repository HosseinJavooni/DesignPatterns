package decoratorImplType_2;

public class ComponentType2Behave_02 extends ComponentType2BaseBehave {
    ComponentType2BaseBehave componentBaseBehave;
    public ComponentType2Behave_02(ComponentType2BaseBehave componentBaseBehave){
        this.componentBaseBehave = componentBaseBehave;
    }
    @Override
    public void doSomething(String s) {
        s = "[2 " + s + " Behave02]";
        componentBaseBehave.doSomething(s);
    }
}
