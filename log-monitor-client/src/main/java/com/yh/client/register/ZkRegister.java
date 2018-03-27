package com.yh.client.register;

import com.yh.client.constant.NodeMode;
import org.I0Itec.zkclient.ZkClient;

/**
 * Created by yaohao on 2018/3/27.
 */
public class ZkRegister {

    private ZkClient zkClient;

    public ZkRegister(ZkClient zkClient) {
        this.zkClient = zkClient;
    }

    public void create(String path, NodeMode nodeMode) {
        if(nodeMode.symbol().equals(NodeMode.PERSISTENT.symbol())) {
            this.zkClient.createPersistent(nodeMode.label() + path,true);
        }else if(nodeMode.symbol().equals(NodeMode.EPHEMERAL.symbol())) {
            this.zkClient.createEphemeral(nodeMode.label() + path);
        }
    }

    public void create(String path, NodeMode nodeMode, String data) {
        if (nodeMode.symbol().equals(NodeMode.PERSISTENT.symbol())) {
            // 创建永久节点，加入数据
            this.zkClient.createPersistent(nodeMode.label() + path, true);
        } else if (nodeMode.symbol().equals(NodeMode.EPHEMERAL.symbol())) {
            // 创建临时节点，加入数据
            this.zkClient.createEphemeral(nodeMode.label() + path, data);
        }
    }

    public void write(String path, NodeMode nodeMode, String data) {
        if (nodeMode.symbol().equals(NodeMode.PERSISTENT.symbol())) {
            // 创建永久节点，加入数据
            this.zkClient.writeData(nodeMode.label() + path, true);
        } else if (nodeMode.symbol().equals(NodeMode.EPHEMERAL.symbol())) {
            // 创建临时节点，加入数据
            this.zkClient.writeData(nodeMode.label() + path, data);
        }
    }

    public ZkClient getClient() {
        return zkClient;
    }

    public void setClient(ZkClient client) {
        this.zkClient = client;
    }
}

