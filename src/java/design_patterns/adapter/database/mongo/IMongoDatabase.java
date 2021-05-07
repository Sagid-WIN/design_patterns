package design_patterns.adapter.database.mongo;

public interface IMongoDatabase {
    void saveMongo();
    void removeMongo();
    void updateMongo();
    void selectAllMongo();
}
