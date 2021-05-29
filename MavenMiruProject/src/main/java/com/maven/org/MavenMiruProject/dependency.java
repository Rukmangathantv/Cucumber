package com.maven.org.MavenMiruProject;

import org.testng.annotations.Test;

public class dependency {
	
	@Test(dependsOnMethods = "f")
	private void a() {
		System.out.println("test case a");
	}
	@Test(dependsOnMethods = "e")
	private void b() {
		System.out.println("test case b");
	}
	@Test(dependsOnMethods = "d")
	private void c() {
		System.out.println("test case c");
	}
	@Test
	private void d() {
		System.out.println("test case d");
	}
	@Test
	private void e() {
		System.out.println("test case e");
	}
	@Test
	private void f() {
		System.out.println("test case f");
	}
}
