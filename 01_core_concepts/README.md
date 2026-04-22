# 01 — Core Spring Concepts

## 🎯 Learning Objectives
- Understand **Inversion of Control (IoC)**
- Learn what the **Spring ApplicationContext** is
- Create and use **Spring Beans** (`@Component`, `@Service`, `@Repository`)
- Use **`@Autowired`** to inject dependencies

## 📖 Key Concepts

### IoC (Inversion of Control)
Instead of your code creating objects (`new SomeClass()`), Spring creates and manages them for you.

### Bean
Any Java object managed by the Spring container is called a **Bean**.

### Annotations
| Annotation | Purpose |
|---|---|
| `@Component` | Generic Spring-managed bean |
| `@Service` | Bean in the service/business layer |
| `@Repository` | Bean in the data/persistence layer |
| `@Autowired` | Auto-inject a bean dependency |

## 📂 Resources
- 📄 `introduction_to_spring_framework.pdf` — General Spring intro (read first)
- 📄 `beans_in_spring_framework.pdf` — Deep dive into Spring Beans

## 💻 Practice Project
- `FIrstModule/` — Your hands-on Spring Boot practice project
  - `PaymentServeice.java` — A `@Component` bean
  - `FIrstModuleApplication.java` — Uses `@Autowired` + `CommandLineRunner` to call the service

## 📝 Notes
<!-- Write your notes here as you learn -->
