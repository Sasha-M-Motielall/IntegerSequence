import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  public ArraySequence(int[] other) {
    this.currentIndex = 0;
    this.data = new int[other.length];
    for (int i = 0; i < data.length; i++) {
      data[i] = other[i];
    }
  }

  public ArraySequence(IntegerSequence other) {
    this.currentIndex = 0;
    this.data = new int[other.length()];
    other.reset();
    for (int i = 0; i < data.length; i++) {
      data[i] = other.next();
    }other.reset();
  }

}
