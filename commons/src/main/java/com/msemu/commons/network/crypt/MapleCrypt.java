package com.msemu.commons.network.crypt;

import com.msemu.commons.enums.GameServiceType;
import com.msemu.commons.network.crypt.keys.MapleKeys;
import com.msemu.commons.utils.BitUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Weber on 2018/3/14.
 */
public class MapleCrypt implements ICipher {
    protected static final Logger log = LoggerFactory.getLogger(MapleCrypt.class);

    private static short gVersion, sVersion, rVersion;
    protected final SecretKeySpec secretKeySpec;
    protected Cipher cipher;

    protected static final byte[] SHUFFLE_KEYS = new byte[]{(byte) 0xEC, (byte) 0x3F, (byte) 0x77, (byte) 0xA4, (byte) 0x45, (byte) 0xD0, (byte) 0x71, (byte) 0xBF, (byte) 0xB7, (byte) 0x98, (byte) 0x20, (byte) 0xFC,
            (byte) 0x4B, (byte) 0xE9, (byte) 0xB3, (byte) 0xE1, (byte) 0x5C, (byte) 0x22, (byte) 0xF7, (byte) 0x0C, (byte) 0x44, (byte) 0x1B, (byte) 0x81, (byte) 0xBD, (byte) 0x63, (byte) 0x8D, (byte) 0xD4, (byte) 0xC3,
            (byte) 0xF2, (byte) 0x10, (byte) 0x19, (byte) 0xE0, (byte) 0xFB, (byte) 0xA1, (byte) 0x6E, (byte) 0x66, (byte) 0xEA, (byte) 0xAE, (byte) 0xD6, (byte) 0xCE, (byte) 0x06, (byte) 0x18, (byte) 0x4E, (byte) 0xEB,
            (byte) 0x78, (byte) 0x95, (byte) 0xDB, (byte) 0xBA, (byte) 0xB6, (byte) 0x42, (byte) 0x7A, (byte) 0x2A, (byte) 0x83, (byte) 0x0B, (byte) 0x54, (byte) 0x67, (byte) 0x6D, (byte) 0xE8, (byte) 0x65, (byte) 0xE7,
            (byte) 0x2F, (byte) 0x07, (byte) 0xF3, (byte) 0xAA, (byte) 0x27, (byte) 0x7B, (byte) 0x85, (byte) 0xB0, (byte) 0x26, (byte) 0xFD, (byte) 0x8B, (byte) 0xA9, (byte) 0xFA, (byte) 0xBE, (byte) 0xA8, (byte) 0xD7,
            (byte) 0xCB, (byte) 0xCC, (byte) 0x92, (byte) 0xDA, (byte) 0xF9, (byte) 0x93, (byte) 0x60, (byte) 0x2D, (byte) 0xDD, (byte) 0xD2, (byte) 0xA2, (byte) 0x9B, (byte) 0x39, (byte) 0x5F, (byte) 0x82, (byte) 0x21,
            (byte) 0x4C, (byte) 0x69, (byte) 0xF8, (byte) 0x31, (byte) 0x87, (byte) 0xEE, (byte) 0x8E, (byte) 0xAD, (byte) 0x8C, (byte) 0x6A, (byte) 0xBC, (byte) 0xB5, (byte) 0x6B, (byte) 0x59, (byte) 0x13, (byte) 0xF1,
            (byte) 0x04, (byte) 0x00, (byte) 0xF6, (byte) 0x5A, (byte) 0x35, (byte) 0x79, (byte) 0x48, (byte) 0x8F, (byte) 0x15, (byte) 0xCD, (byte) 0x97, (byte) 0x57, (byte) 0x12, (byte) 0x3E, (byte) 0x37, (byte) 0xFF,
            (byte) 0x9D, (byte) 0x4F, (byte) 0x51, (byte) 0xF5, (byte) 0xA3, (byte) 0x70, (byte) 0xBB, (byte) 0x14, (byte) 0x75, (byte) 0xC2, (byte) 0xB8, (byte) 0x72, (byte) 0xC0, (byte) 0xED, (byte) 0x7D, (byte) 0x68,
            (byte) 0xC9, (byte) 0x2E, (byte) 0x0D, (byte) 0x62, (byte) 0x46, (byte) 0x17, (byte) 0x11, (byte) 0x4D, (byte) 0x6C, (byte) 0xC4, (byte) 0x7E, (byte) 0x53, (byte) 0xC1, (byte) 0x25, (byte) 0xC7, (byte) 0x9A,
            (byte) 0x1C, (byte) 0x88, (byte) 0x58, (byte) 0x2C, (byte) 0x89, (byte) 0xDC, (byte) 0x02, (byte) 0x64, (byte) 0x40, (byte) 0x01, (byte) 0x5D, (byte) 0x38, (byte) 0xA5, (byte) 0xE2, (byte) 0xAF, (byte) 0x55,
            (byte) 0xD5, (byte) 0xEF, (byte) 0x1A, (byte) 0x7C, (byte) 0xA7, (byte) 0x5B, (byte) 0xA6, (byte) 0x6F, (byte) 0x86, (byte) 0x9F, (byte) 0x73, (byte) 0xE6, (byte) 0x0A, (byte) 0xDE, (byte) 0x2B, (byte) 0x99,
            (byte) 0x4A, (byte) 0x47, (byte) 0x9C, (byte) 0xDF, (byte) 0x09, (byte) 0x76, (byte) 0x9E, (byte) 0x30, (byte) 0x0E, (byte) 0xE4, (byte) 0xB2, (byte) 0x94, (byte) 0xA0, (byte) 0x3B, (byte) 0x34, (byte) 0x1D,
            (byte) 0x28, (byte) 0x0F, (byte) 0x36, (byte) 0xE3, (byte) 0x23, (byte) 0xB4, (byte) 0x03, (byte) 0xD8, (byte) 0x90, (byte) 0xC8, (byte) 0x3C, (byte) 0xFE, (byte) 0x5E, (byte) 0x32, (byte) 0x24, (byte) 0x50,
            (byte) 0x1F, (byte) 0x3A, (byte) 0x43, (byte) 0x8A, (byte) 0x96, (byte) 0x41, (byte) 0x74, (byte) 0xAC, (byte) 0x52, (byte) 0x33, (byte) 0xF0, (byte) 0xD9, (byte) 0x29, (byte) 0x80, (byte) 0xB1, (byte) 0x16,
            (byte) 0xD3, (byte) 0xAB, (byte) 0x91, (byte) 0xB9, (byte) 0x84, (byte) 0x7F, (byte) 0x61, (byte) 0x1E, (byte) 0xCF, (byte) 0xC5, (byte) 0xD1, (byte) 0x56, (byte) 0x3D, (byte) 0xCA, (byte) 0xF4, (byte) 0x05,
            (byte) 0xC6, (byte) 0xE5, (byte) 0x08, (byte) 0x49};


