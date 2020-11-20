package com.darkbright.frameworks.domain.dto;

public class PathDto {
    private String currentPath;
    private String canonicalPath;
    private String absolutePath;
    private String path;
    
    public String getCurrentPath() {
        return currentPath;
    }
    
    public void setCurrentPath(String currentPath) {
        this.currentPath = currentPath;
    }
    
    public String getCanonicalPath() {
        return canonicalPath;
    }
    
    public void setCanonicalPath(String canonicalPath) {
        this.canonicalPath = canonicalPath;
    }
    
    public String getAbsolutePath() {
        return absolutePath;
    }
    
    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }
    
    public String getPath() {
        return path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }
}
