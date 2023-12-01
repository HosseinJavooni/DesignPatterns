package decorator;

public class ComponentBehave_02 implements Component{
    Component component;

    public ComponentBehave_02(Component component) {
        this.component = component;
    }

    @Override
    public void doSomething(String s) {
        s = "[2 " + s + " Behave02]";
        component.doSomething(s);
    }
}
