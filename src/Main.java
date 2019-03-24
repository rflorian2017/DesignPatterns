import com.Duck;
import com.ToyDuck;
import singleton.ClientAndroid;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // region [Singleton design pattern]
        ClientAndroid clientAndroid = new ClientAndroid();
        clientAndroid.navigate();
        clientAndroid.navigate();
        clientAndroid.addToFavorites("Big bang theory");
        clientAndroid.navigate();
        clientAndroid.addToFavorites("Dumbo");
        // endregion

        // region Ducks
        Duck duck = new Duck();
        System.out.println(duck);
        duck.fly();
        duck.quack();

        ToyDuck toyDuck = new ToyDuck();
        System.out.println(toyDuck);
        toyDuck.fly();
        toyDuck.quack();
        //endregion

    }
}
