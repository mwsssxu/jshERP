package com.jsh.erp.datasource.entities;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Description
 *
 * @Author: palan
 * @Date: 2022/2/25 11:40
 */
@Data
public class DepotEx extends Depot{
    //负责人名字
    private String principalName;

    private BigDecimal initStock;

    private BigDecimal currentStock;

    private BigDecimal lowSafeStock;

    private BigDecimal highSafeStock;

}
