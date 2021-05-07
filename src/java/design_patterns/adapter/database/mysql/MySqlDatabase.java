package design_patterns.adapter.database.mysql;

public class MySqlDatabase implements IMySqlDatabase {
    @Override
    public void insert() {
        System.out.println("MySQL database insert");
    }

    @Override
    public void update() {
        System.out.println("MySQL database update");
    }

    @Override
    public void remove() {
        System.out.println("MySQL database remove");
    }

    @Override
    public void select() {
        System.out.println("MySQL database select");
    }
}
