import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаем комнаты
        Room room1 = new Room(101, "Single", 50.0, true);
        Room room2 = new Room(102, "Double", 75.0, true);
        Room room3 = new Room(103, "Suite", 150.0, true);

        // Создаем гостей
        Guest guest1 = new Guest("Turar Nurbauli", "turar@nurbauli.com", "87751452491");
        Guest guest2 = new Guest("Harry Potter", "harry@potter.com", "87711568264");
        Guest guest3 = new Guest("Hermione Granger", "hermione@granger.com", "87712345678");
        Guest guest4 = new Guest("Ron Weasley", "ron@weasley.com", "87798765432");

        // Создаем бронирования
        Booking booking1 = new Booking(room1, guest1, 3);
        Booking booking2 = new Booking(room2, guest2, 5);
        Booking booking3 = new Booking(room3, guest3, 2);
        Booking booking4 = new Booking(room1, guest4, 4);

        // Список бронирований
        List<Booking> bookings = new ArrayList<>();
        bookings.add(booking1);
        bookings.add(booking2);
        bookings.add(booking3);
        bookings.add(booking4);

        // Фильтрация: найти бронирования по гостю
        for (Booking booking : bookings) {
            if (booking.getGuest().getName().equals("Harry Potter")) {
                System.out.println(booking);
            }
        }

        // Сортировка бронирований по количеству ночей
        bookings.sort(Comparator.comparingInt(Booking::getNumberOfNights));
        System.out.println("Sorted bookings by number of nights:");
        for (Booking booking : bookings) {
            System.out.println(booking);
        }

        // Поиск доступных комнат
        List<Room> rooms = Arrays.asList(room1, room2, room3);
        for (Room room : rooms) {
            if (room.isAvailable()) {
                System.out.println(room);
            }
        }
    }
}
