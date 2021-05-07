package design_patterns.adapter.database.oracle;

public interface IOracleDatabase {
    public void insertElement();
    public void updateElement();
    public void removeElement();
    public void getAll();
}
