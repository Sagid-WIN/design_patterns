package design_patterns.decorator.security_application;

import design_patterns.decorator.security_application.compression.CompressionDataSourceDecorator;
import design_patterns.decorator.security_application.cryptography.EncryptionDecorator;
import design_patterns.decorator.security_application.datasource.DataSource;
import design_patterns.decorator.security_application.datasource.DataSourceDecorator;
import design_patterns.decorator.security_application.datasource.FileDataSource;

public class Launch {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDataSourceDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
