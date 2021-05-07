package design_patterns.abstract_factory.company_developers_application.factories;

import design_patterns.abstract_factory.company_developers_application.developers.Developer;
import design_patterns.abstract_factory.company_developers_application.managers.ProjectManager;
import design_patterns.abstract_factory.company_developers_application.testers.Tester;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
