# 🌱 Spring Boot Learning Repository

A hands-on learning repo for mastering Spring Boot — from basics to production-ready apps.

> Each folder = one concept module. Work through them in order.

---

## 📚 Learning Path

| # | Module | Concepts Covered |
|---|--------|-----------------|
| 01 | `01_core_concepts/` | IoC, Beans, `@Component`, `@Autowired`, ApplicationContext |
| 02 | `02_dependency_injection/` | Constructor injection, Setter injection, `@Qualifier`, `@Primary` |
| 03 | `03_spring_mvc/` | `@RestController`, `@GetMapping`, `@PostMapping`, Request/Response |
| 04 | `04_data_jpa/` | Spring Data JPA, `@Entity`, Repositories, CRUD operations |
| 05 | `05_database/` | H2 (in-memory), MySQL/PostgreSQL integration, `application.properties` |
| 06 | `06_rest_api/` | Building a full REST API, DTOs, Service layer, Exception handling |
| 07 | `07_security/` | Spring Security basics, JWT authentication |
| 08 | `08_testing/` | Unit tests, Integration tests, MockMvc, `@SpringBootTest` |
| 09 | `09_microservices/` | Microservices intro, Feign Client, API Gateway |

---

## 📁 Folder Structure

```
SpringBooot/
├── README.md                        ← You are here
├── 01_core_concepts/                ← Start here (IoC, Beans, Autowiring)
│   ├── FIrstModule/                 ← Your practice project ✅
│   ├── introduction_to_spring_framework.pdf
│   ├── beans_in_spring_framework.pdf
│   └── README.md
├── 02_dependency_injection/         ← DI patterns
│   └── README.md
├── 03_spring_mvc/                   ← REST Controllers
│   └── README.md
├── 04_data_jpa/                     ← Database with JPA
│   └── README.md
├── 05_database/                     ← DB config & connections
│   └── README.md
├── 06_rest_api/                     ← Full REST API project
│   └── README.md
├── 07_security/                     ← Auth & Security
│   └── README.md
├── 08_testing/                      ← Testing strategies
│   └── README.md
└── 09_microservices/                ← Microservices basics
    └── README.md
```

---

## 🚀 How to Run Any Module

```bash
cd <module-folder>
./mvnw spring-boot:run
```

Then visit: **http://localhost:8080**

---

## 📝 Notes

- Each module has its own `README.md` with learning objectives and notes
- Use the PDFs in the root folder as reference material
- The `FIrstModule/` is your initial scratch/practice area
