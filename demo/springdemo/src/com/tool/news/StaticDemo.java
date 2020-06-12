package com.tool.news;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.max;
import static java.util.Collections.sort;
import static java.lang.System.*;

//静态导入，其实导入的是类中的静态成员
/*import static java.util.Collections.max;
import static java.util.Collections.sort;*/
/**
 *
 * @package com.tool.news
 * @author baiyutao
 * @date 2020/5/12 下午5:34
 * @version 1.0
 */
public class StaticDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("abc3");
        list.add("abc7");
        list.add("abc1");

        out.println(list);
        sort(list);
        out.println(list);
        String max = max(list);
        out.println(max);

    }
}
