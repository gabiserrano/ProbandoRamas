import java.util.List;

public class ApartmentIterator implements ResidentIterator {
    private List<Resident> residents;
    private int position;

    public ApartmentIterator(List<Resident> residents) {
        this.residents = residents;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < residents.size();
    }

    @Override
    public Resident next() {
        Resident resident = residents.get(position);
        position++;
        return resident;
    }
}
