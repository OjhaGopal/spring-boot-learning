# 09 — Microservices with Spring Boot

## 🎯 Learning Objectives
- Understand the microservices architecture
- Build multiple Spring Boot services that communicate
- Use Feign Client for inter-service HTTP calls
- Explore Spring Cloud Gateway as API Gateway

## 📖 Key Concepts

| Concept | Tool |
|---|---|
| Service Discovery | Eureka Server |
| API Gateway | Spring Cloud Gateway |
| Inter-service calls | OpenFeign |
| Config management | Spring Cloud Config |
| Load balancing | Spring Cloud LoadBalancer |

### Example Microservice Setup
```
Client
  ↓
API Gateway (port 8080)
  ↓          ↓
User Service  Order Service
(port 8081)  (port 8082)
```

## 📝 Notes
<!-- Write your notes here as you learn -->
