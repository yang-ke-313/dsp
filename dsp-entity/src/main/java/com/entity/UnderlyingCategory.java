package com.entity;

import java.io.Serializable;
import java.util.Date;

public class UnderlyingCategory implements Serializable {
    private Integer id;
    private String title;
    private Integer cate1_id;
    private Integer level;
    private Date time_create;
    private Date time_modified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCate1_id() {
        return cate1_id;
    }

    public void setCate1_id(Integer cate1_id) {
        this.cate1_id = cate1_id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Date getTime_create() {
        return time_create;
    }

    public void setTime_create(Date time_create) {
        this.time_create = time_create;
    }

    public Date getTime_modified() {
        return time_modified;
    }

    public void setTime_modified(Date time_modified) {
        this.time_modified = time_modified;
    }

    @Override
    public String toString() {
        return "UnderlyingCategory{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cate1_id=" + cate1_id +
                ", level=" + level +
                ", time_create=" + time_create +
                ", time_modified=" + time_modified +
                '}';
    }
}
