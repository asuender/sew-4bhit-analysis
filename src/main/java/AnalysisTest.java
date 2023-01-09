/**
 * @author Andreas Suender
 * @version 01-09-2023
 */
public class AnalysisTest {
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] dataset = new int[]{50, 4, 18, 9, 150, 46, 3, 17, 38};
        System.out.print("Dataset: "); printArray(dataset);

        Analysis standardAnalysis = new Analysis(dataset, new StandardAnalysis());
        Analysis parallelAnalysis = new Analysis(dataset, new ParallelAnalysis());

        System.out.println("Standard Analysis:");
        System.out.print("Sorted:  "); printArray(standardAnalysis.sortDataset());
        System.out.println("Maximum: " + standardAnalysis.getMaximum());
        System.out.println("Minimum: " + standardAnalysis.getMinimum());
        System.out.println("Median: " + standardAnalysis.getMedian());

        System.out.println("Parallel Analysis:");
        System.out.print("Sorted:  "); printArray(parallelAnalysis.sortDataset());
        System.out.println("Maximum: " + parallelAnalysis.getMaximum());
        System.out.println("Minimum: " + parallelAnalysis.getMinimum());
        System.out.println("Median: " + parallelAnalysis.getMedian());

        System.out.println("Changing dataset...");

        dataset = new int[]{50, 4, 18, 9, 150, 46, 3, 17, 38, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Dataset: "); printArray(dataset);

        standardAnalysis.setDataset(dataset);
        parallelAnalysis.setDataset(dataset);

        System.out.println("Standard Analysis:");
        System.out.print("Sorted:  "); printArray(standardAnalysis.sortDataset());
        System.out.println("Maximum: " + standardAnalysis.getMaximum());
        System.out.println("Minimum: " + standardAnalysis.getMinimum());
        System.out.println("Median: " + standardAnalysis.getMedian());

        System.out.println("Parallel Analysis:");
        System.out.print("Sorted:  "); printArray(parallelAnalysis.sortDataset());
        System.out.println("Maximum: " + parallelAnalysis.getMaximum());
        System.out.println("Minimum: " + parallelAnalysis.getMinimum());
        System.out.println("Median: " + parallelAnalysis.getMedian());
    }
}
