package com.ntuzy.condition;

import com.ntuzy.bean.Color;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author IamZY
 * @create 2020/2/20 19:57
 */
public class ColorFactoryBean implements FactoryBean {
    public Object getObject() throws Exception {
        return new Color();
    }

    public Class<?> getObjectType() {
        return Color.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
