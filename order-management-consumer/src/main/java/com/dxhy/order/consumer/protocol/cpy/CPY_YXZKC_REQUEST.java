package com.dxhy.order.consumer.protocol.cpy;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 成品油已下载库存请求协议bean
 *
 * @author ZSC-DXHY
 * @date 创建时间: 2018/10/13 17:55
 */
@Setter
@Getter
public class CPY_YXZKC_REQUEST implements Serializable {
    private String NSRSBH;
    private String FJH;
    private String SPBM;
}