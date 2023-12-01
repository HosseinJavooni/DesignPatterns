package decorator;

public class ComponentBehave_01 implements Component{
    Component component;
    public ComponentBehave_01(Component component){
        this.component = component;
    }
    @Override
    public void doSomething(String s) {
        s = "[1 " + s + " Behave01]";
        component.doSomething(s);
    }
}
