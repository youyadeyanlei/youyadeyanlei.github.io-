### Spring概述

待补

### Spring Framework简介及特性

待补

### IOC思想和DI

待补

### IOC在Spring中的实现

待补

### Spring入门案例

```java
public class HelloWorld {

    public void sayHello(){
        System.out.println("hello,spring");
    }

}
```

applicationContext.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!--
        bean：配置一个bean对象，将对象交给IOC容器管理
        属性：
        id：bean的唯一标识，不能重复
        class：设置bean对象所对应的类型
    -->
    <bean id="helloworld" class="com.atguigu.spring.pojo.HelloWorld"></bean>

</beans>
```



### IOC容器创建对象的方式

看视频吧，我今天懒





## 获取bean的三种方式和注意事项

```java
/**
 * 获取bean的三种方式：
 * 1、根据bean的id获取
 * 2、根据bean的类型获取
 * 注意：根据类型获取bean时，要求IOC容器中有且只有一个类型匹配的bean
 * 若没有任何一个类型匹配的bean，此时抛出异常：NoSuchBeanDefinitionException
 * 若有多个类型匹配的bean，此时抛出异常：NoUniqueBeanDefinitionException
 * 3、根据bean的id和类型获取
 * 结论：
 * 根据类型来获取bean时，在满足bean唯一性的前提下
 * 其实只是看：『对象 instanceof 指定的类型』的返回结果
 * 只要返回的是true就可以认定为和类型匹配，能够获取到。
 * 即通过bean的类型、bean所继承的类的类型、bean所实现的接口的类型都可以获取bean
 */
```

## setter注入

```xml
<bean id="studentTwo" class="com.atguigu.spring.pojo.Student">
    <!--
        property：通过成员变量的set方法进行赋值
        name：设置需要赋值的属性名（和set方法有关）
        value：设置为属性所赋的值
    -->
    <property name="sid" value="1001"></property>
    <property name="sname" value="张三"></property>
    <property name="age" value="23"></property>
    <property name="gender" value="男"></property>
</bean>
```

### 构造器注入

```xml
<bean id="studentThree" class="com.atguigu.spring.pojo.Student">
    <constructor-arg value="1002"></constructor-arg>
    <constructor-arg value="李四"></constructor-arg>
    <constructor-arg value="女"></constructor-arg>
    <constructor-arg value="24" name="age"></constructor-arg>
</bean>
```

## 特殊值

```xml
<bean id="studentFour" class="com.atguigu.spring.pojo.Student">
    <property name="sid" value="1003"></property>
    <!--
        <：&lt;
        >：&gt;
        CDATA节其中的内容会原样解析<![CDATA[...]]>
        CDATA节是xml中一个特殊的标签，因此不能写在一个属性中
    -->
    <!--<property name="sname" value="&lt;王五&gt;"></property>-->
    <property name="sname">
        <value><![CDATA[<王五>]]></value>
    </property>
    <property name="gender">
        <null />
    </property>
</bean>
```



## 依赖注入之类类型的属性赋值（引用外部的bean）

![image-20220831162818995](C:\Users\gu\AppData\Roaming\Typora\typora-user-images\image-20220831162818995.png)

### 依赖注入之类类型的属性赋值（级联和内部bean）

```xml
 <property name="sid" value="1004"></property>
 <property name="sname" value="赵六"></property>
 <property name="age" value="26"></property>
 <property name="gender" value="男"></property>
 <!--ref：引用IOC容器中的某个bean的id-->
 <property name="clazz" ref="clazzOne"></property>
 <!--级联的方式，要保证提前为clazz属性赋值或者实例化-->
<property name="clazz.cid" value="2222"></property>
 <property name="clazz.cname" value="远大前程班"></property>
```

```xml
      <property name="sid" value="1004"></property>
        <property name="sname" value="赵六"></property>
        <property name="age" value="26"></property>
        <property name="gender" value="男"></property>
        <!--ref：引用IOC容器中的某个bean的id-->
<!--        <property name="clazz" ref="clazzOne"></property>-->
        <!--级联的方式，要保证提前为clazz属性赋值或者实例化-->
<!--       <property name="clazz.cid" value="2222"></property>-->
<!--        <property name="clazz.cname" value="远大前程班"></property>-->
        <property name="clazz">
            <!--内部bean，只能在当前bean的内部使用，不能直接通过IOC容器获取-->
            <bean id="clazzInner" class="com.atguigu.spring.pojo.Clazz">
                <property name="cid" value="2222"></property>
                <property name="cname" value="远大前程班"></property>
            </bean>
        </property>
```

## 依赖注入之为数组类型赋值

```xml
<property name="hobby">
    <array>
        <value>抽烟</value>
        <value>喝酒</value>
        <value>烫头</value>
    </array>
</property>
```

## 依赖注入为list集合类型赋值

```xml
<bean id="clazzOne" class="com.atguigu.spring.pojo.Clazz">
    <property name="cid" value="1111"></property>
    <property name="cname" value="最强王者班"></property>
    <property name="students" ref="studentList"></property>
    <!--<property name="students">
        <list>
            <ref bean="studentOne"></ref>
            <ref bean="studentTwo"></ref>
            <ref bean="studentThree"></ref>
        </list>
    </property>-->
