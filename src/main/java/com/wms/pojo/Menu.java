package com.wms.pojo;

public class Menu {
    private Integer id;
    private String menuCode;
    private String menuName;
    private String menuLevel;
    private String menuParentCode;
    private String menuClick;
    private String menuRight;
    private String menuComponent;
    private String menuIcon;

    public Menu() {
    }

    public Menu(Integer id, String menuCode, String menuName, String menuLevel, String menuParentCode, String menuClick, String menuRight, String menuComponent, String menuIcon) {
        this.id = id;
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.menuLevel = menuLevel;
        this.menuParentCode = menuParentCode;
        this.menuClick = menuClick;
        this.menuRight = menuRight;
        this.menuComponent = menuComponent;
        this.menuIcon = menuIcon;
    }

    public Integer getId() {
        return id;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public String getMenuLevel() {
        return menuLevel;
    }

    public String getMenuParentCode() {
        return menuParentCode;
    }

    public String getMenuClick() {
        return menuClick;
    }

    public String getMenuRight() {
        return menuRight;
    }

    public String getMenuComponent() {
        return menuComponent;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setMenuLevel(String menuLevel) {
        this.menuLevel = menuLevel;
    }

    public void setMenuParentCode(String menuParentCode) {
        this.menuParentCode = menuParentCode;
    }

    public void setMenuClick(String menuClick) {
        this.menuClick = menuClick;
    }

    public void setMenuRight(String menuRight) {
        this.menuRight = menuRight;
    }

    public void setMenuComponent(String menuComponent) {
        this.menuComponent = menuComponent;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", menuCode='" + menuCode + '\'' +
                ", menuName='" + menuName + '\'' +
                ", menuLevel='" + menuLevel + '\'' +
                ", menuParentCode='" + menuParentCode + '\'' +
                ", menuClick='" + menuClick + '\'' +
                ", menuRight='" + menuRight + '\'' +
                ", menuComponent='" + menuComponent + '\'' +
                ", menuIcon='" + menuIcon + '\'' +
                '}';
    }
}


