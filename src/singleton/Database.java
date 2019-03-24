package singleton;

public class Database {
    private static Database db;
    private Database() {
        //connect to a database
    }

    public static Database AppDatabase() {
        if(db == null) {
            db = new Database();
        }
        return db;
    }

    public void addMovie(String movie) {
        //adds a movie to db
    }
}
