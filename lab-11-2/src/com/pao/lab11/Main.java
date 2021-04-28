package com.pao.lab11;

import com.pao.lab11.gui.HelloUserForm;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        // run GUI code on Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                HelloUserForm helloUserForm = new HelloUserForm();
                helloUserForm.setVisible(true);
            }
        });
    }
}
