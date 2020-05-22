public class Complaint {

    private int id;
    private String name;
    private String message;

    public Complaint(int id, String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Complaint)) {
            return false;
        }

        Complaint otherComplaint = (Complaint) obj;

        return this.getId() == otherComplaint.getId() &&
                this.getMessage().equals(otherComplaint.getMessage());
    }

    @Override
    public String toString() {
        return String.format("Id: %s, Name: %s, Message: %s",
                this.getId(), this.getName(), this.getMessage());
    }
}
