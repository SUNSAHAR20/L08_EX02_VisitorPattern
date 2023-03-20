public class ReverbFilter implements Filter {
    public void visit(FormatSegment segment) {
        // Implement noise reduction for FormatSegment
        System.out.println("Add reverb in Format Segment");
    }
    public void visit(FactSegment segment) {
        // Implement noise reduction for FactSegment
        System.out.println("Add reverb in Fact Segment");
    }
    
}
