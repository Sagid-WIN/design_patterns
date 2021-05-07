package design_patterns.abstract_factory.company_developers_application.managers;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Web Site PM, manage web site");
    }
}
