package com.generic;

/**
 *
 * @package com.generic
 * @author baiyutao
 * @date 2020/5/7 上午11:11
 * @version 1.0
 */
public class Tool {
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}

//在jdk1.5后使用泛型来接收要操作的引用数据类型
//泛型类。什么时候用？当类中的操作引用数据类型不确定的时候，就使用泛型来表示
class Tools<QQ> {
    private QQ q;

    public QQ getQ() {
        return q;
    }

    public void setQ(QQ q) {
        this.q = q;
    }
}

