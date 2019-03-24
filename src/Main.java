import com.behaviors.flying.FlyingDuckBehavior;
import com.behaviors.flying.NonFlyingDuckBehavior;
import com.behaviors.quacking.SqueakBehavior;
import com.model.Duck;
import com.behaviors.quacking.QuackingDuckBehavior;
import com.model.concrete.ToyDuck;
import com.model.concrete.WildDuck;
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

        duck.setFlyingDuckBehavior(new FlyingDuckBehavior());
        duck.setQuackingDuckBehavior(new QuackingDuckBehavior());
        duck.performFly();
        duck.performQuack();
        duck.setFlyingDuckBehavior(new NonFlyingDuckBehavior());
        duck.performFly();

        ToyDuck toyDuck = new ToyDuck();
        System.out.println(toyDuck);
        toyDuck.performFly();
        toyDuck.performQuack();
        toyDuck.setQuackingDuckBehavior(new SqueakBehavior());
        toyDuck.performQuack();
        //endregion

    }
}
