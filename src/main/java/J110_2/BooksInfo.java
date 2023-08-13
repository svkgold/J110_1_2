package J110_2;

public class BooksInfo {


        public static void main(String[] args) {

            // Создаем объекты для издательств
            PublishingCompanies prospect = new PublishingCompanies("Проспект", "Москва");

            // Издание BHV не корректно указан город
            PublishingCompanies bhv = new PublishingCompanies("БХВ", "Москва");

            PublishingCompanies dialectica = new PublishingCompanies("Диалектика", "Киев");

            PublishingCompanies piter = new PublishingCompanies("Питер", "Санкт-Петербург");

            // Создаем массив для хранения названий книг
            Books[] booksInfo = new Books[] {
                    new Books("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных", piter, 2018, new String[]{"Седжвик Роберт", "Уэйн Кевин"}),
                    new Books("C/C++. Процедурное программирование", bhv, 2017, "Полубенцева М.И."),
                    new Books("Конституция РФ", prospect, 2020),
                    new Books("Разработка требований к программному обеспечению. 3-е издание, дополненное", bhv, 2019, "Вигерс Карл"),
                    new Books("Java. Полное руководство, 10-е издание", dialectica, 2018, "Шилдт Герберт")
            };

            // Печатаем массив со всеми книгами

            Books.printAll(booksInfo);

            // Исправляет ошибку в названии города издательства «БХВ»

            bhv.setCity("Санкт-Петербург");

            /*
             Печатаем массив со всеми книгами повторно без ошибки города для издательства "БХВ".
             Вывод изменился для всех книг "БХВ", так как изменили атрибут город объекта bhv,
             что отражается для всех связанных книг для данного объекта.
            */

            Books.printAll(booksInfo);

        }
}