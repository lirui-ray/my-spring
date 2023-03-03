package com.li.springframework.beans.factory;

public interface BeanFactory {

    Object getBean(String name);

    /**
     * 此方法传递args实际上是为了抽象实现类在获取bean时判空创建使用
     * @param name
     * @param args
     * @return
     */
    Object getBean(String name, Object... args);

}
