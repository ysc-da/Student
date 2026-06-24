package com.ysc.ui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        this.setTitle("颜苏灿的个人记账本 - V1.0");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置默认关闭方式
        this.setSize(800, 600);//窗口大小
        this.setLocationRelativeTo(null);//设置窗口位置
        //==========面板
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());//布局
        //==========文字标签
        JLabel jLabel = new JLabel("欢迎来到个人记账本");
        jLabel.setForeground(Color.blue);
        jLabel.setFont(new Font("微软雅黑", Font.BOLD, 24));
        jLabel.setHorizontalAlignment(JLabel.CENTER);//水平居中
        jLabel.setVerticalAlignment(JLabel.CENTER);//垂直居中
        //=========图片标签
        JLabel jLabelPng = new JLabel(new ImageIcon("src/main/resources/img/1.jpg"));
        jLabelPng.setOpaque(false);

        //添加标签并添加到面板
        jPanel.add(jLabel, BorderLayout.SOUTH);    // 文字放下面
        jPanel.add(jLabelPng, BorderLayout.CENTER); // 图片放中间
        this.add(jPanel);//添加面板

    }
}
