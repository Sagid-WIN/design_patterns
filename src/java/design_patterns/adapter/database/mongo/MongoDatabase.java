package design_patterns.adapter.database.mongo;

public class MongoDatabase implements IMongoDatabase {
    @Override
    public void saveMongo() {
        System.out.println("MongoDatabase save");
    }

    @Override
    public void removeMongo() {
        System.out.println("MongoDatabase removeMongo");
    }

    @Override
    public void updateMongo() {
        System.out.println("MongoDatabase updateMongo");
    }

    @Override
    public void selectAllMongo() {
        System.out.println("MongoDatabase selectAllMongo");
    }
}
