package com.zzs.service;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;

import java.io.File;

/**
 * Desc:七牛云上传Service
 * @author zzs
 * @date 2022/3/27 12:58
 */
public interface IQiNiuService {

    /**
     * 七牛云上传文件
     *
     * @param file 文件
     * @return 七牛上传Response
     * @throws QiniuException 七牛异常
     */
    Response uploadFile(File file) throws QiniuException;
}
