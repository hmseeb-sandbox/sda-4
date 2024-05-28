public class RealDownload implements Download
{

    private String targetFile;
    private String targetData;

    public RealDownload(String targetFile)
    {
        this.targetFile = targetFile;
        downloadFromInternet();
    }

    private void downloadFromInternet()
    {
        this.targetData="This is a test data ";
    }

    @Override
    public void download()
    {
        System.out.println(this.targetData);
    }

}