package com.base.utils;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class TripleDES {
    /**
     * @param args在java中调用sun公司提供的3DES加密解密算法时，需要使
     * 用到$JAVA_HOME/jre/lib/目录下如下的4个jar包：
     *jce.jar
     *security/US_export_policy.jar
     *security/local_policy.jar
     *ext/sunjce_provider.jar
     */

    public static final String Algorithm = "DESede"; //定义加密算法,可用 DES,DESede,Blowfish
    //keybyte为加密密钥，长度为24字节
    //src为被加密的数据缓冲区（源）
    public static byte[] encryptMode(byte[] keybyte,byte[] src){
        try {
            //生成密钥
            SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);
            //加密
            Cipher c1 = Cipher.getInstance(Algorithm);
            c1.init(Cipher.ENCRYPT_MODE, deskey);
            return c1.doFinal(src);//在单一方面的加密或解密
        } catch (java.security.NoSuchAlgorithmException e1) {
            // TODO: handle exception
            e1.printStackTrace();
        }catch(javax.crypto.NoSuchPaddingException e2){
            e2.printStackTrace();
        }catch(Exception e3){
            e3.printStackTrace();
        }
        return null;
    }

    //keybyte为加密密钥，长度为24字节
    //src为加密后的缓冲区
    public static byte[] decryptMode(byte[] keybyte,byte[] src){
        try {
            //生成密钥
            SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);
            //解密
            Cipher c1 = Cipher.getInstance(Algorithm);
            c1.init(Cipher.DECRYPT_MODE, deskey);
            return c1.doFinal(src);
        } catch (java.security.NoSuchAlgorithmException e1) {
            // TODO: handle exception
            e1.printStackTrace();
        }catch(javax.crypto.NoSuchPaddingException e2){
            e2.printStackTrace();
        }catch(Exception e3){
            e3.printStackTrace();
        }
        return null;
    }

    //转换成十六进制字符串
    public static String byte2Hex(byte[] b){
        String hs="";
        String stmp="";
        for(int n=0; n<b.length; n++){
            stmp = (Integer.toHexString(b[n]& 0XFF));
            if(stmp.length()==1){
                hs = hs + "0" + stmp;
            }else{
                hs = hs + stmp;
            }
            if(n<b.length-1){
                hs=hs+":";
            }
        }
        return hs.toUpperCase();
    }
    public static byte[] hex(String username){
        String key = "test";//关键字
        String f = DigestUtils.md5Hex(username+key);
        byte[] bkeys = new String(f).getBytes();
        byte[] enk = new byte[24];
        for (int i=0;i<24;i++){
            enk[i] = bkeys[i];
        }
        return enk;
    }

    public static String encodeStr(String param,String encryptStr){
        byte[] enk = hex(encryptStr);
        byte[] encoded = encryptMode(enk,param.getBytes());
        byte[] paramStr = Base64.encodeBase64(encoded);

        return new String(paramStr);
    }

    public static String decodeStr(String param,String encryptStr){
        byte[] enk = hex(encryptStr);
        byte[] reqParam = null;

        reqParam = Base64.decodeBase64(param.getBytes());

        byte[] srcBytes = decryptMode(enk,reqParam);

        String resultStr = new String(srcBytes);

        return resultStr;
    }
    public static void main(String[] args) {
        String encryptKeyStr = "1qaz2wsx3edc4rfv";

        String encStr = "12345678";

        //加密
        System.out.println(TripleDES.encodeStr(encStr,encryptKeyStr));

        //解密
        String a = TripleDES.encodeStr(encStr,encryptKeyStr);
        System.out.println(TripleDES.decodeStr(a,encryptKeyStr));
    }
}
