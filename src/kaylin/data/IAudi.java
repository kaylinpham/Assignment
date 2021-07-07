package kaylin.data;

public interface IAudi {
    void addAudi(Audi a);

    Audi findAudiByID(int id);

    void updateAudi(Audi a);

    void printAudiList();
}
