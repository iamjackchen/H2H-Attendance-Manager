package ui;

import data.AttendanceTableModel;
import data.types.Attendee;
import data.types.attributes.Attendance;
import data.types.attributes.Sex;
import ui.containers.CloseableJTabbedPane;
import ui.containers.MenuBar;
import ui.panels.DataEditor;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class UIApplication extends JFrame {

    public UIApplication() {

        List<Attendee> list = new ArrayList<Attendee>();
        Attendee a = new Attendee("Chen", "Jack", 37352, 16, new Sex("Male"), "British", 11, new Attendance("Absent"));
        Attendee b = new Attendee("Das", "Rishit", 96969, 17, new Sex("Male"), "Indian", 11, new Attendance("Absent"));
        Attendee c = new Attendee("Camacho", "Jonathan", 20420, 16, new Sex("Male"), "American", 11, new Attendance("Absent"));
        list.add(a);
        list.add(b);
        list.add(c);

        AttendanceTableModel test  = new AttendanceTableModel(list);
        test.setSaved(true);

        CloseableJTabbedPane panelHolder = new CloseableJTabbedPane();
        this.add(panelHolder);
        this.setJMenuBar(new MenuBar(test, panelHolder));

        this.setTitle("Attendance Manager v1.0");
        this.setPreferredSize(new Dimension(1920,  1080));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }

}