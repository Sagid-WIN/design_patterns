package design_patterns.abstract_factory.crossplatform_gui.factory;

import java.awt.*;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
