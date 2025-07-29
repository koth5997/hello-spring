# 🧪 나의 첫 스프링 연습 프로젝
---

## 📌 프로젝트 소개

이 프로젝트는 스프링 프레임워크에 익숙해지기 위해 만든 연습용 애플리케이션입니다.  
웹 MVC 구조, 회원 도메인, JPA 연동, AOP 시간 측정 등을 직접 구현하며 스프링의 핵심 개념을 익히는 데 목적이 있습니다.

---

## 🛠 사용 기술

- **Spring Boot 3.5.3**
- **Java 21**
- **Thymeleaf**
- **H2 Database**
- **Spring Data JPA**
- **AOP (TimeTrace 적용)**
- **JUnit 테스트**

---

## 🧱 기능 목록

- 회원 가입
- 회원 목록 조회
- 중복 회원 검증
- AOP를 통한 실행 시간 측정
- 웹 MVC 구조 적용 (Controller → Service → Repository)

---

## 📂 프로젝트 구조

hello-spring/
├── controller/
├── service/
├── repository/
├── domain/
├── aop/
└── resources/
├── templates/
└── static/


---

## 💡 배운 점

- 스프링 빈 등록 방법 (자동/수동)
- 의존성 주입 (생성자 방식)
- MVC 흐름 이해
- JPA를 활용한 DB 연동
- AOP로 로직의 횡단 관심사 분리

---

## 🚧 개발자 메모

이 프로젝트는 제가 스프링을 처음 배우며 만들었던 코드입니다.  
기능은 단순하지만, 핵심 원리를 직접 구현해보며 감을 잡기 위해 노력했습니다.  
앞으로 더 발전된 스프링 프로젝트로 이어갈 예정입니다. 😄

---

## 📷 실행 화면 (선택)

> 필요한 경우 스크린샷 추가

---

## 🔗 프로젝트 실행

```bash
./gradlew bootRun
접속: http://localhost:8080
