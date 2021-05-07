package design_patterns.adapter.adapters;

/**
 * Адаптер пишет, сам производитель БД
 */
public interface DatabaseAdapter {
    public void saveObject();
    public void updateObject();
    public void removeObject();
    public void findAll();
}
