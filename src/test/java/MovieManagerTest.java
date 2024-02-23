import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void amptyMovieManager() {
        MovieManager manager = new MovieManager(0);
        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Add_1Movies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film AA");
        String[] actual = manager.findAll();
        String[] expected = {"Film AA"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Add_5Movies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film AA");
        manager.addMovie("Film BB");
        manager.addMovie("Film CC");
        manager.addMovie("Film DD");
        manager.addMovie("Film EE");
        String[] actual = manager.findAll();
        String[] expected = {"Film AA", "Film BB", "Film CC", "Film DD", "Film EE"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Add_7Movies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film AA");
        manager.addMovie("Film BB");
        manager.addMovie("Film CC");
        manager.addMovie("Film DD");
        manager.addMovie("Film EE");
        manager.addMovie("Film FF");
        manager.addMovie("Film GG");
        String[] actual = manager.findAll();
        String[] expected = {"Film AA", "Film BB", "Film CC", "Film DD", "Film EE", "Film FF", "Film GG"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film AA");
        manager.addMovie("Film BB");
        manager.addMovie("Film CC");
        manager.addMovie("Film DD");
        manager.addMovie("Film EE");
        manager.addMovie("Film FF");
        manager.addMovie("Film GG");
        manager.addMovie("Film HH");
        manager.addMovie("Film QQ");
        String[] actual = manager.findAll();
        String[] expected = {"Film AA", "Film BB", "Film CC", "Film DD", "Film EE",
                "Film FF", "Film GG", "Film HH", "Film QQ"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastWithoutParam() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film AA");
        manager.addMovie("Film BB");
        manager.addMovie("Film CC");
        manager.addMovie("Film DD");

        manager.addMovie("Film EE");
        manager.addMovie("Film FF");
        manager.addMovie("Film GG");
        manager.addMovie("Film HH");
        manager.addMovie("Film QQ");
        String[] actual = manager.findLast();
        String[] expected = {"Film QQ", "Film HH", "Film GG", "Film FF", "Film EE"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast1Film() {
        MovieManager manager = new MovieManager(1);
        manager.addMovie("Film AA");
        manager.addMovie("Film BB");
        manager.addMovie("Film CC");
        manager.addMovie("Film DD");
        manager.addMovie("Film EE");
        manager.addMovie("Film FF");
        manager.addMovie("Film GG");
        manager.addMovie("Film HH");

        manager.addMovie("Film QQ");
        String[] actual = manager.findLast();
        String[] expected = {"Film QQ"};
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findLast7Films() {
        MovieManager manager = new MovieManager(7);

        manager.addMovie("Film AA");
        manager.addMovie("Film BB");

        manager.addMovie("Film CC");
        manager.addMovie("Film DD");
        manager.addMovie("Film EE");
        manager.addMovie("Film FF");
        manager.addMovie("Film GG");
        manager.addMovie("Film HH");
        manager.addMovie("Film QQ");
        String[] actual = manager.findLast();
        String[] expected = {"Film QQ", "Film HH", "Film GG", "Film FF", "Film EE",
                "Film DD", "Film CC"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast10Films() {
        MovieManager manager = new MovieManager(10);

        manager.addMovie("Film AA");
        manager.addMovie("Film BB");
        manager.addMovie("Film CC");
        manager.addMovie("Film DD");
        manager.addMovie("Film EE");
        manager.addMovie("Film FF");
        manager.addMovie("Film GG");
        manager.addMovie("Film HH");
        manager.addMovie("Film QQ");
        String[] actual = manager.findLast();
        String[] expected = {"Film QQ", "Film HH", "Film GG", "Film FF", "Film EE",
                "Film DD", "Film CC", "Film BB", "Film AA"};
        Assertions.assertArrayEquals(expected, actual);
    }
}