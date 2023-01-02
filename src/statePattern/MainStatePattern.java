package statePattern;

import statePattern.states.Button;
import statePattern.states.Ebotton;
import statePattern.states.FButton;
import statePattern.states.Gbutton;

public class MainStatePattern {
    public static void main(String[] args) {
        Button button = new Button();
        Ebotton ebotton = new Ebotton();
        FButton fButton = new FButton();
        Gbutton gbutton = new Gbutton();

        button.setState(ebotton);
        button.pressButton();
        button.releaseButton();

        button.setState(fButton);
        button.pressButton();
        button.releaseButton();

        button.setState(gbutton);
        button.pressButton();
        button.releaseButton();
    }
}
