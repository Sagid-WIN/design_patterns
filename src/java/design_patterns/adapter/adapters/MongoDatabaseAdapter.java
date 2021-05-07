package design_patterns.adapter.adapters;

import design_patterns.adapter.database.mongo.IMongoDatabase;

/**
 * Адаптер пишет сам производитель БД
 */
public class MongoDatabaseAdapter implements DatabaseAdapter {
    private IMongoDatabase mongoDatabase;

    public MongoDatabaseAdapter(IMongoDatabase mongoDatabase) {
        this.mongoDatabase = mongoDatabase;
    }

    @Override
    public void saveObject() {
        mongoDatabase.saveMongo();
    }

    @Override
    public void updateObject() {
        mongoDatabase.updateMongo();
    }

    @Override
    public void removeObject() {
        mongoDatabase.removeMongo();
    }

    @Override
    public void findAll() {
        mongoDatabase.selectAllMongo();
    }
}
