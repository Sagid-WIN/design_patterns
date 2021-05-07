package design_patterns.abstract_factory.company_developers_application.factories;

import design_patterns.abstract_factory.company_developers_application.developers.Developer;
import design_patterns.abstract_factory.company_developers_application.developers.PhpDeveloper;
import design_patterns.abstract_factory.company_developers_application.managers.ProjectManager;
import design_patterns.abstract_factory.company_developers_application.managers.WebSitePM;
import design_patterns.abstract_factory.company_developers_application.testers.ManualTester;
import design_patterns.abstract_factory.company_developers_application.testers.Tester;

public class WebSiteProjectTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSitePM();
    }
}
