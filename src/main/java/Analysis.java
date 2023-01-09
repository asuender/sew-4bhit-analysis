import java.util.Arrays;

/**
 * @author Andreas Suender
 * @version 01-09-2023
 */
public class Analysis {
    private int[] dataset;
    private AnalysisInterface algorithm;

    public Analysis(int[] dataset, AnalysisInterface algorithm) {
        this.dataset = dataset;
        this.algorithm = algorithm;
    }

    public int[] getDataset() {
        return dataset;
    }

    public void setDataset(int[] dataset) {
        this.dataset = dataset;
    }

    public AnalysisInterface getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(AnalysisInterface algorithm) {
        this.algorithm = algorithm;
    }

    public int[] sortDataset() {
        algorithm.sortDataset(this.dataset);
        return this.dataset;
    }

    public int getMaximum() {
        this.algorithm.sortDataset(this.dataset);
        return this.dataset[this.dataset.length-1];
    }

    public int getMinimum() {
        this.algorithm.sortDataset(this.dataset);
        return this.dataset[0];
    }

    public int getMedian() {
        // bei einer ungeraden Anzahl von Elementen
        // entspricht der Median dem Mittelwert der beiden mittleren Elemente
        if (this.dataset.length % 2 == 0) {
            int index1 = this.dataset.length / 2, index2 = index1 - 1;
            return (this.dataset[index1] + this.dataset[index2]) / 2;
        } else {
            int index = this.dataset.length / 2;
            return this.dataset[index];
        }
    }
}
