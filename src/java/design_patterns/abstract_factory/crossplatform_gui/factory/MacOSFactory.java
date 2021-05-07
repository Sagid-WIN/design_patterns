package design_patterns.abstract_factory.crossplatform_gui.factory;

import design_patterns.abstract_factory.crossplatform_gui.buttons.MacOSButton;
import design_patterns.abstract_factory.crossplatform_gui.checkboxs.MacOSCheckbox;

import java.awt.*;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
