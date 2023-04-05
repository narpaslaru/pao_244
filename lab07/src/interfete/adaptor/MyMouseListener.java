package interfete.adaptor;

import java.awt.event.MouseEvent;

public class MyMouseListener extends MouseAdaptor {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Ma intereseaza doar momentul in care se face click cu mouse-ul.");
    }
}
