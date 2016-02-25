package nl.jsprengers;

import org.junit.Test;

import static nl.jsprengers.Bouncer.Gender.FEMALE;
import static nl.jsprengers.Bouncer.Gender.MALE;
import static org.assertj.core.api.Assertions.assertThat;

public class BouncerTest {

    Bouncer filter = new Bouncer();

    // The first two tests are all we need to get 100% line coverage
    @Test
    public void test21YearOldMale() {
        assertThat(filter.welcome(21, MALE)).isTrue();
    }

    @Test
    public void test19YearOldFemale() {
        assertThat(filter.welcome(19, FEMALE)).isTrue();
    }

   //But to test all edge cases and kill all mutants, we need these too
    @Test
    public void testAllMales() {
        assertThat(filter.welcome(17, MALE)).isFalse();
        assertThat(filter.welcome(18, MALE)).isFalse();
        assertThat(filter.welcome(19, MALE)).isFalse();
        assertThat(filter.welcome(20, MALE)).isFalse();
        assertThat(filter.welcome(21, MALE)).isTrue();
        assertThat(filter.welcome(22, MALE)).isTrue();

        assertThat(filter.welcome(17, FEMALE)).isFalse();
        assertThat(filter.welcome(18, FEMALE)).isTrue();
        assertThat(filter.welcome(19, FEMALE)).isTrue();
        assertThat(filter.welcome(20, FEMALE)).isTrue();
        assertThat(filter.welcome(21, FEMALE)).isTrue();
        assertThat(filter.welcome(22, FEMALE)).isTrue();

        assertThat(filter.welcome(17, null)).isFalse();
        assertThat(filter.welcome(18, null)).isFalse();
        assertThat(filter.welcome(19, null)).isFalse();
        assertThat(filter.welcome(20, null)).isFalse();
        assertThat(filter.welcome(21, null)).isTrue();
        assertThat(filter.welcome(22, null)).isTrue();
    }


}