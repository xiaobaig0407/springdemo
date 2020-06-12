package com.collectiontest;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/5/10 下午1:57
 * @version 1.0
 */

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 练习
 * "abacsfwe" 获取字符中中每一个字母出现的次数
 * 要求打印a..2
 * b...1
 *对于结果分析发现字母和次数之间存在映射关系，而且这种关系很多，
 * 所以就可以想到能存储映射关系的容器有数组和map集合
 * 关系一方式有序编号？没有！
 * 那就是使用Map集合,又发现可以保证唯一性的一方具备着顺序如a b c
 * 所以可以使用treemap集合。
 *
 * 这个集合最终应该存储的是字母和次数的对应关系
 * 1.因为操作的是字母，所以先将字符串变成字符数组
 * 2.遍历字符数组，用每一个字母作为键去查Map集合这个元素
 *      如果该字母不存在，就将该字母作为键1作为值存储到map集合
 *      如果该字母键存在，就将该字母键对应值取出并+1，再将该字母和+1后的值存储到map集合中
 *      键相同会覆盖，这样就记录住了该字母的次数
 * 3.遍历结束，map集合就记录所有字母出现的次数。ok
 *
 *
 *
 */
public class MapTest {

    public static String getCharCount(String targetStr){
        //将字符串变成字符数组
        char[] chars = targetStr.toCharArray();
        //定义map集合表
        Map<Character, Integer> tr =  new TreeMap<Character, Integer>();

        for (char x : chars){
            //不要标点符号
            if( (x >= 'a' && x<='z') || (x >= 'A' && x<='Z')){
                Boolean b = tr.containsKey(x);
                Integer value = tr.get(x);
                int count = 0;
                if(value != null){
                    count = value;
                }
                count++;
                tr.put(x, count);
            }
        }
        return mapToString(tr);
    }

    public static String  sgetCharCount2(String targetStr){
        char[] chars = targetStr.toCharArray();
        //定义map集合表
        Map<Character, Integer> tr =  new TreeMap<Character, Integer>();
        for (char x : chars){
            Boolean b = tr.containsKey(x);
            Integer aaar = tr.get(x);
            System.out.println(aaar);
            System.exit(1);
            if(tr.get(x) == null){
                tr.put(x, 1);
            } else {
                int num = tr.get(x);
                num += 1;
                tr.put(x, num);
            }
        }
        return "lsldfl";
    }

    public static String mapToString(Map<Character, Integer> map){
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Character, Integer> mp = iterator.next();
            char letter = mp.getKey();
            Integer value = mp.getValue();
            sb.append(letter+"("+value+")");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String targetStr = "ab wamk+bcbsa+fwe";
        String charCount = getCharCount(targetStr);
        System.out.println(charCount);
    }
}
