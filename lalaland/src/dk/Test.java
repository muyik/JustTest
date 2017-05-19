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
	System.out.println(HanLP.segment("��ã���ӭʹ��HanLP���ﴦ�����"));
	List termList =  StandardTokenizer.segment("��Ʒ�ͷ���");
	System.out.println(termList);
	*/
	
	
	Segment nShortSegment = new NShortSegment().enableCustomDictionary(false).enablePlaceRecognize(true).enableOrganizationRecognize(true);
	Segment shortestSegment = new DijkstraSegment().enableCustomDictionary(false).enablePlaceRecognize(true).enableOrganizationRecognize(true);
	String[] testCase = new String[]{
	        "���죬��־�����Ĺؼ�����,ɽ��Ů���˶��������ж���Ժ��ͥ����",
	        "��ϲ��ʯ�������������Ƚ��¼������ų�Ա",
	        };
	for (String sentence : testCase)
	{
	    System.out.println("N-��̷ִʣ�" + nShortSegment.seg(sentence) + "\n���·�ִʣ�" + shortestSegment.seg(sentence));
	}
}
}
