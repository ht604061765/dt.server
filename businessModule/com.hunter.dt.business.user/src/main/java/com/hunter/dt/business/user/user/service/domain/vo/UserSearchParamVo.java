package com.hunter.dt.business.user.user.service.domain.vo;

public class UserSearchParamVo {

    /**
     * 页码
     */
    private long pageNo;

    /**
     * 数据条数
     */
    private long pageSize;

    public long getPageNo() {
        return pageNo;
    }

    public void setPageNo(long pageNo) {
        this.pageNo = pageNo;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }
}
