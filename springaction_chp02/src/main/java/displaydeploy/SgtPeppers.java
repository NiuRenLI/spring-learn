package displaydeploy;

public class SgtPeppers implements CompactDisc {

    private String title = "title";

    private String artist = "Jay";

    @Override
    public void play() {
        System.out.println(title + artist);

    }
}
