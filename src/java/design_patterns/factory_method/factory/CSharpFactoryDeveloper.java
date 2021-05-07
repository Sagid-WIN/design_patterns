package design_patterns.factory_method.factory;

import design_patterns.factory_method.developer.CSharpDeveloper;
import design_patterns.factory_method.developer.Developer;

public class CSharpFactoryDeveloper implements FactoryDeveloper {
    @Override
    public Developer createDeveloper() {
        return new CSharpDeveloper();
    }
}
