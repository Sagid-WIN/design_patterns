package design_patterns.adapter.database.mysql;

public interface IMySqlDatabase {
    void insert();
    void update();
    void remove();
    void select();
}
