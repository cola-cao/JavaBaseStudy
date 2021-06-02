package 泛型;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ykk on 17-7-8.
 */
public class PageInfo<T> implements Serializable {

    // 每页显示记录数
    private Integer pageSize=10;

    // 当前页数
    private Integer currentPage=1;

    // 总记录数
    private Long totalRecord;

    // 总页数
    private Integer totalPages;

    // 数据List
    private List<T> list;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Long getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Long totalRecord) {
        this.totalRecord = totalRecord;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void initTotalPages() {
        this.totalPages = (this.getTotalRecord().intValue() + this.getPageSize() - 1) / this.getPageSize();
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "pageSize=" + pageSize +
                ", currentPage=" + currentPage +
                ", totalRecord=" + totalRecord +
                ", totalPages=" + totalPages +
                ", list=" + list +
                '}';
    }
}
