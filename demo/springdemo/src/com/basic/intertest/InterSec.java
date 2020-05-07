package com.basic.intertest;

/**
 *
 * @package com.basic.intertest
 * @author baiyutao
 * @date 2020/4/23 下午2:34
 * @version 1.0
 */

/**
 * 抽象类和接口区别
 * 相同点：
 *      都是不断向上抽取而来，描述不够具体
 * 不同点：
 *      1.抽象类需要被继承，而且只能单继承。接口需要被实现，而且可以多实现
 *      2.抽象类中可以定义抽象方法和非抽象方法，子类继承后，可以使用非抽象方法。
 *        接口只能定义抽象方法，必须由子类去实现
 *      3.抽象类的继承， 是is a关系，在定义该体系的基本共性内容
 *        接口的实现是like a关系，在定义体系的额外功能
 *
 *
 * 犬按功能分：导盲犬，搜爆犬
 *interface 导盲{
 *     abstract void 导盲();
 *}
 *
 * abstract class Dog{
 *     abstract void bark();
 * }
 *
 * class 导盲dog extends dog implements 导盲{
 *     public void bark(){
 *
 *     }
 *     public void 导盲（）{
 *
 *     }
 * }
 *
 *
 */
public class InterSec {

}
