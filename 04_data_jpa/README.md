# 04 — Spring Data JPA

## 🎯 Learning Objectives
- Map Java classes to database tables using `@Entity`
- Use Spring Data `JpaRepository` for zero-boilerplate CRUD
- Write custom queries with `@Query`
- Understand relationships: `@OneToMany`, `@ManyToOne`

## 📖 Key Concepts

| Annotation | Purpose |
|---|---|
| `@Entity` | Maps class to a DB table |
| `@Id` | Marks the primary key field |
| `@GeneratedValue` | Auto-generate primary key values |
| `@Column` | Customize column mapping |
| `@OneToMany` | One-to-many relationship |
| `@ManyToOne` | Many-to-one relationship |

### Repository
```java
public interface UserRepository extends JpaRepository<User, Long> {
    // Spring generates SQL for you!
    List<User> findByName(String name);
}
```

## 📝 Notes
<!-- Write your notes here as you learn -->
