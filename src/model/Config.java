/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Config {

    private String copyFolder;
    private String dataType;
    private String path;

    public Config(String copyFolder, String dataType, String path) {
        this.copyFolder = copyFolder;
        this.dataType = dataType;
        this.path = path;
    }

    public String getCopyFolder() {
        return copyFolder;
    }

    public void setCopyFolder(String copyFolder) {
        this.copyFolder = copyFolder;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Config{" + "copyFolder=" + copyFolder + ", dataType=" + dataType + ", path=" + path + '}';
    }

}
