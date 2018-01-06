package com.testng.execution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

import org.testng.annotations.Test;

public class webRunner {
	@Test
	public void Register() throws FileNotFoundException, IOException{
	Properties p = new Properties ();
	p.load(new FileInputStream("Web.properties"));
	
}
}
