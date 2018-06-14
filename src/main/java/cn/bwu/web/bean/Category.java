package cn.bwu.web.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 各种分类(树)
 */
public class Category {

    private int id;
    private int pid;
    private int left;
    private int right;
    private int level;
    private String name;
    private String category;
    private Integer type;
    private Integer subType;
    private String icon;
    private String extra;
    private String owner;
    private Date created;
    private Date updated;

    private List<Category> categories;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public List<Category> getCategories() {
        return categories == null ? new ArrayList<>() : categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }


    public String getLabel() {
        return name;
    }

    public String getText() {
        return name;
    }

    public String getParent() {
        // 兼容 jsTree
        return pid == 0 ? "#" : String.valueOf(pid);
    }

    public Integer getSubType() {
        return subType;
    }

    public void setSubType(Integer subType) {
        this.subType = subType;
    }
}
