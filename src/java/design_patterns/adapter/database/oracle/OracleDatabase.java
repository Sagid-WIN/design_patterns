package design_patterns.adapter.database.oracle;

public class OracleDatabase implements IOracleDatabase {

    @Override
    public void insertElement() {
        System.out.println("Oracle database insert");
    }

    @Override
    public void updateElement() {
        System.out.println("Oracle database update");
    }

    @Override
    public void removeElement() {
        System.out.println("Oracle database remove");
    }

    @Override
    public void getAll() {
        System.out.println("Oracle database select");
    }
}
