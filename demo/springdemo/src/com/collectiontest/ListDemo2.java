package com.collectiontest;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/4/27 下午9:39
 * @version 1.0
 */
public class ListDemo2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        show(list);
    }
    public static void show(List list){
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");

        //获取列表迭代器对象
        ListIterator listIterator = list.listIterator();
        //它可以实现在迭推荐过程中完成对元素的增删改查
        //注意只有list集合具备该迭代功能。
        while(listIterator.hasNext()){
            Object obj  = listIterator.next();
            if( obj.equals("abc2") ) {
                listIterator.add("abc9");
            }else{
                System.out.println("next:"+obj);
            }
        }
        System.out.println(list);


        while(listIterator.hasPrevious()){
            /*Object obj  = listIterator.previous();
            if( obj.equals("abc2") ) {
                listIterator.add("abc9");
            }else{
                System.out.println("next:"+obj);
            }*/
            System.out.println("previous:"+listIterator.previous());
        }


        /*
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            //java.util.ConcurrentModificationException
            Object obj = iterator.next();
            //在迭代过程中，不要使用集合操作元素，容易出现异常，可以使用Iterator接口
            //子接口ListIterator来完成在迭代中对元素进行更多的操作
            if( obj.equals("abc2") ) {
                list.add("abc9");
            }else {
                System.out.println("next:"+obj);
            }
        }
         System.out.println(list);
        */

    }

}
