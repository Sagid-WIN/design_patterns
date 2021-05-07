package design_patterns.abstract_factory.company_developers_application.factories;

import design_patterns.abstract_factory.company_developers_application.developers.Developer;
import design_patterns.abstract_factory.company_developers_application.developers.JavaDeveloper;
import design_patterns.abstract_factory.company_developers_application.managers.BankingPM;
import design_patterns.abstract_factory.company_developers_application.managers.ProjectManager;
import design_patterns.abstract_factory.company_developers_application.testers.QATester;
import design_patterns.abstract_factory.company_developers_application.testers.Tester;

public class BankingProjectTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
