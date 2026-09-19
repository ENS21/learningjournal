# Learning Journal

Учебный проект на Spring Boot — дневник обучения с деревом целей.

## О проекте

Приложение для отслеживания личных целей и заметок об обучении. Позволяет ставить цели, разбивать их на подцели и вести записи о прогрессе.

## Технологии

- Java 21
- Spring Boot 4.1.1
- Spring Data JPA (Hibernate)
- PostgreSQL 18
- Maven
- Git / GitHub

## Что уже готово

- Базовый проект Spring Boot
- REST-эндпоинт `/hello` — возвращает приветствие
- Модель Goal (цель) — JPA-сущность с полями id, title, description, status
- REST-эндпоинт `/goals` — возвращает список целей
- Настроена структура пакетов (controller, model, repository, service)
- Подключена база данных PostgreSQL 18
- Создан JPA-репозиторий `GoalRepository`
- Создан сервис `GoalService` с CRUD-методами
- Реализован полный CRUD REST API для целей
- Автоматическое создание таблицы `goals` через Hibernate

## Как запустить

1. Склонировать репозиторий:
   ```bash
   git clone https://github.com/ENS21/learningjournal.git

2. Открыть проект в IntelliJ IDEA
3. Запустить LearningjournalApplication.java
4. Открыть в браузере: http://localhost:8080/hello
5. Или: http://localhost:8080/api/goals — список целей
   ### REST API

   | Метод | URL | Описание |
      |-------|-----|----------|
   | GET | `/api/goals` | Получить все цели |
   | GET | `/api/goals/{id}` | Получить цель по ID |
   | POST | `/api/goals` | Создать цель |
   | PUT | `/api/goals/{id}` | Обновить цель |
   | DELETE | `/api/goals/{id}` | Удалить цель |
6. Для просмотра базы данных открой **pgAdmin** и подключись к серверу `PostgreSQL 18` (пароль: `postgres`)
   ### Настройка базы данных

   - Установить PostgreSQL 18
   - Создать базу данных `learningjournal` через pgAdmin
   - Настроить `application.properties`:
   - `spring.datasource.password=` — твой пароль от `postgres`
   - При первом запуске Hibernate **автоматически создаст** таблицу `goals`
## Планы

- [X] Добавить сущность Goal
- [ ] Добавить сущность Entry

- [X] Подключить базу данных (PostgreSQL)

- [X] REST API для целей и записей

- [ ] Дерево подцелей

## Автор

Ekaterina — начинающий Java-разработчик   