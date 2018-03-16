package org.jee.rpc;

import java.io.IOException;

/**
 * 描述:RPC测试代码类
 * Created by bysocket on 16/2/29.
 */
public class RpcTest {
    public static void main(String[] args) {
        try {
            RpcExporter.exporter("localhost", 8088);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
