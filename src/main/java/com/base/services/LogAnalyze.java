package com.base.services;

import java.io.*;

/**
 * <P></P>
 * Created by kevin on 2017/9/7 10:16.
 */
public class LogAnalyze {
    /**
     * 读取日志信息
     */
    public void readLogsInfo(String filePath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        String lineStr = bufferedReader.readLine();

    }
    /**
     * 解析日志信息
     */
    public void analyzeLogInfo(String logInfo){

    }
}
