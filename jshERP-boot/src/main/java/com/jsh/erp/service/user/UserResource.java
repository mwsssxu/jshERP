package com.jsh.erp.service.user;

import com.jsh.erp.service.ResourceInfo;

import java.lang.annotation.*;

/**
 * @author palan   2022-10-7 15:26:27
 */
@ResourceInfo(value = "user")
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface UserResource {
}
