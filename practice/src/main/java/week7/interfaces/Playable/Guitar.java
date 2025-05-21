package week7.interfaces.Playable;

public class Guitar implements Playable {

    public Guitar() {
    }

    @Override
    public void play() {
        System.out.println("guitar say zingg");
    }
}
