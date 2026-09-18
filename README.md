# Learning Journal

Учебный проект на Spring Boot — дневник обучения с деревом целей.

## О проекте

Приложение для отслеживания личных целей и заметок об обучении. Позволяет ставить цели, разбивать их на подцели и вести записи о прогрессе.

## Технологии

- Java 21
- Spring Boot 4.1.1
- Spring Data JPA (Hibernate)
- H2 Database (in-memory)
- Maven
- Git / GitHub

## Что уже готово

- Базовый проект Spring Boot
- REST-эндпоинт `/hello` — возвращает приветствие
- Модель Goal (цель) — JPA-сущность с полями id, title, description, status
- REST-эндпоинт `/goals` — возвращает список целей
- Настроена структура пакетов (controller, model, repository, service)
- Подключена база данных H2
- Создан JPA-репозиторий `GoalRepository`
- Создан сервис `GoalService` с CRUD-методами
- Автоматическое создание таблицы `goals` через Hibernate

## Как запустить

1. Склонировать репозиторий:

   ```bash
   git clone https://github.com/ENS21/learningjournal.git

2. Открыть проект в IntelliJ IDEA
3. Запустить LearningjournalApplication.java
4. Открыть в браузере: http://localhost:8080/hello
5. Или: http://localhost:8080/goals — список целей
6. Для просмотра базы данных открой: http://localhost:8080/h2-console
   ### Параметры подключения к H2

   | Поле | Значение |
   |------|----------|
   | JDBC URL | `jdbc:h2:mem:learningjournal` |
   | User Name | `sa` |
   | Password | (оставить пустым) |
   
   После подключения можно выполнять SQL-запросы, например: 
   SELECT * FROM goals;

## Планы

- [x] Добавить сущность Goal
- [ ] Добавить сущность Entry

- [x] Подключить базу данных (H2 / PostgreSQL)

- [ ] REST API для целей и записей

- [ ] Дерево подцелей

## Автор

Ekaterina — начинающий Java-разработчик   