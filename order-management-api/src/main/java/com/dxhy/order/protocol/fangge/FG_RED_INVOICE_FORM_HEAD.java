package com.dxhy.order.protocol.fangge;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 红字信息表主体信息协议bean
 *
 * @author ZSC-DXHY-PC
 * @date 创建时间: 2018/12/19 9:26
 */
@Setter
@Getter
public class FG_RED_INVOICE_FORM_HEAD implements Serializable {
    
    /**
     * 申请表上传请求流水号
     */
    private String SQBSCQQLSH;
    
    /**
     * 信息表类型
     */
    private String XXBLX;
    
    /**
     * 原蓝字发票代码
     */
    private String YFP_DM;
    
    /**
     * 原蓝字发票号码
     */
    private String YFP_HM;
    
    /**
     * 营业税标志
     */
    private String YYSBZ;
    
    /**
     * 原蓝字发票开票日期
     */
    private String YFP_KPRQ;
    
    /**
     * 填开时间
     */
    private String TKSJ;
    
    /**
     * 销售方纳税人识别
     */
    private String XSF_NSRSBH;
    
    /**
     * 销售方纳税人名称
     */
    private String XSF_MC;
    
    /**
     * 购买方纳税人识别号
     */
    private String GMF_NSRSBH;
    
    /**
     * 购买方纳税人名称
     */
    private String GMF_MC;
    
    /**
     * 合计金额(带负号,不含税)
     */
    private String HJJE;
    
    /**
     * 合计税额(带负号)
     */
    private String HJSE;
    
    /**
     * 申请说明
     */
    private String SQSM;
    
    /**
     * 商品编码版本号
     */
    private String BMB_BBH;
    
    /**
     * 扩展字段1
     */
    private String KZZD1;
    
    /**
     * 扩展字段2
     */
    private String KZZD2;
    
    /**
     * 多税率标识 0:一票一税率,1:一票多税率
     */
    private String DSLBS;
    /**
     * 税种类别 0:营业税;1:增值税(默认)
     */
    private String SZLB;
    /**
     * 税率
     */
    private String SL;
    /**
     * 税率标识
     * 0:正常发票
     * 1:减按计征
     * 2:差额征收
     */
    private String SLBS;
    
    /**
     * 税局IP,只有方格UKey需要
     */
    private String JDIP;
    
    /**
     * 税局端口,只有方格UKey需要
     */
    private String JDDK;
    
}