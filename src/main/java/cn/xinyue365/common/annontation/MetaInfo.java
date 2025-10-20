package cn.xinyue365.common.annontation;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MetaInfo {

    /**
     * 字段中文描述
     */
    String name();

    /**
     * 字段类型
     */
    String type() default "String";

    /**
     * 是否必填
     */
    boolean required() default false;

    /**
     * 备注说明
     */
    String remark() default "";
}
