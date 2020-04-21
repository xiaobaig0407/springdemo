package com.spring.proxy;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.proxy
 * @date 2020/4/11 下午9:52
 */
public class Test {
    public static void main(String[] args) {
        ProxyUtil proxyUtil = new ProxyUtil(new MathImpl());
        System.out.println(proxyUtil);
        MathI mathI = (MathI) proxyUtil.getProxy();
        int i = mathI.div(3,0);
        System.out.println(i);

    }
}
