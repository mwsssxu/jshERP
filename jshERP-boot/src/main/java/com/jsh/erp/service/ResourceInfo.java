package com.jsh.erp.service;

import java.lang.annotation.*;

/**
 * @author palan 2022-10-7 15:25:39
 */
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface ResourceInfo {
    String value();
}