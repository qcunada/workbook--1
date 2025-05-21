package week7.interfaces.Playable;

public class PlayApp {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();

        guitar.play();

        Piano piano = new Piano(true);

        piano.play();
    }
}
