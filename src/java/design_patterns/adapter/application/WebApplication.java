package design_patterns.adapter.application;

import design_patterns.adapter.adapters.DatabaseAdapter;

public class WebApplication implements Application {
    private DatabaseAdapter databaseAdapter;

    public WebApplication(DatabaseAdapter databaseAdapter) {
        this.databaseAdapter = databaseAdapter;
    }

    @Override
    public void save() {
        databaseAdapter.saveObject();
    }

    @Override
    public void update() {
        databaseAdapter.updateObject();
    }

    @Override
    public void remove() {
        databaseAdapter.removeObject();
    }

    @Override
    public void findAll() {
        databaseAdapter.findAll();
    }
}
