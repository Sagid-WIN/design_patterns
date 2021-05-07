package design_patterns.template_method;

import design_patterns.template_method.web.NewsPage;
import design_patterns.template_method.web.WelcomePage;
import design_patterns.template_method.web.WebsiteTemplate;

public class Launch {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.show();
        System.out.println("-------");
        newsPage.show();
    }
}
