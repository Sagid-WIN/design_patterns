package design_patterns.abstract_factory.company_developers_application.projects.website;

import design_patterns.abstract_factory.company_developers_application.developers.Developer;
import design_patterns.abstract_factory.company_developers_application.factories.WebSiteProjectTeamFactory;
import design_patterns.abstract_factory.company_developers_application.managers.ProjectManager;
import design_patterns.abstract_factory.company_developers_application.testers.Tester;

public class AuctionSite {
    public static void main(String[] args) {
        WebSiteProjectTeamFactory webSiteProjectTeamFactory = new WebSiteProjectTeamFactory();
        Developer developer = webSiteProjectTeamFactory.getDeveloper();
        Tester tester = webSiteProjectTeamFactory.getTester();
        ProjectManager projectManager = webSiteProjectTeamFactory.getProjectManager();

        System.out.println("launch web site auction project");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
