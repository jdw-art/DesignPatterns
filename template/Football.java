package template;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/6/20 11:55
 * @Version: 1.0
 */
public class Football extends Game{

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
