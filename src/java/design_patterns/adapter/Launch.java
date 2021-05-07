package design_patterns.adapter;

import design_patterns.adapter.adapters.OracleDatabaseAdapter;
import design_patterns.adapter.application.Application;
import design_patterns.adapter.application.WebApplication;
import design_patterns.adapter.database.oracle.OracleDatabase;

public class Launch {
    public static void main(String[] args) {
        Application application = new WebApplication(new OracleDatabaseAdapter(new OracleDatabase()));
        application.findAll();
        application.remove();
        application.update();
        application.save();
    }
}
