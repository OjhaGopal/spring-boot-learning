# 06 — Building a Full REST API

## 🎯 Learning Objectives
- Build a complete layered REST API
- Use DTOs (Data Transfer Objects)
- Implement proper Exception Handling with `@ControllerAdvice`
- Follow best practices: Controller → Service → Repository

## 📖 Layered Architecture

```
Request
  ↓
Controller (@RestController)   ← Handles HTTP, calls Service
  ↓
Service (@Service)             ← Business logic
  ↓
Repository (JpaRepository)     ← DB access
  ↓
Database
```

## 📝 Notes
<!-- Write your notes here as you learn -->
