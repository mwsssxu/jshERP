package com.jsh.erp.service.depotItem;

import com.jsh.erp.service.ResourceInfo;

import java.lang.annotation.*;

/**
 * @author palan qq752718920  2018-10-7 15:26:27
 */
@ResourceInfo(value = "depotItem")
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DepotItemResource {
}
