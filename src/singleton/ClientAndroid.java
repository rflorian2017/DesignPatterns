package singleton;

public class ClientAndroid {
    public void navigate() {
        // navigate in the movie site
    }

    public void addToFavorites(String movie) {
        //add movie to db
       // prima modalitate
        Database.AppDatabase().addMovie(movie);

        //a doua mdalitate
        Database db = Database.AppDatabase();
        db.addMovie(movie);
    }
}
