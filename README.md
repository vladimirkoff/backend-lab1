# Java Spring Healthcheck App

Цей проєкт є базовою Java Spring аплікацією з ендпоінтом `/healthcheck`, 
який повертає JSON датою та статусом сервера.

## Запуск програми "вручну"

```bash
./mvnw spring-boot:run
```

## Запуск через Docker

1. Створення Docker-образу
    ```bash
    docker build . -t java-healthcheck:latest
    ```

2. Запуск контейнера
    ```bash
    docker run -it --rm -p 8080:8080 java-healthcheck:latest
    ```

## Запуск через Docker Compose

```bash
docker-compose build
docker-compose up
```

## Перевірка

Перейдіть за [посиланням](http://localhost:8080/healthcheck) для перевірки роботи сервера.
