package cs.config;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class BeanFactory {

    private  static Properties props = new Properties();
    static {
        InputStream in = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("cs/config/Config/config.properties");
        try {
            props.load(in);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static Object getBean(String name){
        Object bean = null;
        String beanName = props.getProperty(name);
        try {

            Class<?> aClass = Class.forName(beanName);
            bean=aClass.newInstance();
            BeanInfo beanInfo = Introspector.getBeanInfo(aClass);
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (int i = 0; i < propertyDescriptors.length; i++) {
                String name1 = propertyDescriptors[i].getName();
                Method writeMethod = propertyDescriptors[i].getWriteMethod();
                if("username".equals(name1)){

                    writeMethod.invoke(bean, props.getProperty("bean.username"));
                }else if ("password".equals(name1)) {
                    writeMethod.invoke(bean, props.getProperty("bean.password"));
                }else if ("url".equals(name1)) {
                    writeMethod.invoke(bean, props.getProperty("bean.url"));
                }
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        return bean;

    }


}
