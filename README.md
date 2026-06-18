# Finance App — Spring Boot Backend

A Spring Boot 3 REST API backend for a personal finance application. Currently implements a user profile module with full CRUD, serving as the foundation for future financial management features.

---

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 21 |
| Framework | Spring Boot 3.5.7 |
| Security | Spring Security |
| ORM | Spring Data JPA / Hibernate |
| Database | PostgreSQL |
| Build | Maven |
| Tests | JUnit 5 / Spring Boot Test |

---

## Architecture

```
HTTP Request
    │
    ▼
Controller        → UserProfileController, HealthController
    │
    ▼
Service           → UserProfileService (business logic)
    │
    ▼
Repository        → UserProfileRepository (JpaRepository<UserProfile, UUID>)
    │
    ▼
Database          → PostgreSQL (user_profiles table)
```

---

## Endpoints

| Method | Path | Description |
|---|---|---|
| GET | `/api/health` | Health check |
| GET | `/api/user-profiles` | List all user profiles |
| POST | `/api/user-profiles` | Create user profile |

**User Profile fields:** `id` (UUID), `email`, `fullName`

---

## Running Locally

**Requirements:** Java 21+, Maven 3.8+, PostgreSQL

```bash
git clone https://github.com/cherohn/Finance-App.git
cd Finance-App/backend

# Configure your DB in src/main/resources/application.properties
mvn spring-boot:run
```

---

## What's Next

This is the foundation layer. Planned features include transaction tracking, expense categories, monthly summaries, and JWT authentication replacing the current permissive security config.

---

## Author

**Matheus Garcez** — [github.com/cherohn](https://github.com/cherohn)
