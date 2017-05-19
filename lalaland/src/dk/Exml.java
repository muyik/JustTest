package dk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/*import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;*/



public class Exml {
public static void main(String[] args) throws Exception {
	String encoding="UTF8";
	File fi=new File("C:"+File.separator+"Users"+File.separator+"dk"+File.separator+"Desktop"+File.separator+"Testcase"+File.separator+"tc1.xls");
	File fo=new File("C:"+File.separator+"Users"+File.separator+"dk"+File.separator+"Desktop"+File.separator+"Testcase"+File.separator+"role.xml");
	FileOutputStream  out= new FileOutputStream(fo);
	
	FileInputStream fis=new FileInputStream(fi);
	Workbook wb=Workbook.getWorkbook(fi);
	Sheet st=wb.getSheet(4);
	int rowNum=st.getRows();
	int colNum=st.getColumns();
	ArrayList tcList=new ArrayList();
	Cell [] title =null;
	for (int i = 0; i < rowNum; i++) {
		if(i==0){
			title=st.getRow(i);
		}else{
			Cell [] rowContent=st.getRow(i);			
			Txml txm=paserUnit(title,rowContent);
			tcList.add(txm);
		}
	}
	CreateXml cx=new CreateXml("utf-8",out);
	cx.generateXML(tcList);
	System.out.println("hello");
}
public static Txml paserUnit(Cell [] title,Cell [] rowContent){
	 ArrayList titlelist = new ArrayList();
	 Txml txm=new Txml();
     for (int i = 0; i < rowContent.length; i++) {
		Cell txmCell=title[i];
		String txmc=txmCell.getContents();
		Cell cellContent=rowContent[i];
		String cellCon=cellContent.getContents();
		if(Texcel.ID_VALUE.equals(txmc)){
			txm.setId(validateInteger(cellCon));
		}
		if(Texcel.NAME_VALUE.equals(txmc)){
			txm.setName(cellCon);
		}
		if(Texcel.NODE_ORDER_VALUE.equals(txmc)){
			txm.setNode_order(validateInteger(cellCon));
		}
		if(Texcel.DETAILS_VALUE.equals(txmc)){
			txm.setDetails(cellCon);
		}
		if(Texcel.ID2_VALUE.equals(txmc)){
			txm.setId2(validateInteger(cellCon));
		}
		if(Texcel.NAME3_VALUE.equals(txmc)){
			txm.setName3(cellCon);
		}
		if(Texcel.NODE_ORDER4_VALUE.equals(txmc)){
			txm.setNode_order4(validateInteger(cellCon));
		}
		if(Texcel.DETAILS5_VALUE.equals(txmc)){
			txm.setDetails5(cellCon);
		}
		if(Texcel.INTERNALID_VALUE.equals(txmc)){
			txm.setInternalid(validateInteger(cellCon));
		}
		if(Texcel.NAME6_VALUE.equals(txmc)){
			txm.setName6(cellCon);
		}
		if(Texcel.NODE_ORDER7_VALUE.equals(txmc)){
			txm.setNode_order7(validateInteger(cellCon));
		}
		if(Texcel.EXTERNALID_VALUE.equals(txmc)){
			txm.setExternalid(validateInteger(cellCon));
		}
		if(Texcel.VERSION_VALUE.equals(txmc)){
			txm.setVersion(validateInteger(cellCon));
		}
		if(Texcel.SUMMARY_VALUE.equals(txmc)){
			txm.setSummary(cellCon);
		}
		if(Texcel.PRECONDITIONS_VALUE.equals(txmc)){
			txm.setPreconditions(cellCon);
		}
		if(Texcel.EXCUTION_TYPE_VALUE.equals(txmc)){
			txm.setExecution_type(validateInteger(cellCon));
		}
		if(Texcel.IMPORTANCE_VALUE.equals(txmc)){
			txm.setImportance(validateInteger(cellCon));
		}
		if(Texcel.ESTIMATED_EXEC_DURATION_VALUE.equals(txmc)){
			txm.setEstimated_exec_duration(cellCon);
		}
		if(Texcel.STATUS_VALUE.equals(txmc)){
			txm.setStatus(validateInteger(cellCon));
		}
	}
     return txm;
}
public static  Integer validateInteger(String str){
    Integer result = null;
    if(str == null || str.equals("")) {
        result = new Integer("0");
        return result;
    } else {
        return new Integer(str);
    }
    
}

}
