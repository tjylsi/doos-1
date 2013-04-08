package fi.rinkkasatiainen.doos;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class AliveTest {
    @Test
    public void magic() throws Exception {
        Cell foo = new Cell(1, 1);
        assertThat(foo.isAlive(), equalTo(true));
    }
}
