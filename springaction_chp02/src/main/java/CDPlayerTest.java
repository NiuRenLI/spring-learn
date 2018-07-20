import comp.CDPlayerConfig;
import comp.CompactDisc;
import comp.MediaPlayer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final SystemOutRule outRule = new SystemOutRule().enableLog();

    @Autowired
    private MediaPlayer mediaPlayer;

    @Autowired
    private CompactDisc cd;

    @Test
    public void play() {
        mediaPlayer.play();
        Assert.assertEquals("titleJay\n", outRule.getLog());
    }
}
