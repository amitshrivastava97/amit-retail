package test.resources;

import org.junit.Test;
import junit.framework.TestCase;

import com.Customer;
import com.Emp;
import com.Others;
import com.Vendor;

public class MainTest extends TestCase {

	private int actDiscountEmp;
	private int actDiscountVendor;	
	
	public MainTest(String testName) {
	super(testName);
	}
	
	protected void setUp() throws Exception {
	super.setUp();
	actDiscountEmp = 30;
	actDiscountVendor = 10;	
	System.out.println("actDiscount" + actDiscountEmp);
	}
	
	protected void tearDown() throws Exception {
	super.tearDown();
	actDiscountEmp = 0;
	System.out.println("actDiscount" + actDiscountEmp);
	}
	
	@Test
	public void testGetDiscountEmp() {
	int discount = (int) new Emp().getDiscount();
	assertEquals(discount, actDiscountEmp);
	}
	
	@Test
	public void testGetDiscountVendor()
	{
		actDiscountVendor = 10;
		int discount = (int) new Vendor().getDiscount();
		assertEquals(discount, actDiscountVendor);
	}
	
	@Test
	public void testGetDiscountCust()
	{
		int actDiscountCust = 5;
		int discount = (int) new Customer().getDiscount();
		assertEquals(discount, actDiscountCust);
	}
	
	@Test
	public void testGetDiscountOthers()
	{
		int actDiscountOthers = 45;
		int discount = (int) new Others().getDiscount();
		assertEquals(discount, actDiscountOthers);
	}
	@Test
	public void testbillAmtEmp()
	{	
		double billAmtExp = 693.0;
		double billAmt = new Emp().billAmt();
		assertEquals(billAmtExp, billAmt);
	}
	@Test
	public void testbillAmtVendor()
	{	
		double billAmtExp = 891.0;
		double billAmt = new Vendor().billAmt();
		assertEquals(billAmtExp, billAmt);
	}
	@Test
	public void testbillAmtCust()
	{	
		double billAmtExp = 940.5;
		double billAmt = new Customer().billAmt();
		assertEquals(billAmtExp, billAmt);
	}
	@Test
	public void testbillAmtOthers()
	{	
		double billAmtExp = 945.0;
		double billAmt = new Others().billAmt();
		assertEquals(billAmtExp, billAmt);
	}
}
