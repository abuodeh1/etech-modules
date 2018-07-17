package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.suites.AuthoritySuite;
import test.suites.ProviderSuite;
import test.suites.UserSuite;

@RunWith(Suite.class)
@SuiteClasses({
	AuthoritySuite.class,
	ProviderSuite.class,
	UserSuite.class
})
public class Tests {}
