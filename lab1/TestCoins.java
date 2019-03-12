package testassign;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestCoins {
private int input;
private Boolean expected;
private Coins coins = null;
public TestCoins(int input, Boolean expected) {
	this.input = input;
	this.expected = expected;
}
@Before
public void steUp() {
	coins = new Coins();
}
@Parameters
public static Collection<Object[]> getData(){
	return Arrays.asList(new Object[][]{
		{23,true},
		{32,true},
		{84,false}, //大于总面额
		{83,true},
		{0,true}, //0 是可以拿出来的
		{13,true},
		{15,false}
		});
	}
@Test
public void testCoin() {
	assertEquals(this.expected, coins.ifGive(input));
}
}
