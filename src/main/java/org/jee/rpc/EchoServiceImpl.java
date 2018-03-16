package org.jee.rpc;

/**
 * 描述:服务Echo实现类
 * Created by bysocket on 16/2/28.
 */
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String ping) {
        System.out.println("ping: "+ping);
        return ping != null ? ping + " --> I am ok." : "I am ok.";
    }
    @Override
    public String say(){
        return"say:";
    }
}
