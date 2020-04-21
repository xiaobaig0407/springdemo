package com.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.proxy
 * @date 2020/4/11 下午9:31
 * java当中通过动态生成的代理类全部都继承proxy
 */
public class ProxyUtil {
    //完成目标对象的功能
    private MathImpl mathImpl;

    public ProxyUtil(MathImpl mathImpl) {
        this.mathImpl = mathImpl;
    }

    public Object getProxy(){
        //获取当前类的类加载器， 用来加载当前代理对象所属类
        ClassLoader classLoader = this.getClass().getClassLoader();
        System.out.println(classLoader);
        //获取目标对象实现所有接口的class, 代理类会和目标类实现相同的接口，最终通过代理对象实现功能
        Class<?>[] interfaces = mathImpl.getClass().getInterfaces();

        //抽象方法需要实现，即通过InvocationHandler
        return Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            //代理对象实现功能 的方式
            @Override
            //invoke代表执行
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                try {
                    MyLogger.before(method.getName(), Arrays.toString(args));
                    //保持结果的一致,动态代理对象实现功能
                    Object invoke = method.invoke(mathImpl, args);
                    MyLogger.after(method.getName(), invoke);
                    return invoke;
                } catch (Exception e) {
                    MyLogger.throwing();
                    //将异常信息打印到控制台
                    e.printStackTrace();

                }finally {
                    System.out.println("nadouyou");
                }
                return null;
            }
        });
    }
}
