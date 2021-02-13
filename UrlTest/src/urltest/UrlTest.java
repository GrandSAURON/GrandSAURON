package urltest;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

class Application{
    public void AppRun() throws IOException{
        try{
            
            final String S_FIRST_URL = "http://mosbudokan.ru/other.html";
            final String S_SEC_URL = "http://mosbudokan.ru/shotokan/shoto1.html";
            
            URL firstUrl = new URL(S_FIRST_URL);
            InputStream srcStream = firstUrl.openStream();
            URL secondUrl = new URL(S_SEC_URL);
            InputStream cmpStream = secondUrl.openStream();
 
            int chSrc                = 0;
            int chCmp                = 0;
            int iCounter             = 0;
            boolean bFlag            = false;
            final int I_MAX_SYMBOLS  = 10;
            final int I_END_URL_PAGE = -1;

            while (!(chCmp == I_END_URL_PAGE && chSrc == I_END_URL_PAGE)){
                chCmp = srcStream.read();
                chSrc = cmpStream.read();
                
                if(chSrc != chCmp){
                    if(iCounter < I_MAX_SYMBOLS){
                        System.out.printf("%s != %s\n",(chSrc == I_END_URL_PAGE)
                                ? "None": (char)chSrc, (chCmp == I_END_URL_PAGE) 
                                        ? "None": (char)chCmp);
                        iCounter++;
                    }else{
                        iCounter++;
                        bFlag = true;
                    }
                }
            }
            if(bFlag == true){
                System.out.printf("Number of differences = %d\n", iCounter);
            }
        }catch (IOException ioe){
            
        }
        return;
    }
}

public class UrlTest {

    public static void main(String[] args) throws IOException {
        Application mainApp = new Application();
        mainApp.AppRun();
    }
}
