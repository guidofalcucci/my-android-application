package your.company;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)

public class ElTestLoco {

	@Mock
	Dummy dummy;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test() {
		TestableClass testableClass = new TestableClass(dummy);
		testableClass.bla();
		Mockito.verify(dummy).dummyMethod();
		assertTrue(true);
	}

	
	  @Test
	  @PrepareForTest(Dummy.class)
	public void staticTest() {
		PowerMockito.mockStatic(Dummy.class);
		Mockito.when(Dummy.metodoStatic()).thenReturn(2);
		int resultado = Dummy.metodoStatic();
		assertEquals(2, resultado);
	}

}
