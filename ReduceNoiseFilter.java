public class ReduceNoiseFilter implements Filter {
    public void visit(FormatSegment segment) {
        // Implement noise reduction for FormatSegment
        System.out.println("Reduce Noise in Format Segment");
    }
    public void visit(FactSegment segment) {
        // Implement noise reduction for FactSegment
        System.out.println("Reduce Noise in Fact Segment");
    }
    
}
