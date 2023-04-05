package src.cn.tedu.submarine;

/**
 * 加分的接口
 * 提供抽象的加分行為，具體由偵查、魚雷潛艇實現加分的細節
 */
public interface ScoreCalculate {
    int getScore();//加分的行為
}
