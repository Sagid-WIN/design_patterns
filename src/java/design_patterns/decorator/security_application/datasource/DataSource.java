package design_patterns.decorator.security_application.datasource;

public interface DataSource {
    void writeData(String data);
    String readData();
}
