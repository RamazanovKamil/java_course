package tatar.companiese.kamil.model;

public enum StudentStatus {
    ACTIVE(1), EXPELLED(0);

    //Далее создаем поле и конструктор к нему для того, чтобы можно было обращаться к перечислению по Id:
    private int statusId;

    StudentStatus(int statusId) {
        this.statusId = statusId;
    }
    public int getStatusId() {
        return statusId;
    }
    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
}
