package design_patterns.chain_of_responsibility.middleware;

/**
 * Конкретный элемент цепи обрабатывает запрос по-своему.
 */
public class RoleCheckMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
