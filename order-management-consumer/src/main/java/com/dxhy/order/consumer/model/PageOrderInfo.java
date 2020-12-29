package com.dxhy.order.consumer.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ：杨士勇
 * @ClassName ：PageOrderInfo
 * @Description ：对应页面开票接口参数
 * @date ：2018年7月23日 下午3:18:33
 */
@Setter
@Getter
@ApiModel("PageOrderInfo")
public class PageOrderInfo {
    /**
     * 购货方手机
     */
    @ApiModelProperty
    private String ghfSj;
    /**
     * 购货方邮箱
     */
    @ApiModelProperty
    private String ghfEmail;
    /**
     * 购货方名称
     */
    @ApiModelProperty
    private String ghfMc;
    /**
     * 购货方纳税人识别号
     */
    @ApiModelProperty
    private String ghfNsrsbh;
    /**
     * 购货方地址
     */
    @ApiModelProperty
    private String ghfDz;
    /**
     * 购货方电话
     */
    @ApiModelProperty
    private String ghfDh;
    /**
     * 购货方银行
     */
    @ApiModelProperty
    private String ghfYh;
    /**
     * 购货方账号
     */
    @ApiModelProperty
    private String ghfZh;
    /**
     * 开票人
     */
    @ApiModelProperty
    private String kpy;
    /**
     * 备注
     */
    @ApiModelProperty
    private String bz;
    /**
     * 复核人
     */
    @ApiModelProperty
    private String fhr;
    /**
     * 收款员
     */
    @ApiModelProperty
    private String sky;
    /**
     * 发票类型
     */
    @ApiModelProperty
    private String fplx;
    /**
     * 价税合计
     */
    @ApiModelProperty
    private String jshj;
    /**
     * 购货方企业类型
     */
    @ApiModelProperty
    private String ghfqylx;
    /**
     * 开票机号
     */
    @ApiModelProperty
    private String kpjh;
    /**
     * 受理点
     */
    @ApiModelProperty
    private String sld;
    /**
     * 受理点名称
     */
    @ApiModelProperty
    private String sldmc;
    /**
     * uid
     */
    @ApiModelProperty
    private String uid;
    /**
     * 组织结构id
     */
    @ApiModelProperty
    private String deptId;
    /**
     * 销货方纳税人识别号
     */
    @ApiModelProperty
    private String xhfNsrsbh;
    /**
     * 销方名称
     */
    @ApiModelProperty
    private String xhfmc;
    /**
     * 销方地址
     */
    @ApiModelProperty
    private String xhfdz;
    
    private String xhfdh;
    /**
     * 销放银行
     */
    @ApiModelProperty
    private String xhfyh;
    /**
     * 订单号
     */
    private String xhfzh;
    @ApiModelProperty
    private String ddh;
    /**
     * 操作类型
     */
    @ApiModelProperty
    private String czlx;
    /**
     * 开票类型(0:蓝票,1:红票;)
     */
    @ApiModelProperty
    private String kplx;
    /**
     * 原发票代码
     */
    @ApiModelProperty
    private String yfpdm;
    /**
     * 原发票号码
     */
    @ApiModelProperty
    private String yfphm;
    /**
     * 业务类型id
     */
    @ApiModelProperty
    private String ywlxid;
    /**
     * 业务类型名称
     */
    @ApiModelProperty
    private String ywlx;
    
    /**
     * 清单标志
     */
    @ApiModelProperty
    private String qdbz;
    /**
     * 提取码
     */
    @ApiModelProperty
    private String tqm;
    /**
     * 明细信息
     */
    private PageOrderItemInfo[] pageOrderItemInfo;
    
    
}