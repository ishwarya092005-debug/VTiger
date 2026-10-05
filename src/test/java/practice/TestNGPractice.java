package practice;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(genericUtility.ListenersImplementation.class)
public class TestNGPractice {
	
	@Test
	public void ishuMrng() {
		System.out.println("Goodmorning vishnu");
	}
    @Test
	public void ishuEat() {
		System.out.println("i like to eat vishnu");
	}
	@Test
	public void ishuChat() {
		System.out.println("where are you vishnu");
	}
	@Test
	public void ishuout() {
		System.out.println("i like to visit temple with vishnu");
	}
	@Test
	public void ishufavfood() {
		System.out.println("my fav panipuri");
	}
	@Test
	public void ishunight() {
		System.out.println("Goodnight vishnu");
	}
}


