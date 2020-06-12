package com.generic;

/**
 *
 * @package com.generic
 * @author baiyutao
 * @date 2020/5/7 上午11:49
 * @version 1.0
 */
public class GenericDemo4 {
    public static void main(String[] args) {
        Tool<String> tool = new Tool<String>();
        tool.show("nihao");
        tool.show(new Integer(3));
        tool.show("abc");
        tool.method("ioa");
        tool.method(new Integer(3));
    }
}
