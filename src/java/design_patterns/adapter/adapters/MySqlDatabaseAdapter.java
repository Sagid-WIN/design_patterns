package design_patterns.adapter.adapters;

import design_patterns.adapter.database.mysql.IMySqlDatabase;

/**
 * Адаптер пишет сам производитель БД
 */
public class MySqlDatabaseAdapter implements DatabaseAdapter {
    private final IMySqlDatabase mySqlDatabase;

    public MySqlDatabaseAdapter(IMySqlDatabase mySqlDatabase) {
        this.mySqlDatabase = mySqlDatabase;
    }

    @Override
    public void saveObject() {
        mySqlDatabase.insert();
    }

    @Override
    public void updateObject() {
        mySqlDatabase.update();
    }

    @Override
    public void removeObject() {
        mySqlDatabase.remove();
    }

    @Override
    public void findAll() {
        mySqlDatabase.select();
    }
}
