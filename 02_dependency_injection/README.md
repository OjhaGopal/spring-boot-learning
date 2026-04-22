# 02 — Dependency Injection

## 🎯 Learning Objectives
- Understand different types of Dependency Injection
- Use `@Qualifier` and `@Primary` to resolve ambiguity
- Understand Bean scopes (`singleton`, `prototype`)

## 📖 Key Concepts

### Types of Injection
| Type | How |
|---|---|
| **Field Injection** | `@Autowired` on a field (easy but not recommended for production) |
| **Constructor Injection** | Inject via constructor (recommended ✅) |
| **Setter Injection** | Inject via setter method |

### `@Primary` vs `@Qualifier`
- `@Primary` — marks one bean as the default when multiple exist
- `@Qualifier("name")` — explicitly pick which bean to inject

## 📝 Notes
<!-- Write your notes here as you learn -->
