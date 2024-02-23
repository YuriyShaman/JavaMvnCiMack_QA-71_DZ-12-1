public class MovieManager {

    private String[] movies = new String[0];    // Мфссив фильмов
    private int limit;                          // Создаем поле для ввода параметра limit

    public MovieManager() {                     // Конструктор без параметров
        this.limit = 5;     //Устанавливаем limit для вывода кол-ва  последних введенных фильмов  (5 по умолчанию),
    }

    public MovieManager(int limit) { // Конструктор c параьетром limit для вывода последних с параметром (кол-вом фильм.)
        this.limit = limit;          // Присваиваем значение тек. параметру равное limimt
    }
    public void addMovie(String movie) {                 //  Метод добавления фильмов в массив
        String[] tmp = new String[movies.length + 1];    // Создаем массив на 1 больше исходного
        for (int i = 0; i < movies.length; i++) {       // Перебараем данные массива
            tmp[i] = movies[i];                         // Находим нужный элемент
        }
        tmp[tmp.length - 1] = movie;            // Меняем длину массива
        this.movies = tmp;                      // Текущему фильму присваиваеи номер в массиве
    }
    public String[] findAll() {                 // Метод вывода полного списка фильмов
        return movies;
    }




    public String[] findLast() {        // Метод вывода списка последних ( 5-ти по умолчанию, или указанное в параметре)
        // в обратном порядке
        int resultLangth;

        if (movies.length < limit) {        // Подсчет кол-ва фильмов, если число выбранных для просмотра
            resultLangth = movies.length;   // больше, чем  введено фильмов
        } else {
            resultLangth = limit;
        }
        String[] tmp = new String[resultLangth];    // Метод подсчета числа последних фильмов из массива
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length -1 - i];
        }
        return tmp;
    }
}