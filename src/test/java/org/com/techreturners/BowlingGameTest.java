package org.com.techreturners;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class BowlingGameTest {

    public void rollFramePins(int n, int pins){
        //n is the number of frames
        Game g = new Game();
        for(int i = 0; i< n ; i++) {
            g.roll(pins);
        }
    }
@Test
    public void checkForPlayerScore(){
        Game g = new Game();
        for(int i =0; i< 20; i++){
            g.roll(0);
            assertEquals(0, g.score());
        }
    }

@Test
    public void testAllOnes(){
    Game g = new Game();
    for(int i = 0; i< 20; i++){
        g.roll(1);
    }
    assertEquals(20,g.score());
    }

    @Test
    public void testAllZero() {
        Game g = new Game();
        for (int i = 0; i < 20; i++) {
            g.roll(0);
        }assertEquals(0, g.score());
    }

    @Test
    public void testOneSpare(){
        Game g = new Game();
        g.roll(5);
        g.roll(5);  //spare
        g.roll(3);
        rollFramePins(17, 0);
        assertEquals(16, g.score());
    }
    
    
    @Test
    public void testOneStrike() {
        Game g = new Game();
        g.roll(10);     //strike
        g.roll(3);
        g.roll(4);
        rollFramePins(16,0);
        assertEquals(24,g.score());
    }

}
