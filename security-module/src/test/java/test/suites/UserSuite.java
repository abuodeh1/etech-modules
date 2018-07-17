package test.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.user.DeletionTest;
import test.user.InsertionTest;
import test.user.QueriesTest;

@RunWith(Suite.class)
@SuiteClasses({ InsertionTest.class, QueriesTest.class, DeletionTest.class })
public class UserSuite {
	
}
