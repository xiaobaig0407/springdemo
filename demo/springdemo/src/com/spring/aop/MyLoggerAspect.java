package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;



/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.aop
 * @date 2020/4/12 下午8:38
 * 横切关注点：公共功能，公共方法，非核心业务的代码
 * 切面：模块化横切关注点（公共功能），把公共功能抽取出来，放在一个类里面，这个类就叫做切面。即存储公共功能(横切关注点)的类叫做切面
 * 通知：切面里的方法
 * 目标：作用到的目标对象，切面作用于谁
 * 代理：向目标对象应用通知后创建的代理对象
 * 连接点：横切关注点抽取出来的位置，横切关注点在程序代码中的具体体现。 目标对象实现功能过程中的各个位置  ，前、后、抛出异常， finnay，是切面作用到目标对象的具体位置，  是具体目标函数上的方法以及参数
 * <p>
 * 切入点：切面作用于横切关注点的位置,使用切面的条件，表达式定义了当前切面作用到谁即哪个目标函数，通过切入点定位到连接点
 * 切面中的通知作用于连接点的条件
 */
@Component  //因为要实现spring功能，所以要把切面当成一个组件，进行加载之后aspectj才起作用
@Aspect
@Order(33)//定义切面的优先级，值越小优先级越高，默认值为int最大值
//标注当前类为切面
public class MyLoggerAspect {
    //定义一个公共切入点
    @Pointcut(value = "execution(* com.spring.aop.*.*(..))")
    public void test() {
        System.out.println("common 切入点");
    }

    /**
     * @Before 将方法指定为前置通知
     * 前置通知：作用于方法之前
     * 必须设置value，其值为切入点表达式
     * 切面所应用的连接点
     * 连接点：横切关注点对应程序执行的某个特定位置
     * 作用于目标对象必须由spring容器管理
     * value就叫做切入点表达式
     * 当前前置通知作用到的功能
     * 解析表达式找到切面所应用的连接点
     */
//    @Before(value = "execution(public int com.spring.aop.MathImpl.add(int, int))")
    //第一个*代表访问修饰符加返回类型
//    @Before(value = "execution(* com.spring.aop.MathImpl.*(int, int))")
    //当前包下任一类所有方法,第一个*代表所有类，第二个*代表所有方法
//    @Before(value = "execution(public int com.spring.aop.*.*(int, int))")
    //..代表任意的参数列表
//    @Before(value = "execution(public int com.spring.aop.MathImpl.*(..))")
    // @Before(value = "execution(* com.spring.aop.*.*(..))")
//    不用写excution因为和公共切入点PointCut是一样的
    //使用test方法定义的切入点
    @Before(value = "test() ")
    public void beforeMethod(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();//获取方法的参数
        String methodName = joinPoint.getSignature().getName();//获取方法名
        System.out.println("method:" + methodName + " arguments:" + Arrays.toString(args));
        System.out.println("前置通知");

    }

    /**
     * @After:将方法标注为后置通知 后置通知：作用于方法的finally语句块，即不管有没有异常都会执行
     */
    @After(value = "test()")
    public void afterMethod() {
        System.out.println("后置通知");
    }

    /**
     * @AfterReturning:将方法标注为返回通知 返回通知：作用于方法执行之后，try块
     * 可通过returning设置接收方法返回值的变量名
     * 当把返回通知作用到连接点之后，方法执行之后，它会将最终方法的结果赋值给object类型的result
     * 要想在方法使用，必须在方法的形参中设置和变量名相同的参数名的参数
     */
//    @AfterReturning(value = "execution(* com.spring.aop.*.*(..)))", returning = "result")
    @AfterReturning(value = "test()", returning = "result")
    public void afterRunning(JoinPoint joinPoint, Object result) {
        String methodNmae = joinPoint.getSignature().getName();
        System.out.println("返回通知");
        System.out.println("method:"+methodNmae+" result:"+result);

    }

    /***
     * @AfterThowing:将方法标注为异常通知（例外通知）
     * 异常通知：作用于方法抛出异常时
     * 也可以通过throwing设置接收方法返回的异常信息
     * 在参数列表中可通过具体的异常类型对指定的异常信息进行操作
     *
     *通过定义异常的类型来操作当我抛出了什么异常后我才需要进行操作，处理指定异常
     */
    @AfterThrowing(value = "execution(* com.spring.aop.*.*(..))", throwing = "ex")
    public void afterThrowingMethod(Exception ex) {
        System.out.println("有异常了" + ex);
    }



    /*@Around(value = "execution(* com.spring.aop.*.*(..))")
    public Object arroundMethod(ProceedingJoinPoint proceedingJoinPoint) {
        Object result = null;
        try {
            //前置通知
            System.out.println("前置通知");
            result = proceedingJoinPoint.proceed();//执行方法相当于代理模式中invoke
            System.out.println("返回通知");
            //返回通知
            return result;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            //异常通知
            System.out.println("异常通知");
        } finally {
            //后置通知
            System.out.println("后置通知");
        }
        return -1;

    }*/


}
