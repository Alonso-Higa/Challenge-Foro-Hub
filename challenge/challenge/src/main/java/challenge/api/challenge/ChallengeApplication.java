package challenge.api.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ChallengeApplication {

	public static void main(String[] args) {

		SpringApplication.run(ChallengeApplication.class, args);
	}
//	private static final PasswordEncoder encoder = new BCryptPasswordEncoder();
//
//	public static String generarHash(String rawPassword) {
//		return encoder.encode(rawPassword);
//	}
//
//	public static void main(String[] args) {
//		// Ejemplo de uso
//		String password = "12345";  // Aquí puedes cambiar la contraseña que quieres hashear
//		String hash = generarHash(password);
//		System.out.println("Hash para '" + password + "': " + hash);
//	}
}
