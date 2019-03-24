import com.Duck;
import com.ToyDuck;
import com.WildDuck;
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
        Duck duck = new WildDuck();
        System.out.println(duck);
        duck.performFly();
        duck.performQuack();

        ToyDuck toyDuck = new ToyDuck();
        System.out.println(toyDuck);
        toyDuck.performFly();
        toyDuck.performQuack();
        //endregion

    }
}
