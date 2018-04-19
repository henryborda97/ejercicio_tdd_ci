import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SpreadSheetTest {
    @Test
    public void user_set_value_1_at_cell_a1_and_retrieve_the_value_1() {
        SpredSheet spread = new SpredSheet();

        spread.set( "a1", 1);

        assertEquals(spread.get("a1"), 1);
    }

    @Test
    public void user_set_value_2_at_cell_a1_and_retrieve_the_value_2() {
        SpredSheet spread = new SpredSheet();

        spread.set( "a1", 2);

        assertEquals( spread.get("a1"), 2);
    }

    @Test
    public void user_set_value_a_at_cell_b2_and_retrieve_the_value_a() {
        SpredSheet spread = new SpredSheet();

        spread.set("b2", "a");

        assertEquals(spread.get("b2"), "a");
    }

}
