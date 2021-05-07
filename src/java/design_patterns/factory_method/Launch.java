package design_patterns.factory_method;

import design_patterns.factory_method.factory.CSharpFactoryDeveloper;
import design_patterns.factory_method.factory.CppFactoryDeveloper;
import design_patterns.factory_method.factory.FactoryDeveloper;
import design_patterns.factory_method.factory.JavaFactoryDeveloper;
import design_patterns.factory_method.factory.enum_factory.EnumFactoryDeveloper;

import java.util.HashMap;
import java.util.Locale;

public class Launch {
    private static HashMap<EnumFactoryDeveloper, FactoryDeveloper> factoryDeveloper;

    public static void init() {
        factoryDeveloper = new HashMap<>();
        factoryDeveloper.put(EnumFactoryDeveloper.CppFactoryDeveloper, new CppFactoryDeveloper());
        factoryDeveloper.put(EnumFactoryDeveloper.JavaFactoryDeveloper, new JavaFactoryDeveloper());
        factoryDeveloper.put(EnumFactoryDeveloper.CSharpFactoryDeveloper, new CSharpFactoryDeveloper());
    }
    public static void main(String[] args) {
        init();
        FactoryDeveloper factoryDeveloper = createDeveloperFactoryBySpecialty("csharp");
        factoryDeveloper.createDeveloper().writeCode();
    }

    public static FactoryDeveloper createDeveloperFactoryBySpecialty(String specialty) {
        return factoryDeveloper.get(EnumFactoryDeveloper.getFactoryDeveloperByName(specialty.toLowerCase(Locale.ROOT)));
    }
}
