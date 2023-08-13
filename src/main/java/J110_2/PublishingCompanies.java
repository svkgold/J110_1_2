package J110_2;

public class PublishingCompanies {

        // Название компании издательства
        String publisherName;

        // Название города, где располагается издательство
        String city;

        //Конструктор для издательств
        public PublishingCompanies(String publisherName, String city)
        {
            setPublisherName(publisherName);
            setCity(city);
        }

        // Геттер для названия компании издательства
        public String getPublisherName()
        {
            return publisherName;
        }

        //Сеттер для названия компании издательства
        public void setPublisherName(String publisherName)
        {
            if (publisherName == null)
                throw new IllegalArgumentException
                        ("Publisher name can not be null. Please, check it one more time");
            this.publisherName = publisherName;
        }

        //Геттер города, где располагается издательство
        public String getCity()
        {
            return city;
        }

        //Сеттер города, где располагается издательство
        public void setCity(String city)
        {
            if (city == null)
                throw new IllegalArgumentException
                        ("City name can not be null. Please, check it one more time");
            this.city = city;
        }
    }