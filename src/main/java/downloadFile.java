import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class downloadFile extends ActionSupport{
    private String temp;
    private String fileName;
    private  InputStream download;



    public String getFileName() {
        return fileName;
    }

    public String getTemp() {
        return temp;
    }

    public void setDownload(InputStream download) {
        this.download = download;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public InputStream getDownload() throws FileNotFoundException {

        String FilePath = ServletActionContext.getServletContext().getRealPath("/upload/"+temp);


        System.out.println("FilePath "+FilePath);
        System.out.println("fileName "+temp);

        download=ServletActionContext.getServletContext().getResourceAsStream("upload/"+temp);
        System.out.println(download);
        return download;

    }

    public String execute() throws UnsupportedEncodingException {

        //解决中文不能显示
        fileName=new String (temp.getBytes("UTF-8"),"ISO_8859_1");

        return  SUCCESS;
    }
}