    public MapleCrypt(GameServiceType serviceType, short version) {
        gVersion = version;
        sVersion = (short) ((((0xFFFF - version) >>> 8) & 0xFF) | (((0xFFFF - version) << 8) & 0xFF00));
        rVersion = (short) (((version >>> 8) & 0xFF) | ((version << 8) & 0xFF00));
        byte[] secretKey = MapleKeys.getEncryptKey(serviceType, version);
        this.secretKeySpec = new SecretKeySpec(secretKey, "AES");
        try {
            this.cipher = Cipher.getInstance("AES");
            this.cipher.init(Cipher.ENCRYPT_MODE, this.secretKeySpec);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException ex) {
            log.error("MapleCrypt initialized error", ex);
        }
    }

    @Override
    public byte[] getSendHeader(int length, byte[] iv) {
        int a = (iv[3]) & 0xFF;
        a |= (iv[2] << 8) & 0xFF00;
        a ^= sVersion;
        int b = ((length << 8) & 0xFF00) | (length >>> 8);
        int c = a ^ b;
        byte[] ret = new byte[4];
        ret[0] = (byte) ((a >>> 8) & 0xFF);
        ret[1] = (byte) (a & 0xFF);
        ret[2] = (byte) ((c >>> 8) & 0xFF);
        ret[3] = (byte) (c & 0xFF);
        return ret;
    }

    @Override
    public int getLength(int header) {
        int length = ((header >>> 16) ^ (header & 0xFFFF));
        length = ((length << 8) & 0xFF00) | ((length >>> 8) & 0xFF);
        return length;
    }

    @Override
    public boolean checkHeader(int header, byte[] iv) {
        return checkHeader(new byte[]{(byte) ((header >> 24) & 0xFF), (byte) ((header >> 16) & 0xFF)}, iv);
    }

    boolean checkHeader(byte[] bytes, byte[] iv) {
        return ((((bytes[0] ^ iv[2]) & 0xFF) == ((rVersion >> 8) & 0xFF)) && (((bytes[1] ^ iv[3]) & 0xFF) == (rVersion & 0xFF)));
    }

    public void crypt(byte[] data, byte[] iv) {
        int remain = data.length;
        int size = 0x5B0;
        int start = 0;
        try {
            while (remain > 0) {
                byte[] myIv = BitUtils.multiplyBytes(iv, 4, 4);
                if (remain < size) {
                    size = remain;
                }
                for (int x = start; x < (start + size); x++) {
                    if ((x - start) % myIv.length == 0) {
                        byte[] newIv = cipher.doFinal(myIv);
                        System.arraycopy(newIv, 0, myIv, 0, myIv.length);
                    }
                    data[x] = (byte) (data[x] ^ myIv[(x - start) % myIv.length]);
                }
                start += size;
                remain -= size;
                size = 0x5B4;
            }
        } catch (Exception except) {
            log.error("MapleCrypt crypt error", except);
        }
    }

    @Override
    public byte[] getNewIv(byte[] iv) {
        byte[] ret = iv;
        int[] nIv = {0xF2, 0x53, 0x50, 0xC6};
        for (int i = 0; i < 4; i++) {
            int a = (ret[i] & 0xFF);
            int b = SHUFFLE_KEYS[a];
            nIv[0] += SHUFFLE_KEYS[nIv[1]] - a;
            nIv[1] -= nIv[2] ^ b;
            nIv[2] ^= SHUFFLE_KEYS[nIv[3]] + a;
            nIv[3] -= nIv[0] - b;
            int c = nIv[0] & 0xFF;
            c |= (nIv[1] << 8) & 0xFF00;
            c |= (nIv[2] << 16) & 0xFF0000;
            c |= (nIv[3] << 24) & 0xFF000000;
            int d = (c << 3) | (c >>> 0x1D);
            nIv[0] = (d & 0xFF);
            nIv[1] = ((d >>> 8) & 0xFF);
            nIv[2] = ((d >>> 16) & 0xFF);
            nIv[3] = ((d >>> 24) & 0xFF);
        }
        for (int i = 0; i < 4; i++) {
            ret[i] = (byte) nIv[i];
        }
        return ret;
    }
}
