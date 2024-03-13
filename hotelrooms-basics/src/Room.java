public class Room {
    private int roomNumber;
    private String locatorName;
    private String locatorEmail;

    public int getRoomNumber() {
        return roomNumber;
    }
    @SuppressWarnings("unused")
    public String getLocatorEmail() {
        return locatorEmail;
    }

    @SuppressWarnings("unused")
    public String getLocatorName() {
        return locatorName;
    }

    public void setLocatorEmail(String locatorEmail) {
        this.locatorEmail = locatorEmail;
    }

    public void setLocatorName(String locatorName) {
        this.locatorName = locatorName;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String toString () {
        return roomNumber + ": " + locatorName + ", " + locatorEmail;
    }
}