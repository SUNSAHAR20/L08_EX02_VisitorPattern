public class NormalizeFilter implements Filter {
    public void visit(FormatSegment segment) {
        // Implement noise reduction for FormatSegment
        System.out.println("Normalize in Format Segment");
    }
    public void visit(FactSegment segment) {
        // Implement noise reduction for FactSegment
        System.out.println("Normalize in Fact Segment");
    }
    
}
