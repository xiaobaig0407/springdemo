package com.generic;

import com.bean.Student2;

/**
 *
 * @package com.generic
 * @author baiyutao
 * @date 2020/5/7 上午11:11
 * @version 1.0
 */
public class GenericDefineDemo {
    public static void main(String[] args) {
       /* Tool tool = new Tool();
        tool.setObject(new Person());
        Object object = tool.getObject();
        Student student = (Student)object;*/
        Tool<Student2> tool = new Tool<Student2>();
        tool.setObject(new Student2());
        Student2 stu = tool.getObject();

    }
}
