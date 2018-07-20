package comp;

import org.springframework.stereotype.Component;

/**
 * @component注解表明该类会作为组件类，并告知Spring为该类创建bean
 *
 * 组件扫描，默认不开启，需配置。需要@ComponentScan注解，
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "title";

    private String artist = "Jay";

    @Override
    public void play() {
        System.out.println(title + artist);

    }
}
