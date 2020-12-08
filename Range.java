import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start, end, current;

  public Range(int start, int end){
    if(end < start){
      throw new IllegalArgumentException("end can not be greater than start.");
    }
    else
    this.start = start;
    this.end = end;
    this.current = start;
  }
}
