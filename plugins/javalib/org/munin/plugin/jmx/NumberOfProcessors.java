package org.munin.plugin.jmx;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

import com.sun.management.OperatingSystemMXBean;
public class NumberOfProcessors 
{
	public static void main(String args[])
	{
	
		 OperatingSystemMXBean osmxbean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
		int av=osmxbean.getAvailableProcessors(); //  Returns the number of processors available to the Java virtual machine.
	     System.out.print(av+"\n");
	}


}