</bean>
```

```xml
<!--配置一个集合类型的bean，需要使用util的约束-->
<util:list id="studentList">
    <ref bean="studentOne"></ref>
    <ref bean="studentTwo"></ref>
    <ref bean="studentThree"></ref>
</util:list>
```

### 依赖注入为map集合类型赋值

```xml
<!--<property name="teacherMap">
    <map>
        <entry key="10086" value-ref="teacherOne"></entry>
        <entry key="10010" value-ref="teacherTwo"></entry>
    </map>
</property>-->
```

## 依赖注入之p命名空间

```xml
<bean id="studentSix" class="com.atguigu.spring.pojo.Student"
    p:sid="1005" p:sname="小明" p:teacherMap-ref="teacherMap"></bean>
```

## Spring管理数据源和引入外部属性文件

```xml
<!--引入jdbc.properties，之后可以通过${key}的方式访问value-->
<context:property-placeholder location="jdbc.properties"></context:property-placeholder>

<bean id="dataSource" class="com.alibaba.druid.pool.DruidDataSource">
    <property name="driverClassName" value="${jdbc.driver}"></property>
    <property name="url" value="${jdbc.url}"></property>
    <property name="username" value="${jdbc.username}"></property>
    <property name="password" value="${jdbc.password}"></property>
</bean>
```

## bean作用域

scope 设置bean的作用域

singleton 单列

prototype 多列

```xml
<!--
    scope：设置bean的作用域
    scope="singleton|prototype"
    singleton（单例）：表示获取该bean所对应的对象都是同一个
    prototype（多例）：表示获取该bean所对应的对象都不是同一个
-->
<bean id="student" class="com.atguigu.spring.pojo.Student" scope="prototype">
    <property name="sid" value="1001"></property>
    <property name="sname" value="张三"></property>
</bean>
```

### bean生命周期

```java
/**
 * 1、实例化
 * 2、依赖注入
 * 3、后置处理器的postProcessBeforeInitialization
 * 4、初始化，需要通过bean的init-method属性指定初始化的方法
 * 5、后置处理器的postProcessAfterInitialization
 * 6、IOC容器关闭时销毁，需要通过bean的destroy-method属性指定销毁的方法
 *
 * bean的后置处理器会在生命周期的初始化前后添加额外的操作
 * 需要实现BeanPostProcessor接口且配置到IOC容器中
 * 需要注意的是，bean后置处理器不是单独针对某一个bean生效，而是针对IOC容器中所有bean都会执行
 *
 * 注意：
 * 若bean的作用域为单例时，生命周期的前三个步骤会在获取IOC容器时执行
 * 若bean的作用域为多例时，生命周期的前三个步骤会在获取bean时执行
 */
```

首先实列化

其次依赖注入

然后初始化

最后注销

![image-20220902105110513](C:\Users\gu\AppData\Roaming\Typora\typora-user-images\image-20220902105110513.png)

```xml
<bean id="user" class="com.atguigu.spring.pojo.User" init-method="initMethod" destroy-method="destroyMethod">
    <property name="id" value="1"></property>
    <property name="username" value="admin"></property>
    <property name="password" value="123456"></property>
    <property name="age" value="23"></property>
</bean>

<bean id="myBeanPostProcessor" class="com.atguigu.spring.process.MyBeanPostProcessor"></bean>
```



## FactoryBean

FactoryBean是spring提供的一个整合第三方框架的常用机制。和普通的bean不同，配置一个FactoryBean类型的bean，在获取bean的时候得到的并不是class属性中配置的这个类的对象，而是getObject（）方法的返回值。

FactoryBean是一个接口，需要创建一个类来实现接口

其中有三个方法

getObject（）通过一个对象交给ioc容器来管理

getObjectType（）设置提供对象的类型	

isSingleton（）提供对象是否单列

当FactoryBean的实现类配置为bean时，会将当前类的getObject（）返回值交给ioc容器来管理

代码看视频

### 基于xml的自动装配

### 基于xml的自动装配之byType

### 基于xml的自动装配byName

```java
/**
 * 自动装配：
 * 根据指定的策略，在IOC容器中匹配某个bean，自动为bean中的类类型的属性或接口类型的属性赋值
 * 可以通过bean标签中的autowire属性设置自动装配的策略
 * 自动装配的策略：
 * 1、no，default：表示不装配，即bean中的属性不会自动匹配某个bean为属性赋值，此时属性使用默认值
 * 2、byType：根据要赋值的属性的类型，在IOC容器中匹配某个bean，为属性赋值
 * 注意：
 * a>若通过类型没有找到任何一个类型匹配的bean，此时不装配，属性使用默认值
 * b>若通过类型找到了多个类型匹配的bean，此时会抛出异常：NoUniqueBeanDefinitionException
 * 总结：当使用byType实现自动装配时，IOC容器中有且只有一个类型匹配的bean能够为属性赋值
 * 3、byName：将要赋值的属性的属性名作为bean的id在IOC容器中匹配某个bean，为属性赋值
 * 总结：当类型匹配的bean有多个时，此时可以使用byName实现自动装配
 */
