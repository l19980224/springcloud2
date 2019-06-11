package com.mysql.mappers.cdbmapper.beans;

import javax.persistence.*;

@Table(name = "path_test")
public class PathTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pathid;

    private String username;

    private Integer role;

    private String path;

    private String pathname;

    private Integer parentpathid;

    /**
     * @return pathid
     */
    public Integer getPathid() {
        return pathid;
    }

    /**
     * @param pathid
     */
    public void setPathid(Integer pathid) {
        this.pathid = pathid;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return role
     */
    public Integer getRole() {
        return role;
    }

    /**
     * @param role
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    /**
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return pathname
     */
    public String getPathname() {
        return pathname;
    }

    /**
     * @param pathname
     */
    public void setPathname(String pathname) {
        this.pathname = pathname;
    }

    /**
     * @return parentpathid
     */
    public Integer getParentpathid() {
        return parentpathid;
    }

    /**
     * @param parentpathid
     */
    public void setParentpathid(Integer parentpathid) {
        this.parentpathid = parentpathid;
    }
}