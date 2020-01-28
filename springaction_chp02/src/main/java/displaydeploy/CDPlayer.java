package displaydeploy;

import org.springframework.beans.factory.annotation.Autowired;


public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    /**
     * 构造器注入
     *
     * @param cd
     */
    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
