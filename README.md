📚 Challenge API - Sistema de Gestión de Tópicos
API REST construida con Spring Boot para la gestión de usuarios y tópicos de discusión. Incluye autenticación JWT, validación de datos y control de errores globales.

🛠️ Tecnologías utilizadas
	- Java 17

	- Spring Boot 3.5.x

	- Spring Security

	- Spring Data JPA

	- MySQL

	- Flyway (migraciones)

	- JWT (Auth0)

	- Lombok

⚙️ Configuración
1. Base de datos (MySQL)
Configura tu archivo application.properties:

properties
Copiar
Editar
spring.datasource.url=jdbc:mysql://localhost:3306/challenge
spring.datasource.username=tu_usuario
spring.datasource.password=tu_password

spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true

spring.flyway.enabled=true
spring.flyway.locations=classpath:db/migration

2. Ejecución del proyecto
bash
Copiar
Editar
./mvnw spring-boot:run
🔐 Autenticación
Endpoint de login: POST /login

Requiere credenciales válidas de un Usuario

Devuelve un token JWT

Ejemplo de request:

json
Copiar
Editar
{
  "login": "usuario123",
  "contrasenha": "secreta"
}
Endpoints principales
Método	Ruta	Descripción
POST	/topicos	Registrar un tópico
GET	/topicos	Listar tópicos
PUT	/topicos	Actualizar un tópico
DELETE	/topicos/{id}	Desactivar un tópico
GET	/topicos/{id}	Obtener detalle de un tópico

Manejo de errores
Todos los errores de validación y entidades no encontradas son manejados por GestorDeErrores.java, devolviendo respuestas claras al cliente.

📌 Notas finales
Asegúrate de tener las tablas creadas correctamente con Flyway.

Todos los endpoints protegidos requieren un JWT válido.

Puedes extender la lógica de usuarios y tópicos fácilmente.
