public class ProxyDownload implements Download
{

    private RealDownload realDownload;
    private String targetFile;

    public ProxyDownload(String targetFile)
    {
        this.targetFile=targetFile;
    }

    @Override
    public void download()
    {
        if(realDownload==null)
        {
            realDownload=new RealDownload(targetFile);
        }
        realDownload.download();
    }

}