import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FilesUpload extends ActionSupport {

    private List<File> upload;
    private List<String> uploadContentType;
    private List<String> uploadFileName;

    public List<File> getUpload() {
        return upload;
    }

    public List<String> getUploadContentType() {
        return uploadContentType;
    }

    public List<String> getUploadFileName() {
        return uploadFileName;
    }

    public void setUpload(List<File> upload) {
        this.upload = upload;
    }

    public void setUploadContentType(List<String> uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public void setUploadFileName(List<String> uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String execute() {
        //String realPath = ServletActionContext.getServletContext().getRealPath("/upload");
        for (int i = 0; i < upload.size(); i++) {
            try {
                //保存于本机的F:\\file的文件夹下
                File file = new File("F:\\file", uploadFileName.get(i));
                FileUtils.copyFile(upload.get(i), file);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return "success";

    }
}

