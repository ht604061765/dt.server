package com.hunter.dt.base.common.response;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * 分页查询对象
 * @param <T> 对象泛型
 */
public class PageResult<T> implements Serializable {

    /**
     * 构造方法
     * @param pageNo 当前页码
     * @param pageSize 页面数据条数
     * @param pages 一同多少页
     * @param total 一共多少数据
     * @param records 数据记录列表
     */
    public PageResult(long pageNo, long pageSize, long pages, long total, List<T> records) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.pages = pages;
        this.total = total;
        this.records = records;
    }

    /**
     * 构建一个非空的分页查询对象
     */
    public static <T> PageResult<T> build(long pageNo, long pageSize, long pages, long total, List<T> records) {
        return new PageResult<>(pageNo, pageSize, pages, total, records);
    }

    /**
     * 构建一个空的分页查询对象
     */
    public static <T> PageResult<T> emptyPage(Long pageNum, Long pageSize) {
        return new PageResult<>(pageNum, pageSize, 0L, 0L, Collections.emptyList());
    }

    /**
     * 当前页码
     */
    private long pageNo;

    /**
     * 页面数据条数
     */
    private long pageSize;

    /**
     * 一同多少页
     */
    private long pages;

    /**
     * 一共多少数据
     */
    private long total;

    /**
     * 数据记录列表
     */
    private List<T> records;

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

    public long getPages() {
        return pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }
}
