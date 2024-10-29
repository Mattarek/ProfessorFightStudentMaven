package overriding;

public class CombinedClass implements InterfaceTwo, InterfaceOne {

	@Override
	public void commonMethod() {
		InterfaceOne.super.commonMethod();
	}
}