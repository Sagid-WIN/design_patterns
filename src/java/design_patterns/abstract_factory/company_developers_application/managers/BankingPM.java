package design_patterns.abstract_factory.company_developers_application.managers;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM, manage banking project");
    }
}
