package design_patterns.factory_method.factory;

import design_patterns.factory_method.developer.CppDeveloper;
import design_patterns.factory_method.developer.Developer;

public class CppFactoryDeveloper implements FactoryDeveloper {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
