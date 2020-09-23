package Lab6;

import java.util.StringTokenizer;

public class Example_StringToken {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("" +
                "การทำงานของเมาส์ ภายในตัวเมาส์จะมีอุปกรณ์สำหรับตรวจจับตำแหน่งการเคลื่อนไหวของลูกกลิ้งยาง(สำหรับรุ่นเก่า)" +
                "หรืออุปกรณ์ตรวจจับการเปลี่ยนแปลงของแสง (ในเมาส์ที่ใช้แอลอีดีหรือเลเซอร์เป็นแหล่งกำเนิดแสง)" +
                " โดยตัวตรวจจับจะส่งสัญญาณไปที่คอมพิวเตอร์เพื่อแสดงผลของตัวชี้บนหน้าจอคอมพิวเตอร์");
        StringTokenizer strToken = new StringTokenizer(str.toString());
        int countWord = strToken.countTokens();
        System.out.println("Word count: "+countWord);

        while (strToken.hasMoreTokens()){
            System.out.println(strToken.nextToken());
        }

    }
}
