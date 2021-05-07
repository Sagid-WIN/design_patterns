package design_patterns.template_method.web;

public class WelcomePage extends WebsiteTemplate {
    @Override
    protected void showPageContent() {
        System.out.println("@dikpik@");
    }
}
