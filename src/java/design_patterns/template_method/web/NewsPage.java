package design_patterns.template_method.web;

public class NewsPage extends WebsiteTemplate {
    @Override
    protected void showPageContent() {
        System.out.println("@dikpik new page@");
    }
}
