/***
    Copyright 2017 by Sean Luke
    Licensed under the Apache License version 2.0
*/

package edisyn.gui;

import edisyn.*;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.event.*;


/**
   A pretty panel for a synthesizer

   @author Sean Luke
*/

public class SynthPanel extends JPanel
    {             
    public SynthPanel()
        {
        setLayout(new BorderLayout());
        setBackground(Style.BACKGROUND_COLOR);
        setBorder(BorderFactory.createMatteBorder(2, 2, 0, 4, Color.black));
        }
    }
