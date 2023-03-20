public class FormatSegment extends Segment {
    public void accept(Filter filter) {
        filter.visit(this);
    }
}
