package ����;
import java.net.InetAddress;


public class test {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         
        try{
            // ���̹��� IP ������ ���
            InetAddress [] ia = InetAddress.getAllByName("naver.com");
            for(InetAddress imsi : ia){
                System.out.println(" naver IP : "+imsi.getHostAddress());
            }
            // �ڽ��� IP ���
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("My PC IP :" + local.getHostAddress());
             
        }catch(Exception e){
            // ���ܰ� �߻����� �� ������ ������ ���
            System.out.println(e.getMessage());
        }
 
    }
 
}


//ó: https://ddoriya.tistory.com/entry/JAVA-�ڽ���-ip-Ȯ��-��-IP-��� [�Ǹ��� ��������]