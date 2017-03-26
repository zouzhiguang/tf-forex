package com.tff.forex;

import org.tensorflow.TensorFlow;

import javax.swing.*;
import javax.swing.plaf.multi.MultiLabelUI;
import java.awt.*;

/**
 * @author: Vincent
 * @since:2:18 PM, 25/3/2017
 */
public class Main {
    public static final String Version = "1.0-SNAPSHOT";

    public static void main(String... args) throws Exception {
        SwingUtilities.invokeAndWait(() -> {
            JFrame frame = new JFrame("When Forex meet sensor flow");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout());

            StringBuilder builder = new StringBuilder();
            builder.append("<html><body>");
            builder.append("TensorFlow java Version: ");
            builder.append(TensorFlow.version());
            builder.append("<br>");
            builder.append("Forex-Module Version: ");
            builder.append(Version);
            builder.append("</body></html>");

            JLabel lavel = new JLabel(builder.toString());
            frame.getContentPane().add(lavel);

            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
