package org.softencity.imageqsort;

import javax.swing.JFrame;

/**
 *
 * @author Artur
 */
public class QSorder {
    
    public static void main(String[] args) {
        SorterPanel sortPanel = new SorterPanel();
        sortPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sortPanel.pack();
        sortPanel.setVisible(true);
    }
}
