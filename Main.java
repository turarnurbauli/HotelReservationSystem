
public class Main {
    public static void main(String[] args) {
        // Создаем комнаты
        Room room1 = new Room(101, "Single", 50.0, true);
        Room room2 = new Room(102, "Double", 75.0, false);

        // Создаем гостей
        Guest guest1 = new Guest("Turar Nurbauli", "turar@nurbauli.com", "87751452491");
        Guest guest2 = new Guest("Harry Poter", "harry@poter.com", "87711568264");

        // Создаем бронирования
        Booking booking1 = new Booking(room1, guest1, 3);
        Booking booking2 = new Booking(room2, guest2, 5);

        // Вывод объектов в консоль
        System.out.println(room1);
        System.out.println(room2);
        System.out.println(guest1);
        System.out.println(guest2);
        System.out.println(booking1);
        System.out.println(booking2);
    }
}

