package com.jsh.erp.service.material;

import com.jsh.erp.service.ResourceInfo;

import java.lang.annotation.*;

/**
 * @author palan   2022-10-7 15:26:27
 */
@ResourceInfo(value = "material")
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MaterialResource {
}
