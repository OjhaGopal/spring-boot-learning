# 08 — Testing in Spring Boot

## 🎯 Learning Objectives
- Write unit tests with JUnit 5 and Mockito
- Write integration tests with `@SpringBootTest`
- Test REST endpoints with `MockMvc`

## 📖 Key Annotations

| Annotation | Purpose |
|---|---|
| `@SpringBootTest` | Load full application context for integration tests |
| `@WebMvcTest` | Test only the web layer (controller) |
| `@MockBean` | Replace a bean with a mock in tests |
| `@DataJpaTest` | Test only JPA repositories |

### Example Unit Test
```java
@ExtendWith(MockitoExtension.class)
class PaymentServiceTest {

    @Mock
    private PaymentRepository repo;

    @InjectMocks
    private PaymentService service;

    @Test
    void shouldProcessPayment() {
        // given / when / then
    }
}
```

## 📝 Notes
<!-- Write your notes here as you learn -->
