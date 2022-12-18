package comportamentais.chain_of_responsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import comportamentais.chain_of_responsibility.middleware.Middleware;
import comportamentais.chain_of_responsibility.middleware.RoleCheckMiddleware;
import comportamentais.chain_of_responsibility.middleware.ThrottlingMiddleware;
import comportamentais.chain_of_responsibility.middleware.UserExistsMiddleware;
import comportamentais.chain_of_responsibility.server.Server;

public class demo {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;
    
    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        Middleware middleware = Middleware.link(
            new ThrottlingMiddleware(2),
            new UserExistsMiddleware(server),
            new RoleCheckMiddleware()
        );

        server.setMiddleware(middleware);
    }

	public static void main(String[] args) throws IOException {
		init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
	}
}