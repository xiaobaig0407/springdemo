package com.collectiontest;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/5/10 下午3:56
 * @version 1.0
 */

import java.util.HashMap;
import java.util.Map;

/**
 * map在有映射关系时可以优先考虑
 * 在查表法中的应用较为多见
 */
public class MapTest2 {
    public static void main(String[] args) {
        String week = getWeek(1);
        System.out.println(week);
        System.out.println(getWeekByMap(week));
    }

    public static String getWeekByMap(String week){
        Map<String, String> map = new HashMap<String, String>();
        map.put("一","mon");
        map.put("二","tue");
        map.put("三","wedne");
        map.put("日","sun");
        map.put("天","sun");
        return map.get(week);
    }

    public static String getWeek(int week){
        if( week < 1 || week>7) {
            throw new RuntimeException("没有星期对应，请重新输入");
        }
        String [] weeks = {"", "一", "二"};
        return weeks[week];
    }
}
