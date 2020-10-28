import com.devijoe.model.Hitbox;

public class Main {

    public static void main(String[] args) {
        Hitbox p = new Hitbox(2, 4, 40, 40);
        System.out.println(p.getDownRight().getX());

        System.out.println("Hello");
    }
}
