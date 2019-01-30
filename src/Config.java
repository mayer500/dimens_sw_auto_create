/**
 * Created by adaJQD on 2017/1/12.
 */
public class Config {
    //需要适配的设备配置 宽度
//    public final static int[] supportDevices = { 384,392,400,410,411,480,533,592,600,640,662,720,768,800,811,820,960,961,1024,1280,1365 }; //values-w300dp
//    public final static int[] supportDevices = { 300,310,320,330,360,370,375,380,384,400,432,480,533,600,720}; //values-sw375dp
//    public final static int[] supportDevices = {300, 310, 320, 330, 340, 350, 360, 370, 380, 390, 400, 411, 420, 432, 440, 450, 460, 470, 480, 490, 500, 520, 553, 570, 600, 620}; //TODO 自用
    public final static int[] supportDevices = {300, 320, 340, 360, 370, 400, 420, 450, 480, 520, 600, 620};
    //对应宽度的比例
    public final static Float[] supportScale = { 1.0667f,1.0889f,1.1111f,1.1389f,1.1417f,1.3333f,1.4806f,1.6444f,1.6667f,1.7778f,1.8389f,2.0000f,2.1333f,2.2222f,2.2528f,2.2778f,2.6667f,2.6694f,2.8444f,3.5556f,3.7917f }; //values-w300dp
//    public final static Float[] supportScale = { 0.8f,0.8267f,0.8533f,0.88f,0.96f,0.9867f,1f,1.013f,1.024f,1.067f,1.152f,1.28f,1.421f,1.6f,1.92f }; //values-sw375dp


    //dimens.xml 计算基础 1280dp
    public final static int defaultValue = 320;

    //values 文件夹路径 。默认在此路径下存放dimens.xml
//    public final static String path = "C:\\Users\\Administrator\\Desktop\\a"; //绝对地址
    public final static String path = "src\\dimens";                 //相对文件地址

}

//
//1.0667f
//,1.0889f
//,1.1111f
//,1.1389f
//,1.1417f
//,1.3333f
//,1.4806f
//,1.6444f
//,1.6667f
//,1.7778f
//,1.8389f
//,2.0000f
//,2.1333f
//,2.2222f
//,2.2528f
//,2.2778f
//,2.6667f
//,2.6694f
//,2.8444f
//,3.5556f
//,3.7917f

