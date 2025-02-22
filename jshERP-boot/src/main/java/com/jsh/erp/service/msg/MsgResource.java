package com.jsh.erp.service.msg;

import com.jsh.erp.service.ResourceInfo;

import java.lang.annotation.*;

/**
 * @author palan   2019-9-7 22:52:35
 */
@ResourceInfo(value = "msg")
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MsgResource {
}
