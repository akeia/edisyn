/***
    Copyright 2017 by Sean Luke
    Licensed under the Apache License version 2.0
*/

package edisyn;

import edisyn.gui.*;
import edisyn.synth.*;
import javax.swing.*;


/**** 
	  Top-level launcher class.  For the moment, run as 
	  java edisyn.Edisyn

      @author Sean Luke
*/

public class Edisyn 
	{
    public static void main(String[] args)
        {
        Blofeld blofeld = Blofeld.makeNewBlofeld();
	    JFrame frame = ((JFrame)(SwingUtilities.getRoot(blofeld)));
    	frame.setVisible(true);
    	blofeld.setupMIDI("Choose MIDI devices to send to and receive from.");
        }

    }