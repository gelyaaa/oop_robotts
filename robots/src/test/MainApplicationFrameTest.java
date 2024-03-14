package test;

import static org.junit.jupiter.api.Assertions.*;

import gui.MainApplicationFrame;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;

class MainApplicationFrameTest {

    @Test
    void testGenerateMenuBar() {
        MainApplicationFrame mainFrame = new MainApplicationFrame();
        JMenuBar menuBar = mainFrame.generateMenuBar();

        assertNotNull(menuBar);

        assertEquals(3, menuBar.getMenuCount()); // Assuming there are three menus

        // Assuming the first menu is "Режим отображения"
        assertEquals("Режим отображения", menuBar.getMenu(0).getText());

        // Assuming the second menu is "Тесты"
        assertEquals("Тесты", menuBar.getMenu(1).getText());

        // Assuming the third menu is "Выход"
        assertEquals("Выход", menuBar.getMenu(2).getText());
    }
    @Test
    void testConfirmExit() {
        MainApplicationFrame frame = new MainApplicationFrame();

        frame.confirmExit(new ActionEvent(new JMenuItem(), ActionEvent.ACTION_PERFORMED, ""));

        }
}
