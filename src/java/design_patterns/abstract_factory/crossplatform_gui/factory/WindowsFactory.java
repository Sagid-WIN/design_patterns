package design_patterns.abstract_factory.crossplatform_gui.factory;

import design_patterns.abstract_factory.crossplatform_gui.buttons.WindowsButton;
import design_patterns.abstract_factory.crossplatform_gui.checkboxs.WindowsCheckbox;

import java.awt.*;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
