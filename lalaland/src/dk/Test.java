package dk;


import java.util.List;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.Segment;
import com.hankcs.hanlp.seg.Dijkstra.DijkstraSegment;
import com.hankcs.hanlp.seg.NShort.NShortSegment;
import com.hankcs.hanlp.tokenizer.StandardTokenizer;

public class Test {
public static void main(String[] args) {
/*	System.out.println("hellOworld");
	System.out.println(HanLP.segment("你好，欢迎使用HanLP汉语处理包！"));
	List termList =  StandardTokenizer.segment("商品和服务");
	System.out.println(termList);
	*/
	
	
	Segment nShortSegment = new NShortSegment().enableCustomDictionary(false).enablePlaceRecognize(true).enableOrganizationRecognize(true);
	Segment shortestSegment = new DijkstraSegment().enableCustomDictionary(false).enablePlaceRecognize(true).enableOrganizationRecognize(true);
	String[] testCase = new String[]{
	        "今天，刘志军案的关键人物,山西女商人丁书苗在市二中院出庭受审。",
	        "刘喜杰石国祥会见吴亚琴先进事迹报告团成员",
	        };
	for (String sentence : testCase)
	{
	    System.out.println("N-最短分词：" + nShortSegment.seg(sentence) + "\n最短路分词：" + shortestSegment.seg(sentence));
	}
}
}
