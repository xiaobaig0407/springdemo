package com.basic.polymore;

/**
 *
 * @package com.basic.polymore
 * @author baiyutao
 * @date 2020/4/21 下午4:12
 * @version 1.0
 */
public class Wangxiaosan extends Wangsi {
    public void write() {
        System.out.println("记住仇恨，表明我们要奋发图强的心智");
    }

    public void eat() {
        System.out.println("我不喜欢读书，我就喜欢吃");
    }

    public static void main(String[] args) {
        Wangsi[] wangsis = { new Wangsi(), new Wangxiaosan() };

        // wangsis[1]能够向下转型
        ((Wangxiaosan) wangsis[1]).write();
        // wangsis[0]不能向下转型
       // ((Wangxiaosan)wangsis[0]).write();
    }
}

class Wangsi {
    public void write() {
        System.out.println("勿忘国耻");
    }

    public void read() {
        System.out.println("每周读一本好书");
    }
}
