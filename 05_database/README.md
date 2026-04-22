# 05 — Database Configuration

## 🎯 Learning Objectives
- Use H2 in-memory database for quick testing
- Connect to MySQL or PostgreSQL
- Configure `application.properties` / `application.yml`

## 📖 Key Config

### H2 (In-Memory — great for learning)
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.h2.console.enabled=true
# Access H2 console at: http://localhost:8080/h2-console
```

### MySQL
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/mydb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### PostgreSQL
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/mydb
spring.datasource.username=postgres
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

## 📝 Notes
<!-- Write your notes here as you learn -->
