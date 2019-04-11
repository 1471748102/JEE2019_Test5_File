import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;



public class FileUpload extends ActionSupport {

    File upload;

    String uploadContentType;

    String uploadFileName;

    public File getUpload() {
        return upload;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String execute() {
        System.out.println("contentType:" + this.getUploadContentType());
        System.out.println("File:" + this.getUpload());
        System.out.println("filename:" + this.getUploadFileName());
       // String realPath = ServletActionContext.getServletContext().getRealPath("upload");
      //  System.out.println("realPath:" + realPath);
        File file = new File("F:\\file",uploadFileName);
        // if(!file.exists())  file.mkdirs();
        try
        {
            FileUtils.copyFile(upload,new File(file,uploadFileName));
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        return "success";
    }

}