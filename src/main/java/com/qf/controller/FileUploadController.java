package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("fileUploadAndDownload")
public class FileUploadController {
    @RequestMapping("fileUploadController")
    @ResponseBody
    public String fileaaaUpload(@RequestParam("file") CommonsMultipartFile file) throws IOException {
        long startTime = System.currentTimeMillis();
        System.out.println("fileName：" + file.getOriginalFilename());
        String path = "E:/" + new Date().getTime() + file.getOriginalFilename();
        File newFile = new File(path);
        file.transferTo(newFile);
        long endTime = System.currentTimeMillis();
        System.out.println("运行时间：" + String.valueOf(endTime - startTime) + "ms");
        return "upload success";
    }
    @RequestMapping("garbageConcernController")
    @ResponseBody
    public Map<String, Object> garbageConcernController(MultipartFile dropzFile, HttpServletRequest request) throws IOException {
        System.out.println("inner upload");
        Map<String, Object> result = new HashMap<String, Object>();

        //创建文件需要存储的路径
        String destPathName = request.getSession().getServletContext().getRealPath("/static/upload");
        File destPath = new File(destPathName);
        //如果目标文件夹不存在我就创建它
        if (!destPath.exists()) {
            destPath.mkdirs();
        }
        //获取文件的后缀名
        String fileSuffix = dropzFile.getOriginalFilename().substring(dropzFile.getOriginalFilename().lastIndexOf("."));

        String destFileName = UUID.randomUUID() + fileSuffix;
        System.out.println(destFileName);
        File destFile = new File(destPath, destFileName);
        if (!destFile.exists()) {
            destFile.createNewFile();
        }
        dropzFile.transferTo(destFile);
        //调用百度接口然后获取返回值
        
        result.put("status", 200);
        //http://localhost:8080/xxxxx/xxxx.jpg
        result.put("filePath", "http://localhost:8080/static/garbageDiscern/" + destFileName);
        return result;
    }
    @RequestMapping("upload")
    @ResponseBody
    public Map<String, Object> upload(MultipartFile dropzFile, HttpServletRequest request) throws IOException {
        System.out.println("inner upload");
        Map<String, Object> result = new HashMap<String, Object>();

        //创建文件需要存储的路径
        String destPathName = request.getSession(). ().getRealPath("/static/upload");
        File destPath = new File(destPathName);
        //如果目标文件夹不存在我就创建它
        if (!destPath.exists()) {
            destPath.mkdirs();
        }
        //获取文件的后缀名
        String fileSuffix = dropzFile.getOriginalFilename().substring(dropzFile.getOriginalFilename().lastIndexOf("."));

        String destFileName = UUID.randomUUID() + fileSuffix;
        System.out.println(destFileName);
        File destFile = new File(destPath, destFileName);
        if (!destFile.exists()) {
            destFile.createNewFile();
        }
        dropzFile.transferTo(destFile);
        result.put("status", 200);
        //http://localhost:8080/xxxxx/xxxx.jpg
        result.put("filePath", "http://localhost:8080/static/upload/" + destFileName);
        return result;
    }

    static String UPLOAD_PATH = "/static/upload1/";

    @RequestMapping(value = "upload1", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> upload1(MultipartFile editorFile, HttpServletRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();

        // 获取文件后缀
        String fileName = editorFile.getOriginalFilename();
        String fileSuffix = fileName.substring(fileName.lastIndexOf("."));

        // 文件存放路径
        String filePath = request.getSession().getServletContext().getRealPath(UPLOAD_PATH);
        InetAddress ia = null;
        try {
            ia = ia.getLocalHost();
            System.out.println(ia.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        // 判断路径是否存在，不存在则创建文件夹
        File file = new File(filePath);
        if (!file.exists()) {
            file.mkdir();
        }

        // 将文件写入目标
        file = new File(filePath, UUID.randomUUID() + fileSuffix);
        try {
            editorFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 获取服务端路径
        String serverPath = String.format("%s://%s:%s%s%s", request.getScheme(), ia.getHostAddress(), request.getServerPort(), request.getContextPath(), UPLOAD_PATH);
        System.out.println(serverPath);
        // 返回给 wangEditor 的数据格式
        result.put("errno", 0);
        result.put("data", new String[]{serverPath + file.getName()});
        return result;
    }

}
