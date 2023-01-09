import java.util.Arrays;

/**
 * @author Andreas Suender
 * @version 01-09-2023
 */
public class ParallelAnalysis implements AnalysisInterface {
    @Override
    public void sortDataset(int[] dataset) {
        Arrays.parallelSort(dataset);
    }
}
