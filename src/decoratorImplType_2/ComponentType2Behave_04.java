package decoratorImplType_2;
public class ComponentType2Behave_04 extends ComponentType2BaseBehave {
    ComponentType2BaseBehave componentBaseBehave;
    public ComponentType2Behave_04(ComponentType2BaseBehave componentBaseBehave){
        this.componentBaseBehave = componentBaseBehave;
    }
    @Override
    public void doSomething(String s) {
        s = "[4 " + s + " Behave04]";
        componentBaseBehave.doSomething(s);
    }
}
