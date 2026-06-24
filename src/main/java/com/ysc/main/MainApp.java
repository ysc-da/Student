package com.ysc.main;

import com.ysc.ui.MainFrame;

import javax.swing.*;

public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // 窗口初始化与显示逻辑
                MainFrame frame = new MainFrame();
                frame.setVisible(true);
            }
        });
    }
}
