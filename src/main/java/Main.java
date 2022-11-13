public class Main {

    public static void main(String[] args) {

        Poster poster = new Poster();
        poster.name = "Иван";
        poster.passport = "4444 №444444";
        poster.patronymic = "Иванович";
        poster.phone = "+7(999)-999-99-99";
        poster.surname = "Иванов";
        poster.subscription = true;
        
        poster.birthday = new FormDate();
        poster.birthday.day = 3;
        poster.birthday.month = 4;
        poster.birthday.year = 1993;
    }
}
