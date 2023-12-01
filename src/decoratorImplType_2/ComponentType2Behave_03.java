package decoratorImplType_2;
public class ComponentType2Behave_03 extends ComponentType2BaseBehave {
    ComponentType2BaseBehave componentBaseBehave;
    public ComponentType2Behave_03(ComponentType2BaseBehave componentBaseBehave){
        this.componentBaseBehave = componentBaseBehave;
    }
    @Override
    public void doSomething(String s) {
        s = "[3 " + s + " Behave03]";
        componentBaseBehave.doSomething(s);
    }
}
