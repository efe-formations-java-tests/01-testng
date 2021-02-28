	
	package fr.formation;
	
	import static org.testng.Assert.assertEquals;
	
	import java.util.ArrayList;
	import java.util.List;
	
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	
	public class CycleDeVieTest {
	
		private static List<Integer> numbers;
	
		@BeforeClass
		public static void initialize() {
			numbers = new ArrayList<>();
		}
	
		@AfterClass
		public static void tearDown() {
			numbers = null;
		}
	
		@BeforeMethod
		public void runBeforeEachTest() {
			numbers.add(1);
			numbers.add(2);
			numbers.add(3);
		}
	
		@AfterMethod
		public void runAfterEachTest() {
			numbers.clear();
		}
	
		@Test
		public void testTaille() {
			assertEquals(3, numbers.size());
		}
	}

	