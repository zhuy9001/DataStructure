package iteratormode;

/**
 * @Title: DinnerMenuIterator.java
 * @Package iteratormode
 * @Description: TODO
 * @author zhuy
 * @date 2017年2月22日 下午4:44:34
 * @version V1.0
 */
public class DinnerMenuIterator implements java.util.Iterator {

	MenuItem[] items;
	int index = 0;

	public DinnerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (index > items.length || items[index] == null) {
          return false;
		}
		return true;
	}

	@Override
	public Object next() {
		MenuItem item=items[index];
		index++;
		return item;
	}

	@Override
	public void remove() {

        if (index <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if (items[index - 1] != null) {
            for (int i = index-1; i < (items.length - 1); i++) {
                items[i] = items[i + 1];
            }
            items[items.length - 1] = null;
        }
		
	}

}
