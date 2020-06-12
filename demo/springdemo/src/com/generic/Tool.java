package com.generic;

/**
 *
 * @package com.generic
 * @author baiyutao
 * @date 2020/5/7 上午11:11
 * @version 1.0
 */
/*public class Tool<Student2> {
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}*/

//在jdk1.5后使用泛型来接收要操作的引用数据类型
//泛型类。什么时候用？当类中的操作引用数据类型不确定的时候，就使用泛型来表示
public class Tool<QQ> {
    private QQ q;

    public QQ getObject() {
        return q;
    }

    public void setObject(QQ q) {
        this.q = q;
    }

    /**
     * 将泛型定义在方法上,没有跟着对象走
     * @param str
     * @param <W>
     */
    public <W> void show(W str){
        System.out.println("show:"+str);
    }
    public void print(QQ str){
        System.out.println("print:"+str);
    }

    /**
     * 当方法静态时，不能访问类上定义的泛型，如果静态方法使用泛型，
     * 只能将泛型定义在方法上, 一定要放在返回值前面，修饰符后面
     * @param obj
     */
    /*public static void method(QQ obj){
        System.out.println("meth:"+obj);
    }*/
    public static <Y> void method(Y obj){
        System.out.println("meth:"+obj);
    }
}

