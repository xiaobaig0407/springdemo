package com.basic.polymore;

/**
 *
 * @package com.basic.polymore
 * @author baiyutao
 * @date 2020/4/23 下午10:56
 * @version 1.0
 */

/**
 * 毕老师和毕姥爷的故事
 */
class 毕姥爷{
    void 讲课(){
        System.out.println("毕姥爷讲管理");
    }
    void 钓鱼(){
        System.out.println("毕姥爷钓鱼");
    }
}

class 毕老师 extends 毕姥爷{
    void 讲课(){
        System.out.println("毕老师讲Java");
    }
    void 看电影(){
        System.out.println("毕老师看电影");
    }
}

public class DuoDemo {
    public static void main(String[] args) {
        //毕老师化妆成毕姥爷，有人来请讲课，把老师当成了父亲，所以只能用父亲的方法或者我覆盖父亲的方法
        //所以一讲课就是我自己的方法把父亲覆盖是java,而钓鱼我可以用父亲的，但看电影是我特有的人，上门找的那个人
        //只知道父亲的那两个方法而不知道我特有的看电影。
        毕姥爷 grandBi = new 毕老师();
        grandBi.讲课();
        grandBi.钓鱼();
        //向下转型使用特有方法，相当于把化妆去掉，上门的人认识我了认出我是毕老师，所以我的特有方法也可以用了
        毕老师 laoshi = (毕老师)grandBi;
        laoshi.看电影();


    }
}
