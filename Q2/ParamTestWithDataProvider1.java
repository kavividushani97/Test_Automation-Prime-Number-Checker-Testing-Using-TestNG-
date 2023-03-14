import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamTestWithDataProvider1 {
	@DataProvider
	public static Object[][] PrimeNumbers()
	{
		return new Object[][] {{2, true}, {6, false}, {19, true}, {22, false}, {23, true}};
	}

	
	@Test(dataProvider = "PrimeNumbers")
	public void testPrimeNumberChecker(Integer inputNumber, Boolean expectedResult)
	{
		PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker();
		System.out.println(inputNumber + " " + expectedResult);
		Assert.assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
	}
}
