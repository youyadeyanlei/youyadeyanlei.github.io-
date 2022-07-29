package cs.config.Config;

import cs.config.BeanFactory;
import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.testng.annotations.Test;

public class BeanTest {
    @Test
    public void getBeanTest(){
        Config bean = (Config) BeanFactory.getBean("bean.name");
        System.out.println(bean.toString());
    }
}
