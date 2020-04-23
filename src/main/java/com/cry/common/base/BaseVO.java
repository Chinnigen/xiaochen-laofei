package com.cry.common.base;

import com.cry.common.validator.Messages;
import com.cry.common.validator.annotion.IntegerNotNull;
import com.cry.common.validator.annotion.NotNull;
import com.cry.common.validator.group.Update;
import com.github.pagehelper.Page;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Description:
 * @Author:byteblogs
 * @Date:2018/09/21 13:30
 */
@Data
@Accessors(chain = true)
public class BaseVO<T> {

    /**
     * 主键
     */
    @NotNull(message = Messages.ID_NOT_NULL, groups = {Update.class})
    protected Long id;

    /**
     * 关键词搜索
     */
    protected String keywords;

    /**
     * 页数
     */
    @IntegerNotNull(groups = {Page.class}, message = Messages.PAGE_NOT_NULL)
    protected Integer page;

    /**
     * 每页大小
     */
    @IntegerNotNull(groups = {Page.class}, message = Messages.SIZE_NOT_NULL)
    protected Integer size;

    public Long getId() {
        return id;
    }

    public T setId(Long id) {
        this.id = id;
        return (T) this;
    }

    public Integer getSize() {
        return size;
    }

    public BaseVO<T> setSize(Integer size) {
        this.size = size > 20 ? 20 : size;
        return this;
    }

}
