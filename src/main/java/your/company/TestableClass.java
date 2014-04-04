package your.company;

public class TestableClass {

	Dummy dummy;

	public TestableClass(Dummy dummy) {
		this.dummy = dummy;
	}

	public void bla() {
		dummy.dummyMethod();
	}
	
	public int saraza()
	{
		return Dummy.metodoStatic();
	}
	

}
