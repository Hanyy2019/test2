package test2;

import java.io.BufferedReader;
import java.io.FileReader; 
import java.io.IOException;  
import java.util.Map;
import java.util.Scanner; 
import java.util.TreeMap;
import java.io.IOException;
public class Main { 
	static Scanner in = new Scanner(System.in);
    public static void main(String[] args)throws IOException{  
    	Map<String, Integer> map = new TreeMap<String, Integer>();
    	// 读取要处理的文件，并将它放在b中
    	System.out.println("***************英文文本词频统计软件****************");    	
    	System.out.println("请选择你需要实现的功能序号:");
    	System.out.println("1、读取文本");
    	System.out.println("2、显示所要查询的单词词频");
    	System.out.println("3、输出词频最高的前k个单词");
    	System.out.println("4、统计该文本所有单词数量及词频数，并将单词及词频数按字典顺序输出到文件result.txt");
    	System.out.println("0、退出");
    	System.out.println("*****************************************************");  
    	int y= in.nextInt();  
    	int i=0;
    	while(y!=0){ 
    		if(i==0 && y==2 || i==0 && y==3 || i==0 && y==4)
    		{
    			System.out.println("没有输入文本内容！");
    			y=1;
    		}
    		switch(y){
    			case 1:{
    				System.out.println("请输入文本名称：");
                	String src = in.next();
                	wordcount wc = new wordcount();
                	map = wc.read(src);
                	if(map.size()==0)
                	{
                		System.out.println("文件中文本内容为空，请重新选择功能1进行文件读取！");
                	}
                	i++;
                	break;
    			}
    			case 2:{
    				wordcount res = new wordcount();
    				res.histogram(map);
    				i++;
    			}
    			break;
    			case 3:{
    				wordcount res = new wordcount();
    				res.HighWord(map);
    				i++;
    			} 
    			break;
    			case 4:{
    				wordcount res = new wordcount();
    				res. output(map);
    				i++;
    			}
    			break;
    		}
    		System.out.println("chose function:");
    		y= in.nextInt();  
    	}
    }    
}