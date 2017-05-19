package dk;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;

public class CreateXml {
	 String encoding;
	 OutputStream out;
	CreateXml(String enc,OutputStream out){
		encoding=enc;
		this.out=out;
		if (encoding == null || !encoding.equals("UnicodeBig"))
        {
          this.encoding = "UTF8";
        }
	}
	public  void generateXML (ArrayList tcList) throws Exception{
		OutputStreamWriter osw = new OutputStreamWriter(out, encoding);
		 BufferedWriter bw = new BufferedWriter(osw);
         bw.write("<?xml version=\"1.0\" encoding=\"utf-8\" ?>");
         bw.newLine();
         bw.write("<testsuite id=\""+"5701"+"\" name=\""+"角色"+"\" >");
         bw.newLine();
         bw.write("<node_order><![CDATA[12]]></node_order>");
         bw.newLine();
         bw.write("<details><![CDATA[]]></details>");
         bw.newLine();
/*         bw.write("<testsuite id=\""+"5202"+"\" name=\"保养计划"+""+"\" >");
         bw.newLine();
         bw.write("<node_order><![CDATA[1]]></node_order>");
         bw.newLine();
         bw.write("<details><![CDATA[]]></details>");*/
         Iterator it= tcList.iterator();
         while(it.hasNext()){
         Txml txm=(Txml)it.next();
         bw.write("<testcase internalid=\""+txm.getInternalid()+"\" name=\""+txm.getName6()+"\">");
        // bw.newLine();
         //bw.write("<node_order><![CDATA["+txm.node_order7+"]]></node_order>");
         //bw.newLine();
         //bw.write("<externalid><![CDATA["+txm.getExternalid()+"]]></externalid>");
         bw.newLine();
         bw.write("<version><![CDATA["+txm.getVersion()+"]]></version>");
         bw.newLine();
         bw.write("<summary><![CDATA["+txm.getSummary()+"]]></summary>");
         bw.newLine();
         bw.write("<preconditions><![CDATA["+txm.getPreconditions()+"]]></preconditions>");
         bw.newLine();
         bw.write("<execution_type><![CDATA["+txm.getExecution_type()+"]]></execution_type>");
         bw.newLine();
         bw.write("<importance><![CDATA["+txm.getImportance()+"]]></importance>");
         bw.newLine();
         bw.write("<estimated_exec_duration></estimated_exec_duration>");
         bw.newLine();
         bw.write("<status>"+txm.getStatus()+"</status>");
         bw.newLine();
         bw.write("</testcase>");
         bw.newLine(); 	
         }
         bw.write("</testsuite>");
         bw.newLine();
/*         bw.write("</testsuite>");
         bw.newLine();*/
         bw.flush();
         bw.close();
	}
}
