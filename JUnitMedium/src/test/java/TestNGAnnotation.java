import org.testng.annotations.*;

public class TestNGAnnotation {

    @BeforeSuite
    public void before_suite() {
        System.out.println("First method");
    }

    @AfterSuite
    public void after_suite() {
        System.out.println("Last method");

    }

    @BeforeTest
    public void before_test() {
        System.out.println("It will be executed first");
    }

    @AfterTest
    public void after_test() {
        System.out.println("After test execution..");
    }

    @BeforeClass
    public void before_class() {
        System.out.println("This method is executed before TestNGAnnotation");
    }

    @AfterClass
    public void after_class() {
        System.out.println("The above are the programming languages");
    }

    @BeforeMethod
    public void before_method() {
        System.out.println("This method will be invoked before every test method");
    }

    @AfterMethod
    public void after_method() {
        System.out.println("This method will be invoked after the execution of each test method");
    }

    @BeforeGroups("IT Department")
    public void before_it() {
        System.out.println("This method will be executed before the execution of IT Department group");
    }

    @Test
    public void testcase1() {
        System.out.println("HR");
    }

    @Test(groups = {"IT Department"})
    public void testcase2() {
        System.out.println("Software Developer");
    }

    @Test(groups = {"IT Department"})
    public void testcase3() {
        System.out.println("QA Analyst");
    }

    @AfterGroups("Testing tool")
    public void after_group() {
        System.out.println("The list which is shown above are the testing tools");
    }

    @Test(groups = {"Testing tool"})
    public void testcase4() {
        System.out.println("Appium");
    }

    @Test(groups = {"Testing tool"})
    public void testcase5() {
        System.out.println("JIRA");
    }

    @Test(groups = {"Testing tool"})
    public void testcase6() {
        System.out.println("RedMine");
    }
}
