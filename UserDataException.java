package GeekBrains.ExceptionsInProgramming.Homework.ExceptionInProgrammingHWSeminar3;

// UserDataException - пользовательское исключение, которое наследуется от класса Exception. Оно
// используется для обработки ошибок, связанных с данными пользователя. Параметр message является 
// сообщением об ошибке. С помощью ключевого слова super вызывается конструктор базового класса 
// Exception для инициализации сообщения об ошибке.


public class UserDataException extends Exception {
    public UserDataException(String message) {
        super(message);
    }
}
