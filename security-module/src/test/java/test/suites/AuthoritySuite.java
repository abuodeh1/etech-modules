package test.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.authority.DeletionTest;
import test.authority.InsertionTest;
import test.authority.QueriesTest;

@RunWith(Suite.class)
@SuiteClasses({ InsertionTest.class, QueriesTest.class, DeletionTest.class })
public class AuthoritySuite {
	
}
