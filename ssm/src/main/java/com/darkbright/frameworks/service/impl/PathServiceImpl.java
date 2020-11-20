package com.darkbright.frameworks.service.impl;

import com.darkbright.frameworks.domain.dto.PathDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.darkbright.frameworks.service.PathService;

import java.io.File;
import java.io.IOException;
import java.util.TreeSet;

@Service
public class PathServiceImpl implements PathService {
    private Logger logger =LoggerFactory.getLogger("PathServiceImpl.class");
    
    public PathDto JavaGetPath() {
        PathDto pathDto = new PathDto();
    
        TreeSet ts = new TreeSet();
        
        
        try {
            //1、利用System.getProperty()函数获取当前路径：
            String currentPath = System.getProperty("user.dir");
            /*
             * 2、使用File提供的函数获取当前路径：
             * 对于getCanonicalPath()函数，“."就表示当前的文件夹，而”..“则表示当前文件夹的上一级文件夹
             * 对于getAbsolutePath()函数，则不管”.”、“..”，返回当前的路径加上你在new File()时设定的路径
             * 至于getPath()函数，得到的只是你在new File()时设定的路径
             */
            //设定为当前文件夹
            //比如当前的路径为 C:/test ：
            File directory = new File("File.txt");
            String canonicalPath = directory.getCanonicalPath();
            String absolutePath = directory.getAbsolutePath();
            String path = directory.getPath();
            
            pathDto.setCurrentPath(currentPath);
            pathDto.setCanonicalPath(canonicalPath);
            pathDto.setAbsolutePath(absolutePath);
            pathDto.setPath(path);
            //获取标准的路径
            logger.debug("CurrentPath: "+currentPath);
            //得到的是C:/test/abc
            logger.debug("CanonicalPath: " + canonicalPath);
            //获取绝对路径
            //得到的是C:/test/abc
            logger.debug("AbsolutePath: " + absolutePath);
            //得到的是abc
            logger.debug("Path: " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return pathDto;
    }
    

}
