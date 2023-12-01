package decorator;

public class ComponentBehave_03 implements Component{
    Component component;

    public ComponentBehave_03(Component component) {
        this.component = component;
    }

    @Override
    public void doSomething(String s) {
        s = "[3 " + s + " Behave03]";
        component.doSomething(s);
    }
}
