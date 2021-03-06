package com.cry.domain.model.vo;

import com.cry.common.base.BaseVO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import us.codecraft.webmagic.model.annotation.ExtractBy;

import java.util.List;

/**
 * @author: zsg
 * @description:
 * @date: 2019/8/3 13:15
 * @modified:
 */

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SegmentFaultVO extends BaseVO<SegmentFaultVO> {

    @ExtractBy("//*[@id='articleTitle']/a/text()")
    private String title;

    @ExtractBy("/html/body/div[3]/div[2]/div/div[1]/div[3]//*")
    private List<String> content;

}
