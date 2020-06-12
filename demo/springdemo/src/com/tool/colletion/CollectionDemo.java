package com.tool.colletion;

import com.comparator.ComparecsByLength;

import java.util.*;

/**
 *
 * @package com.tool.colletion
 * @author baiyutao
 * @date 2020/5/11 下午2:27
 * @version 1.0
 */
public class CollectionDemo {
    public static void main(String[] args) {
        /**
         * Collections:是集合框架的工具类。
         * 里面的方法都是静态的。
         */
      //  demoOne();
//        demoTwo();
//        demoThree();
            demoFour();
    }

    public static void demoFour(){
        List<String> list = new ArrayList<>();
        list.add("abcde");
        list.add("cba");
        list.add("aa");
        list.add("cba");
        list.add("zzz");
        list.add("nbaa");
        Enumeration<String> enumeration = Collections.enumeration(list);
        System.out.println(enumeration);
        System.out.println(list);
        Collections.replaceAll(list, "cba", "nba");
        System.out.println(list);
        //替换所有元素
        //Collections.fill(list, "hao");
        Collections.shuffle(list);
        System.out.println(list);
    }

    public static void demoThree(){
       /* TreeSet<String> ts = new TreeSet<String>(new ComparecsByLength(){
            @Override
            public int compare(String o1, String o2) {
                int temp = o2.compareTo(o1);
                return temp;
            }
        });*/
       //以自然顺序倒序
//        TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder());
//将已有比较器顺序倒序
        TreeSet<String> ts = new TreeSet<String>( Collections.reverseOrder( new ComparecsByLength()) );

        ts.add("abc");
        ts.add("haha");
        ts.add("zz");
        ts.add("aa");
        ts.add("cba");
        System.out.println(ts);
    }

    public static void demoTwo(){
        List<String> list = new ArrayList<>();
        list.add("abcde");
        list.add("cba");
        list.add("aa");
        list.add("zzz");
        list.add("nbaa");
        Collections.sort(list);
        System.out.println(list);
        int key = Collections.binarySearch(list, "cba");
        System.out.println(key);
        String max = Collections.max(list, new ComparecsByLength());
        System.out.println(max);
    }

    public static void demoOne(){
        List<String> list = new ArrayList<>();
        list.add("abcde");
        list.add("cba");
        list.add("aa");
        list.add("zzz");
        list.add("nbaa");
        System.out.println(list);
        //对list集合进行指定顺序的排序
       // Collections.sort(list);
       // mySort(list);
        //按照长度比较
        Collections.sort(list, new ComparecsByLength());
        System.out.println(list);
        Iterator<String> iterator = list.iterator();
    }

    public static <T> void yoursort(List<T> list, Comparator<? super T> comp){
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(comp.compare(list.get(i), list.get(j) ) > 0){
                    /*T temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);*/
                    Collections.swap(list, i, j);
                }
            }
        }
    }

    public static <T extends Comparable<? super  T>> void mySort(List<T> list){
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i).compareTo(list.get(j)) > 0){
                    /*T temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);*/
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
