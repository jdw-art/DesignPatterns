package template;

/**
 * @Author: Jacob
 * @Description: TODO
 * @Date: 2024/6/20 11:56
 * @Version: 1.0
 */
public class Customer {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println("-------------------------------------------------");
        game = new Football();
        game.play();
    }
}
