public class FactSegment extends Segment {
    public void accept(Filter filter) {
        filter.visit(this);
    }
}
