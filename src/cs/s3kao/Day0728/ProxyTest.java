package cs.s3kao.Day0728;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Human{
    String getBelieve();

    void eat(String food);
}

//被代理类
class SuperMan implements Human{
    public String getBelieve() {
        return "我思故我在";
    }

    public void eat(String food) {
        System.out.println("我喜欢吃"+food);
    }
}
/*
 * 要想实现动态代理，需要解决的问题?
 * 问题一:如何根据加载到内存中的被代理类，动态的创建一个代理类及其对象。
 * 问题二:当通过代理类的对象调用方法时，如何动态的去调用被代理类中的同名方法。
 *
 * */

class ProxyFactory{

    //调用此方法，返回一个代理类对象，解决问题一
    public static Object getProxyInstance(Object object){//object被代理类对象
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.bind(object);
        //参数一：我们创建的代理类是那个类的加载器加载的（获取被代理类的类的加载器）
        //这里是说obj是那个类的加载器加载的，我就和你一样
        //参数二：被代理类实现了那个接口的类的加载器（根据被代理类实现的接口，
        //  我们创建的代理类也跟着实现哪些接口）
        //参数三：其实是在解决问题二，（我们需要去定义一个接口的实现类）
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),handler);
    }

}

class MyInvocationHandler implements InvocationHandler{

    private Object obj;//赋值时也需要根据被代理类进行初始化

    public  void bind(Object obj){//这个方法相当于对我们所要代理的对象进行实例化
        this.obj = obj;
    }

    //当我们通过代理类的对象 ，调用方法a时，就会自动的调用如下的方法：invoke()
    //将被代理类要执行的方法a的功能声明在invoke()中，其实解决的是问题二
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("准备工作1");
        //参数一：被代理类对象
        //参数二：被代理类的方法参数（代理类对象对被代理类的方法执行除了被代理类对象以外还有参数）
        Object returnValue = method.invoke(obj, args);//method即为代理对象调用对的方法，此方法也就作为了被代理类要执行的方法
        System.out.println("收尾工作");
        return  returnValue;//method的返回值（其实也是被代理类的返回值）作为invoke()方法的返回值
    }
}


public class ProxyTest {
    public static void main(String[] args) {
        //创建一个被代理类
        SuperMan superMan = new SuperMan();

        //返回值是一个Object对象，但是在我们这个示例中试试Human对象，因此，我们对其进行强转
//        Object proxyInstance = ProxyFactory.getProxyInstance(superMan);
        Human  proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);//返回的其实是代理类对象
        proxyInstance.eat("战斧牛排");
        String believe = proxyInstance.getBelieve();
        System.out.println(believe);

    }

}