```

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="userController" class="com.atguigu.spring.controller.UserController" autowire="byName">
        <!--<property name="userService" ref="userService"></property>-->
    </bean>

    <bean id="userService" class="com.atguigu.spring.service.impl.UserServiceImpl" autowire="byName">
        <!--<property name="userDao" ref="userDao"></property>-->
    </bean>

    <bean id="service" class="com.atguigu.spring.service.impl.UserServiceImpl" autowire="byName">
        <!--<property name="userDao" ref="userDao"></property>-->
    </bean>

    <bean id="userDaoImpl" class="com.atguigu.spring.dao.impl.UserDaoImpl"></bean>

    <bean id="dao" class="com.atguigu.spring.dao.impl.UserDaoImpl"></bean>

</beans>
```



### 基于注解管理bean

和xml 配置文件一样，注解本身并不能执行，注解本身仅仅只是做一个标记，具体的功能是框架检测到注解标记的位置，然后针对这个位置按照注解标记的功能来执行具体操作

本质上：所以一切的操作都是java代码来完成的，xml和注解只是告诉框架中的代码如何运行。

扫描，spring为了知道程序员在哪些地方标记了什么注解，就需要通过扫描的方式，来进行检测。然后通过注解进行后续操作。

```java
/**
 * @Component：将类标识为普通组件
 * @Controller：将类标识为控制层组件
 * @Service：将类标识为业务层组件
 * @Repository：将类标识为持久层组件
 *
 * 通过注解+扫描所配置的bean的id，默认值为类的小驼峰，即类名的首字母为小写的结果
 * 可以通过标识组件的注解的value属性值设置bean的自定义的id
 *
 * @Autowired:实现自动装配功能的注解
 * 1、@Autowired注解能够标识的位置
 * a>标识在成员变量上，此时不需要设置成员变量的set方法
 * b>标识在set方法上
 * c>标识在为当前成员变量赋值的有参构造上
 * 2、@Autowired注解的原理
 * a>默认通过byType的方式，在IOC容器中通过类型匹配某个bean为属性赋值
 * b>若有多个类型匹配的bean，此时会自动转换为byName的方式实现自动装配的效果
 * 即将要赋值的属性的属性名作为bean的id匹配某个bean为属性赋值
 * c>若byType和byName的方式都无妨实现自动装配，即IOC容器中有多个类型匹配的bean
 * 且这些bean的id和要赋值的属性的属性名都不一致，此时抛异常：NoUniqueBeanDefinitionException
 * d>此时可以在要赋值的属性上，添加一个注解@Qualifier
 * 通过该注解的value属性值，指定某个bean的id，将这个bean为属性赋值
 *
 * 注意：若IOC容器中没有任何一个类型匹配的bean，此时抛出异常：NoSuchBeanDefinitionException
 * 在@Autowired注解中有个属性required，默认值为true，要求必须完成自动装配
 * 可以将required设置为false，此时能装配则装配，无法装配则使用属性的默认值
 */

@Test
public void test(){
    ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
    UserController userController = ioc.getBean("controller", UserController.class);
    /*System.out.println(userController);
    UserService userService = ioc.getBean("userServiceImpl", UserService.class);
    System.out.println(userService);
    UserDao userDao = ioc.getBean("userDaoImpl", UserDao.class);
    System.out.println(userDao);*/
    userController.saveUser();
}
```





```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/context https://www.springframework.org/schema/context/spring-context.xsd">

    <!--
        context:exclude-filter：排除扫描
        type：设置排除扫描的方式
        type="annotation|assignable"
        annotation：根据注解的类型进行排除，expression需要设置排除的注解的全类名
        assignable：根据类的类型进行排除，expression需要设置排除的类的全类名

        context:include-filter：包含扫描
        注意：需要在context:component-scan标签中设置use-default-filters="false"
        use-default-filters="true"（默认），所设置的包下所有的类都需要扫描，此时可以使用排除扫描
        use-default-filters="false"，所设置的包下所有的类都不需要扫描，此时可以使用包含扫描
    -->

    <!--扫描组件-->
    <context:component-scan base-package="com.atguigu.spring"></context:component-scan>
    <!--<context:component-scan base-package="com.atguigu.spring" use-default-filters="false">
        &lt;!&ndash;<context:exclude-filter type="annotation" expression="org.springframework.stereotype.Controller"/>&ndash;&gt;
        &lt;!&ndash;<context:exclude-filter type="assignable" expression="com.atguigu.spring.controller.UserController"/>&ndash;&gt;
        <context:include-filter type="annotation" expression="org.springframework.stereotype.Controller"/>
    </context:component-scan>-->

    <!--<bean id="service" class="com.atguigu.spring.service.impl.UserServiceImpl"></bean>

    <bean id="dao" class="com.atguigu.spring.dao.impl.UserDaoImpl"></bean>-->

</beans>
```



### 基于注解管理之扫描组件











