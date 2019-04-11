import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class downloadFile extends ActionSupport{
    private String fileName;
    private  InputStream download;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setDownload(InputStream download) {
        this.download = download;
    }




    public InputStream getDownload() {
        //查看路径
        String FilePath = ServletActionContext.getServletContext().getRealPath("/upload/"+fileName);
        //输出信息查找问题
        System.out.println("FilePath "+FilePath);
        System.out.println("fileName "+fileName);
        download=ServletActionContext.getServletContext().getResourceAsStream("upload/"+fileName);
        return download;
    }

    public String execute(){

        return  SUCCESS;
    }
}