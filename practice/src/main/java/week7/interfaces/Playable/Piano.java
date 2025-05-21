package week7.interfaces.Playable;

public class Piano implements Playable{
    private boolean pressKeys;

    public Piano(boolean pressKeys) {
        this.pressKeys = pressKeys;
    }

    public boolean isPressKeys() {
        return pressKeys;
    }

    public void setPressKeys(boolean pressKeys) {
        this.pressKeys = pressKeys;
    }

    @Override
     public void play() {
        System.out.println("piano says ting ");
    }

}
