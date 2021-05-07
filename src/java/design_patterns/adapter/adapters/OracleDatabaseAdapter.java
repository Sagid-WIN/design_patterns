package design_patterns.adapter.adapters;

import design_patterns.adapter.database.oracle.IOracleDatabase;

/**
 * Адаптер пишет сам производитель БД
 */
public class OracleDatabaseAdapter implements DatabaseAdapter {
    private final IOracleDatabase oracleDatabase;

    public OracleDatabaseAdapter(IOracleDatabase oracleDatabase) {
        this.oracleDatabase = oracleDatabase;
    }

    @Override
    public void saveObject() {
        oracleDatabase.insertElement();
    }

    @Override
    public void updateObject() {
        oracleDatabase.updateElement();
    }

    @Override
    public void removeObject() {
        oracleDatabase.removeElement();
    }

    @Override
    public void findAll() {
        oracleDatabase.getAll();
    }
}
