package design_patterns.factory_method.factory.enum_factory;

public enum EnumFactoryDeveloper {
    CppFactoryDeveloper("cpp"), CSharpFactoryDeveloper("csharp"), JavaFactoryDeveloper("java");

    String factoryName;
    public static EnumFactoryDeveloper getFactoryDeveloperByName(String factoryName) {
        for (EnumFactoryDeveloper enumFactoryDeveloper: values()) {
            if (enumFactoryDeveloper.factoryName.equals(factoryName)) {
                return enumFactoryDeveloper;
            }
        }
        throw new RuntimeException("Not found EnumFactoryDeveloper with name " + factoryName);
    }
    EnumFactoryDeveloper(String nameFactory) {
        this.factoryName = nameFactory;
    }
}
