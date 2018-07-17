package test.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.provider.DeletionTest;
import test.provider.InsertionTest;
import test.provider.QueriesTest;

@RunWith(Suite.class)
@SuiteClasses({ InsertionTest.class, QueriesTest.class, DeletionTest.class })
public class ProviderSuite {
	
}
