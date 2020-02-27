package com.ntuzy.upload.service;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @Author IamZY
 * @create 2020/2/27 16:36
 */
@Service
public class UploadService {

    private static final List<String> CONTENT_TYPES = Arrays.asList("jpg", "gif");

    private static final Logger LOGGER = LoggerFactory.getLogger(UploadService.class);
    public String upload(MultipartFile file) {
        // 校验文件类型
        String originalFilename = file.getOriginalFilename();
        String contentTypes = StringUtils.substringAfterLast(originalFilename,".");

        if (!CONTENT_TYPES.contains(contentTypes)) {
            LOGGER.info("文件类型不合法,{}",originalFilename);
            return null;
        }
        // 校验文件内容
        try {
            BufferedImage buffedImage = ImageIO.read(file.getInputStream());
            if (buffedImage == null) {
                LOGGER.info("文件内容不合法：{}", originalFilename);
                return null;
            }

            // 保存服务器
            file.transferTo(new File("D:\\images\\" + originalFilename));

            // 返回url回显
            return "http://image.ntuzy.com/" + originalFilename;

        } catch (IOException e) {
            LOGGER.info("服务器错误，{}",originalFilename);
        }

        return null;
    }
}
