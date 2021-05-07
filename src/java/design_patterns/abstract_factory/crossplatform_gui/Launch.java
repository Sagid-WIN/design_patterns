package design_patterns.abstract_factory.crossplatform_gui;

import design_patterns.abstract_factory.crossplatform_gui.factory.GUIFactory;
import design_patterns.abstract_factory.crossplatform_gui.factory.MacOSFactory;

public class Launch {
    public static void main(String[] args) {
        GUIFactory guiFactory = new MacOSFactory();
        guiFactory.createButton();
        guiFactory.createCheckbox();
    }
}
