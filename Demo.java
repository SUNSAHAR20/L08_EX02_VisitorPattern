public class Demo {
    public static void main(String[] args) {
        WavFile wavFile = WavFile.read("Outpufile");
        // Apply noise reduction
        var noiseReductionFilter = new ReduceNoiseFilter();
        wavFile.applyFilter(noiseReductionFilter);

        // Apply reverb
        var reverbFilter = new ReverbFilter();
        wavFile.applyFilter(reverbFilter);

        // Apply normalization
        var normalizeFilter = new NormalizeFilter();
        wavFile.applyFilter(normalizeFilter);

    }
}
