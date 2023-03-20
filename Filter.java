public interface Filter {
    void visit(FormatSegment segment);
    void visit(FactSegment segment);   
}
