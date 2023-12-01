package decorator;

public class ComponentBehave_04 implements Component{
    private Component component;
    public ComponentBehave_04(Component component) {
        this.component = component;
    }

    @Override
    public void doSomething(String s) {
        s = "[4 " + s + " Behave04]";
        component.doSomething(s);
    }
}
