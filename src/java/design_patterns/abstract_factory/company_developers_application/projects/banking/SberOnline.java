package design_patterns.abstract_factory.company_developers_application.projects.banking;

import design_patterns.abstract_factory.company_developers_application.developers.Developer;
import design_patterns.abstract_factory.company_developers_application.factories.BankingProjectTeamFactory;
import design_patterns.abstract_factory.company_developers_application.managers.ProjectManager;
import design_patterns.abstract_factory.company_developers_application.projects.website.AuctionSite;
import design_patterns.abstract_factory.company_developers_application.testers.Tester;

public class SberOnline {
    public static void main(String[] args) {
        BankingProjectTeamFactory bankingProjectTeamFactory = new BankingProjectTeamFactory();
        Developer developer = bankingProjectTeamFactory.getDeveloper();
        Tester tester = bankingProjectTeamFactory.getTester();
        ProjectManager projectManager = bankingProjectTeamFactory.getProjectManager();

        System.out.println("launch developers banking application project");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

        System.out.println("--------------------------------------------------------");
        AuctionSite.main(new String[]{});
    }
}
