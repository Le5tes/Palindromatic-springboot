package com.palindromatic.palidromaticservice;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PalidromaticServiceApplicationTests {

	@Test
	public void palindromaticCheckReturnsTrueIfInputIsPalindrom() {
        PalidromaticServiceApplication myPalindromatic = new PalidromaticServiceApplication();

        Assert.assertTrue(myPalindromatic.check("hihih"));
//        Assert.assertFalse(myPalindromatic.check("hihi"));

	}

}
