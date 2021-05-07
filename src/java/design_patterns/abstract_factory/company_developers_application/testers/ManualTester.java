package design_patterns.abstract_factory.company_developers_application.testers;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester, test code");
    }
}
