package design_patterns.template_method.web;

public abstract class WebsiteTemplate {
    public void show() {
        System.out.println("header");
        showPageContent();
        System.out.println("footer");
    }

    protected abstract void showPageContent();
}
