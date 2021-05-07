package design_patterns.factory_method.factory;

import design_patterns.factory_method.developer.Developer;
import design_patterns.factory_method.developer.JavaDeveloper;

public class JavaFactoryDeveloper implements FactoryDeveloper {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
