package comp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @componentScan注解启用了注解扫描
 *
 * 待处理问题：该类是否不能放在根目录下？因为刚才实验的时候，报错：failed to load application context
 */

@Configuration
@ComponentScan
public class CDPlayerConfig {
}
