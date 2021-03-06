package by.logger.example;

/**
 * Спецификация ведения журнала
 * •	Приложение должно регистрировать информацию о запуске.
 * •	Приложение должно регистрировать информацию о прочитанной конфигурации.
 * •	Приложение должно регистрировать информацию о процессе переименования.
 * •	Приложение должно регистрировать сводную информацию.
 * •	Приложение должно регистрировать информацию о завершении работы.
 * •	Приложение должно обрабатывать и регистрировать возможные ошибки.
 */
public class Main {

    public static void main(String[] args) {
        new FileNameHandler().handle();
    }
}