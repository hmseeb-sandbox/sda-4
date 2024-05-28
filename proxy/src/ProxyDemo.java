public class ProxyDemo
{
    public static void main(String[] args)
    {
        Download download=new ProxyDownload("xyz.movie");
        download.download();
        System.out.println("");

        download.download();
    }
}