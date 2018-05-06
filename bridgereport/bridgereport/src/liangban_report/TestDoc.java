package liangban_report;

import java.util.*;

public class TestDoc {
    public static void main(String[] args){
       
    	DocUtil docUtil=new DocUtil();
        Map<String, Object> dataMap=new HashMap<String, Object>();   
        List<LeftBan> leftBanList = new ArrayList<LeftBan>();
        List<RightBan> rightBanList = new ArrayList<RightBan>();
        
        LeftBan leftBan1 = new LeftBan();      	
        leftBan1.setIdL("原左-1-1#板");
        leftBan1.setSortL("裂缝");
        leftBan1.setDetailL("板底出现9条横向裂缝，长度/宽度为30~50cm/0.05~0.1mm");
        leftBan1.setRankL("2");
        leftBan1.setScoreL(65.0);
        leftBan1.setPsL("/");     
        leftBanList.add(leftBan1);
        
        LeftBan leftBan2 = new LeftBan();      	
        leftBan2.setIdL("原左-2-6#板");
        leftBan2.setSortL("渗水");
        leftBan2.setDetailL("板底出现渗水泛白，S=120X200cm2");
        leftBan2.setRankL("2");
        leftBan2.setScoreL(75.0);
        leftBan2.setPsL("/");     
        leftBanList.add(leftBan2);
                  	
        dataMap.put("leftBanList", leftBanList);
           
        RightBan rightBan1 = new RightBan();      	
        rightBan1.setIdR("原右-1-8#板");
        rightBan1.setSortR("裂缝"+"  "+"露筋");
        rightBan1.setDetailR("板底出现6条横向裂缝，长度/宽度为80~100cm/0.05mm，4处单根露筋L=40cm，1处区域露筋，S=20X20cm2");
        rightBan1.setRankR("2"+"   "+"2");
        rightBan1.setScoreR(62.4);
        rightBan1.setPsR("/");     
        rightBanList.add(rightBan1);
        
        RightBan rightBan2 = new RightBan();      	
        rightBan2.setIdR("原右-3-7#板");
        rightBan2.setSortR("破损");
        rightBan2.setDetailR("板底出现1处破损，S=120X150cm2");
        rightBan2.setRankR("3");
        rightBan2.setScoreR(60.0);
        rightBan2.setPsR("/");     
        rightBanList.add(rightBan2);
                
        dataMap.put("rightBanList", rightBanList);
       
        dataMap.put("leftPic1", docUtil.getImageStr("D:\\Img\\liefeng1.jpeg"));
        dataMap.put("leftPic2", docUtil.getImageStr("D:\\Img\\liefeng2.jpeg"));
        dataMap.put("rightPic1", docUtil.getImageStr("D:\\Img\\liefeng1.jpeg"));
        dataMap.put("rightPic2", docUtil.getImageStr("D:\\Img\\liefeng2.jpeg"));

        docUtil.createDoc(dataMap,"liangban","D:\\word\\liangban_report.doc");
    }
}